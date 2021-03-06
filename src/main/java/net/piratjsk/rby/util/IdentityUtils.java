package net.piratjsk.rby.util;

import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.potion.PotionEffectType;

public final class IdentityUtils {

    private IdentityUtils() { }

    public static Enchantment getEnchantment(String minecraftId) {
        final NamespacedKey key = NamespacedKey.minecraft(getNameWithoutNamespace(minecraftId));
        return Enchantment.getByKey(key);
    }

    public static PotionEffectType getPotionEffectType(String minecraftId) {
        return PotionEffectType.getByName(getNameWithoutNamespace(minecraftId));
    }

    private static String getNameWithoutNamespace(final String minecraftId) {
        return minecraftId.contains(":") ? minecraftId.split(":")[1] : minecraftId;
    }

}
