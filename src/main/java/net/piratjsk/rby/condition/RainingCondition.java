package net.piratjsk.rby.condition;

public class RainingCondition implements Condition {
    private final boolean raining;

    public RainingCondition(final boolean raining) {
        this.raining = raining;
    }

    @Override
    public boolean isSatisfied(final PotentialCatchData data) {
        return raining == data.getWorld().hasStorm();
    }

}
