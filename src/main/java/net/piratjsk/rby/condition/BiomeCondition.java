package net.piratjsk.rby.condition;

import org.bukkit.Location;
import org.bukkit.block.Biome;
import org.bukkit.entity.Player;

public class BiomeCondition implements Condition {
    private final Biome biome;

    public BiomeCondition(Biome biome) {
        this.biome = biome;
    }

    @Override
    public boolean isSatisfied(Player player) {
        Location loc = player.getLocation();
        return (biome == player.getWorld().getBiome(loc.getBlockX(), loc.getBlockZ()));
    }
}
