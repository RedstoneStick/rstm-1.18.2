package net.guwy.rstm.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class PotionSwordItem extends SwordItem {
    float chance;
    int duration;
    int amplifier;
    MobEffect effect;

    public PotionSwordItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties,
                           MobEffect effect, int amplifier, int duration, float chance) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
        this.effect = effect;
        this.amplifier = amplifier;
        this.duration = duration;
        this.chance = chance;
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        if(Math.random() >= chance){
            pTarget.addEffect(new MobEffectInstance(effect, duration, amplifier), pAttacker);
        }
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }
    
    
    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        String eff, amp, dur, cha, e, f, g, tooltipA, tooltipB, tooltipC;

        
        eff = effect.getDisplayName().getString();
        amp = Integer.toString(amplifier + 1);
        dur = tickToTime(duration);
        cha = Integer.toString((int)(chance * 100));

        tooltipA = new TranslatableComponent("tooltip.rstm.potion_sword.a").getString();
        tooltipB = new TranslatableComponent("tooltip.rstm.potion_sword.b").getString();
        tooltipC = new TranslatableComponent("tooltip.rstm.potion_sword.c").getString();

        e = tooltipA + " " + eff + " " + amp;
        pTooltipComponents.add(new TextComponent(e));

        f = tooltipB + " " + dur;
        pTooltipComponents.add(new TextComponent(f));

        g = tooltipC + " " + cha + "%";
        pTooltipComponents.add(new TextComponent(g));
    }

    private static String tickToTime(int ticks){        // Gets ticks and outputs them in "min:sec" format
        int min, sec, secTotal;
        String minOut, secOut, result;

        secTotal = ticks / 20;      // Time in seconds
        min = secTotal / 60;        // Time in minutes
        sec = secTotal % 60;        // Seconds of time in minutes

        if(sec < 10){       // Checks if the second is on 1'ns or 10'ns
            secOut = "0" + Integer.toString(sec);       // Brings the second to 10'ns if its in 1'ns
        }   else    {
            secOut = Integer.toString(sec);
        }

        minOut = Integer.toString(min);

        result = minOut + ":" + secOut;
        return result;
    }
}
