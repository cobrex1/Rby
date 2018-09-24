package me.elsiff.morefish.util;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.UUID;

public class SkullUtils {
    private SkullUtils() {
        throw new IllegalAccessError("Utility class");
    }

    public static ItemStack setSkullTexture(ItemStack item, String value) {
        if (isPlayerHead(item)) {
            Bukkit.getUnsafe().modifyItemStack(item, "{SkullOwner:{Id:\"" + UUID.randomUUID().toString() + "\",Properties:{textures:[{Value:\"" + value + "\"}]}}}");
        }
        return item;
    }

    private static boolean isPlayerHead(final ItemStack item) {
        return item.getType().equals(Material.PLAYER_HEAD);
    }

}
