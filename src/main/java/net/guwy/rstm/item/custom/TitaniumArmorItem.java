package net.guwy.rstm.item.custom;

import net.guwy.rstm.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TitaniumArmorItem extends ArmorItem {

    public TitaniumArmorItem(ArmorMaterial pMaterial, EquipmentSlot pSlot, Properties pProperties) {
        super(pMaterial, pSlot, pProperties);
    }

    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
        if(!world.isClientSide){
            int effectAmplification = getEquippedArmorAmount(player) - 1;
            applyEffect(effectAmplification, player);
        }
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(new TranslatableComponent("tooltip.rstm.titanium_armor.a"));
        pTooltipComponents.add(new TranslatableComponent("tooltip.rstm.titanium_armor.b"));
    }

    private static int getEquippedArmorAmount(Player player){
        int armorAmount = 0;

        if(player.getInventory().getArmor(0).getItem() == ModItems.TITANIUM_BOOTS.get()){
            armorAmount ++;
        }
        if(player.getInventory().getArmor(1).getItem() == ModItems.TITANIUM_LEGGINGS.get()){
            armorAmount ++;
        }
        if(player.getInventory().getArmor(2).getItem() == ModItems.TITANIUM_CHESTPLATE.get()){
            armorAmount ++;
        }
        if(player.getInventory().getArmor(3).getItem() == ModItems.TITANIUM_HELMET.get()){
            armorAmount ++;
        }

        armorAmount = (int)Math.floor(armorAmount/2);
        return armorAmount;
    }

    private static void applyEffect(int amplifier, Player player){
        if (amplifier >= 0){
            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN,
                    10, amplifier, false, false, false));
        }
    }
}
