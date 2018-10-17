package net.piratjsk.rby.condition;

public class HeightCondition implements Condition {
    private final int minHeight;
    private final int maxHeight;

    public HeightCondition(final int minHeight, final int maxHeight) {
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
    }

    @Override
    public boolean isSatisfied(final PotentialCatchData data) {
        final int y = data.getCatchLocation().getBlockY();
        return minHeight <= y && y <= maxHeight;
    }

}
