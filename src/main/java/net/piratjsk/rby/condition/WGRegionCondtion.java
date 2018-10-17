package net.piratjsk.rby.condition;

import net.piratjsk.rby.Rby;
import net.piratjsk.rby.hooks.WorldGuardHook;

public class WGRegionCondtion implements Condition {
    private final String regionId;

    public WGRegionCondtion(final String regionId) {
        this.regionId = regionId;
    }

    @Override
    public boolean isSatisfied(final PotentialCatchData data) {
        final WorldGuardHook wg = Rby.getInstance().getWorldGuardHook();
        return wg != null && wg.containsLocation(data.getCatchLocation(), regionId);
    }

}
