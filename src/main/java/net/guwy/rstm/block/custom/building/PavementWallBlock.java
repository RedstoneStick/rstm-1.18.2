package net.guwy.rstm.block.custom.building;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockState;

public class PavementWallBlock extends WallBlock {
    public PavementWallBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {

        if(!pLevel.isClientSide()){
            if(pEntity instanceof LivingEntity){
                LivingEntity entity = (LivingEntity) pEntity;
                entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,
                        40, 0, true, false, false));
            }
        }

        super.stepOn(pLevel, pPos, pState, pEntity);
    }
}
