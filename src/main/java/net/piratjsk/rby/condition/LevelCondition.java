package net.piratjsk.rby.condition;

public class LevelCondition implements Condition {
    private final int level;

    public LevelCondition(final int level) {
        this.level = level;
    }

    @Override
    public boolean isSatisfied(final PotentialCatchData data) {
        return data.getPlayer().getLevel() >= level;
    }

}
