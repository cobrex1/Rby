package net.piratjsk.rby.hooks;

import com.sk89q.worldedit.bukkit.BukkitAdapter;
import com.sk89q.worldedit.world.World;
import com.sk89q.worldguard.WorldGuard;
import com.sk89q.worldguard.internal.platform.WorldGuardPlatform;
import com.sk89q.worldguard.protection.managers.RegionManager;
import org.bukkit.Location;

public class WorldGuardHook {

    public boolean containsLocation(final Location loc, final String regionId) {
        final WorldGuardPlatform wg = WorldGuard.getInstance().getPlatform();
        final World world = wg.getWorldByName(loc.getWorld().getName());
        final RegionManager rm = wg.getRegionContainer().get(world);
        return rm != null && rm.getApplicableRegionsIDs(BukkitAdapter.asVector(loc)).contains(regionId);
    }

}
