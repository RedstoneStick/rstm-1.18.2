package net.guwy.rstm.block.entity.custom;

import net.guwy.rstm.block.custom.machines.generators.alternating_redstone.GeneratorAlternatingRedstoneBlock;
import net.guwy.rstm.block.entity.ModBlockEntities;
import net.guwy.rstm.util.ModEnergyStorage;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.IEnergyStorage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.atomic.AtomicInteger;

public class GeneratorAlternatingRedstoneBlockEntity extends BlockEntity {

    public static final BooleanProperty CHARGED = GeneratorAlternatingRedstoneBlock.CHARGED;
    public static final BooleanProperty ACTIVATED = GeneratorAlternatingRedstoneBlock.ACTIVATED;

    public static final int POWER_CAPACITY = 30;
    public static final int POWER_GEN = 10;
    public static final int POWER_SEND = 30;

    private final ModEnergyStorage ENERGY_STORAGE = new ModEnergyStorage(POWER_CAPACITY, 0, POWER_SEND) {
        @Override
        public void onEnergyChanged() {
            setChanged();
        }
    };

    private LazyOptional<IEnergyStorage> lazyEnergyHandler = LazyOptional.empty();

    public IEnergyStorage getEnergyStorage() {
        return ENERGY_STORAGE;
    }

    public void setEnergyLevel(int energy) {
        this.ENERGY_STORAGE.setEnergy(energy);
    }

    @NotNull
    @Override
    public <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        if(cap == CapabilityEnergy.ENERGY) {
            return lazyEnergyHandler.cast();
        }
        return super.getCapability(cap, side);
    }

    @Override
    public void onLoad() {
        super.onLoad();
        lazyEnergyHandler = LazyOptional.of(() -> ENERGY_STORAGE);
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        lazyEnergyHandler.invalidate();
    }

    @Override
    protected void saveAdditional(CompoundTag pTag) {
        pTag.putInt("generator_alternating_redstone.energy", ENERGY_STORAGE.getEnergyStored());
        super.saveAdditional(pTag);
    }

    @Override
    public void load(CompoundTag pTag) {
        super.load(pTag);
        ENERGY_STORAGE.setEnergy(pTag.getInt("generator_alternating_redstone.energy"));
    }

    public GeneratorAlternatingRedstoneBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(ModBlockEntities.GENERATOR_ALTERNATING_REDSTONE_BLOCK_ENTITY.get(), pWorldPosition, pBlockState);
    }

    /** You have to invalidate capabilities
     * when the block is removed from the world  **/
    @Override
    public void setRemoved() {
        super.setRemoved();
        lazyEnergyHandler.invalidate();
    }


    public static void tick(Level pLevel, BlockPos pPos, BlockState pState, GeneratorAlternatingRedstoneBlockEntity pEntity) {
        if(pLevel.isClientSide()) {
            return;
        }

        sendOutEnergy(pLevel, pPos, pState, pEntity);

        if(isCharged(pEntity)) {
            pEntity.setEnergyLevel(Math.min((pEntity.ENERGY_STORAGE.getEnergyStored() + POWER_GEN), POWER_CAPACITY));

            pLevel.setBlock(pPos, pState
                    .setValue(ACTIVATED, pState.getValue(ACTIVATED))
                    .setValue(CHARGED, false)
                    , 2);
        }



    }

    private static boolean isCharged(GeneratorAlternatingRedstoneBlockEntity pEntity) {
        return pEntity.getBlockState().getValue(CHARGED);
    }

    private static void extractEnergy(GeneratorAlternatingRedstoneBlockEntity pEntity) {
        pEntity.ENERGY_STORAGE.extractEnergy(POWER_SEND, false);
    }



    private static void sendOutEnergy(Level pLevel, BlockPos pPos, BlockState pState, GeneratorAlternatingRedstoneBlockEntity pEntity) {
        AtomicInteger energy = new AtomicInteger(pEntity.ENERGY_STORAGE.getEnergyStored());

        if (energy.get() > 0) {
            for (Direction direction : Direction.values()) {
                BlockEntity neighbor = pLevel.getBlockEntity(pPos.relative(direction));
                if (neighbor != null) {

                    boolean doContinue = neighbor.getCapability(CapabilityEnergy.ENERGY, direction.getOpposite()).map(handler -> {
                        if (handler.canReceive())   {
                            int recieved = handler.receiveEnergy(Math.min(energy.get(), POWER_SEND), false);
                            energy.addAndGet(-recieved);
                            pEntity.ENERGY_STORAGE.extractEnergy(recieved, false);
                            return energy.get() > 0;
                        }   else {
                            return true;
                        }
                    }).orElse(true);
                    if  (!doContinue)   {
                        return;
                    }
                }
            }
        }

    }

}