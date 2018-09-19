package me.elsiff.morefish.condition;

import org.bukkit.entity.Player;

public class RainingCondition implements Condition {
    private final boolean raining;

    public RainingCondition(boolean raining) {
        this.raining = raining;
    }

    @Override
    public boolean isSatisfied(Player player) {
        return (raining == player.getWorld().hasStorm());
    }
}
