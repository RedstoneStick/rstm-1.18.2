package net.guwy.rstm.block.custom.machines.generators.alternator;

import com.simibubi.create.content.contraptions.base.DirectionalKineticBlock;
import com.simibubi.create.content.contraptions.base.IRotate;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Direction.Axis;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;

public class GeneratorAlternatorBlock extends DirectionalKineticBlock implements IRotate {
    public GeneratorAlternatorBlock(Properties properties) {
        super(properties);
    }

    /** Adds the BlockStates to this block **/
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING);
    }

    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Direction preferred = getPreferredFacing(context);
        if ((context.getPlayer() != null && context.getPlayer()
                .isShiftKeyDown()) || preferred == null)
            return super.getStateForPlacement(context);
        return defaultBlockState().setValue(FACING, preferred);
    }

    @Override
    public boolean hasShaftTowards(LevelReader world, BlockPos pos, BlockState state, Direction face) {
        return face == state.getValue(FACING) || face == state.getValue(FACING).getOpposite();
    }

    @Override
    public Axis getRotationAxis(BlockState state) {
        return state.getValue(FACING)
                .getAxis();
    }

    @Override
    public SpeedLevel getMinimumRequiredSpeedLevel() {
        return SpeedLevel.MEDIUM;
    }

}
