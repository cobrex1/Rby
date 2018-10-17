package net.piratjsk.rby.condition;

import org.bukkit.Location;
import org.bukkit.block.Biome;

public class BiomeCondition implements Condition {
    private final Biome biome;

    public BiomeCondition(Biome biome) {
        this.biome = biome;
    }

    @Override
    public boolean isSatisfied(final PotentialCatchData data) {
        final Location loc = data.getCatchLocation();
        final Biome biome = loc.getWorld().getBiome(loc.getBlockX(), loc.getBlockZ());
        return this.biome.equals(biome);
    }

}
