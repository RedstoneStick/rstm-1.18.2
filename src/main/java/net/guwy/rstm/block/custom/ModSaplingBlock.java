package net.guwy.rstm.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderSet;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.PlantType;

import java.util.function.Supplier;

public class ModSaplingBlock extends SaplingBlock {
    private Supplier<Block> dirt;
    private Supplier<PlantType> plantType;

    public ModSaplingBlock(AbstractTreeGrower pTreeGrower, Properties pProperties, Supplier<Block> dirt) {
        super(pTreeGrower, pProperties);
        this.dirt = dirt;
    }

    public ModSaplingBlock(AbstractTreeGrower pTreeGrower, Properties pProperties, Supplier<Block> dirt,
                           Supplier<PlantType> plantType) {
        super(pTreeGrower, pProperties);
        this.dirt = dirt;
        this.plantType = plantType;
    }

    @Override
    protected boolean mayPlaceOn(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        return pState.is(dirt.get());
    }

    @Override
    public PlantType getPlantType(BlockGetter level, BlockPos pos) {
        if(plantType.equals(null)){
            return PlantType.get("custom");
        }   else {
            return plantType.get();
        }
    }
}
