package net.guwy.rstm.block.custom.machines.generators.alternating_redstone;

import net.guwy.rstm.block.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraftforge.energy.EnergyStorage;
import org.jetbrains.annotations.Nullable;

public class GeneratorAlternatingRedstoneBlock extends BaseEntityBlock {

    public GeneratorAlternatingRedstoneBlock(Properties properties) {
        super(properties);
    }

    public EnergyStorage energyStorage = new EnergyStorage(5, 0, 5, 5);
    public static final BooleanProperty CHARGED = BooleanProperty.create("charged");
    public static final BooleanProperty ACTIVATED = BooleanProperty.create("activated");



    @Override
    public boolean canConnectRedstone(BlockState state, BlockGetter level, BlockPos pos, @Nullable Direction direction) {
        return true;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new GeneratorAlternatingRedstoneBlockEntity(pPos, pState);
    }

    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

    /** Calls the tick function in the BlockEntity Class of this block **/
    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level pLevel, BlockState pState, BlockEntityType<T> pBlockEntityType) {
        return createTickerHelper(pBlockEntityType, ModBlockEntities.GENERATOR_ALTERNATING_REDSTONE_BLOCK_ENTITY.get(),
                GeneratorAlternatingRedstoneBlockEntity::tick);
    }

    /** Sets the default BlockStates for this block **/
    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        return this.defaultBlockState().setValue(ACTIVATED, false).setValue(CHARGED, false);
    }

    @Override
    public void neighborChanged(BlockState pState, Level pLevel, BlockPos pPos, Block pBlock, BlockPos pFromPos, boolean pIsMoving) {
        if  (!pLevel.isClientSide)  {
            boolean charge = pState.getValue(CHARGED);
            boolean active = pState.getValue(ACTIVATED);
            if (pLevel.hasNeighborSignal(pPos) && !active) {        // Checks for Redstone Signal and processes it according to
                                                                                        // the "ACTIVATED" BlockState

                pLevel.setBlock(pPos, pState.                                   // You have to write all the BlockStates in here or else
                        setValue(ACTIVATED, true).                       // the ones you didn't write will revert to their default
                        setValue(CHARGED, true),
                        2);
            }   else if (!pLevel.hasNeighborSignal(pPos) && active)  {

                pLevel.setBlock(pPos, pState.
                        setValue(ACTIVATED,false).
                        setValue(CHARGED, charge),
                        3);
            }
        }
    }

    /** Adds the BlockStates to this block **/
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(ACTIVATED);
        pBuilder.add(CHARGED);
    }
}
