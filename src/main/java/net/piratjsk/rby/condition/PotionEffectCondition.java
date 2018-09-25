package net.piratjsk.rby.condition;

import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffectType;

public class PotionEffectCondition implements Condition {
    private final PotionEffectType effectType;
    private final int amplifier;

    public PotionEffectCondition(PotionEffectType effectType, int amplifier) {
        this.effectType = effectType;
        this.amplifier = amplifier;
    }

    @Override
    public boolean isSatisfied(Player player) {
        return (player.hasPotionEffect(effectType) &&
                player.getPotionEffect(effectType).getAmplifier() >= amplifier);
    }
}
