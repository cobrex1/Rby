package net.piratjsk.rby.condition;

import org.bukkit.entity.Player;

public interface Condition {
    boolean isSatisfied(Player player);
}
