package net.piratjsk.rby.condition;

public class TimeCondition implements Condition {
    private final String time;

    public TimeCondition(final String time) {
        this.time = time;
    }

    @Override
    public boolean isSatisfied(final PotentialCatchData data) {
        final long tick = data.getWorld().getTime();
        return time.equalsIgnoreCase("day") ?
                (1000 <= tick && tick < 13000)
                :
                time.equalsIgnoreCase("night") && (13000 <= tick || tick < 1000);
    }

}
