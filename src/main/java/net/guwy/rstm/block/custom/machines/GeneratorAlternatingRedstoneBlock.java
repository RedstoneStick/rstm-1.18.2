package net.guwy.rstm.block.custom.machines;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.energy.EnergyStorage;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class GeneratorAlternatingRedstoneBlock extends Block {

    public GeneratorAlternatingRedstoneBlock(Properties properties) {
        super(properties);
    }

    public EnergyStorage energyStorage = new EnergyStorage(5, 0, 5, 5);

    @Override
    public boolean canConnectRedstone(BlockState state, BlockGetter level, BlockPos pos, @Nullable Direction direction) {
        return true;
    }

}
