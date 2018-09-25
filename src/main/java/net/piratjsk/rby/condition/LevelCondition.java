package net.piratjsk.rby.condition;

import org.bukkit.entity.Player;

public class LevelCondition implements Condition {
    private final int level;

    public LevelCondition(int level) {
        this.level = level;
    }

    @Override
    public boolean isSatisfied(Player player) {
        return (player.getLevel() >= level);
    }
}
