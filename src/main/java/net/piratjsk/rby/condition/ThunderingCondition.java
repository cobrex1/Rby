package net.piratjsk.rby.condition;

public class ThunderingCondition implements Condition {
    private final boolean thundering;

    public ThunderingCondition(final boolean thundering) {
        this.thundering = thundering;
    }

    @Override
    public boolean isSatisfied(final PotentialCatchData data) {
        return (thundering == data.getWorld().isThundering());
    }

}
