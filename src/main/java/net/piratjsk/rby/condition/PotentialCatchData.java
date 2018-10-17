package net.piratjsk.rby.condition;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

public class PotentialCatchData {

    private final Player player;
    private final Location location;

    public PotentialCatchData(final Player player, final Location location) {
        this.player = player;
        this.location = location;
    }

    public Player getPlayer() {
        return this.player;
    }

    public Location getCatchLocation() {
        return this.location;
    }

    public World getWorld() {
        return this.location.getWorld();
    }

}
