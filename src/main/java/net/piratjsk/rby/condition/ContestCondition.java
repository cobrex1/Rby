package net.piratjsk.rby.condition;

import net.piratjsk.rby.Rby;
import org.bukkit.entity.Player;

public class ContestCondition implements Condition {
    private final boolean ongoing;

    public ContestCondition(boolean ongoing) {
        this.ongoing = ongoing;
    }

    @Override
    public boolean isSatisfied(Player player) {
        return (ongoing == Rby.getInstance().getContestManager().hasStarted());
    }
}