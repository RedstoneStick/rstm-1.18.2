package net.guwy.rstm.item.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.data.worldgen.placement.MiscOverworldPlacements;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.server.level.DistanceManager;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.blending.Blender;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.system.CallbackI;

import java.util.List;

public class BoomStickItem extends Item {
    public BoomStickItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if(Screen.hasShiftDown()){
            pTooltipComponents.add(new TranslatableComponent("tooltip.rstm.boomstick.a.shift"));
            pTooltipComponents.add(new TranslatableComponent("tooltip.rstm.boomstick.b.shift"));
        }   else {
            pTooltipComponents.add(new TranslatableComponent("tooltip.rstm.boomstick.a"));
            pTooltipComponents.add(new TranslatableComponent("tooltip.rstm.boomstick.b"));
        }
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        Player entity = pContext.getPlayer();
        int XPos = pContext.getClickedPos().getX();
        int YPos = pContext.getClickedPos().getY();
        int ZPos = pContext.getClickedPos().getZ();
        Level level = pContext.getLevel();

        entity.swing(pContext.getHand(), true);     // a little animation to spice things up

        goBoom(XPos, YPos, ZPos, entity, level, 1.5f);        // Calls the "private" explosion handler

        pContext.getItemInHand().hurtAndBreak(1, pContext.getPlayer(), (player) ->      // Damages the item
                player.broadcastBreakEvent(player.getUsedItemHand()));

        return super.useOn(pContext);
    }

    private void goBoom(int X, int Y, int Z, Player player, Level level , float explosionRadius){
        Explosion explosion = new Explosion(level, player,
                X + 0.5f, Y + 1.2f, Z + 0.5f, explosionRadius,
                false, Explosion.BlockInteraction.NONE);                          // defines the explosion

        explosion.explode();                               // does the functional stuff
        explosion.finalizeExplosion(true);      // does the decorative stuff + item drops

        double distance = distanceCalculator(player.getX(), player.getZ(), X, Z);   // Gets the distance
        float userDamage = (float) ((4 - distance) * 3);               // calculates the damage depending on the distance

        player.hurt(DamageSource.explosion(explosion), userDamage);        // damages the user
    }

    private double distanceCalculator(double affectedX, double affectedY, double sourceX, double sourceZ){
        double X = Math.abs(affectedX - sourceX);
        double Z = Math.abs(affectedY - sourceZ);
        double distance = Math.sqrt( (Math.pow(X,2)) + (Math.pow(Z,2)) );       // Mafhs

        return distance;
    }
}
