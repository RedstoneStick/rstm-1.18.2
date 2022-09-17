package net.guwy.rstm.block.custom.machines.generators.alternator;

import com.simibubi.create.content.contraptions.base.KineticTileEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class GeneratorAlternatorBlockEntity extends KineticTileEntity {

    public GeneratorAlternatorBlockEntity(BlockEntityType<?> typeIn, BlockPos pos, BlockState state) {
        super(typeIn, pos, state);
    }
    
}
