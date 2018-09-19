package me.elsiff.morefish.condition;

import me.elsiff.morefish.MoreFish;
import me.elsiff.morefish.hooks.WorldGuardHook;
import org.bukkit.entity.Player;

/**
 * Created by elsiff on 2017-06-20.
 */
public class WGRegionCondtion implements Condition {
    private final String regionId;

    public WGRegionCondtion(String regionId) {
        this.regionId = regionId;
    }

    @Override
    public boolean isSatisfied(Player player) {
        WorldGuardHook hooker = MoreFish.getInstance().getWorldGuardHook();
        return (hooker != null && hooker.containsLocation(player.getLocation(), regionId));
    }
}
