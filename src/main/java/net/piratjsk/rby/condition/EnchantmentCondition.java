package net.piratjsk.rby.condition;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

public class EnchantmentCondition implements Condition {
    private final Enchantment enchantment;
    private final int level;

    public EnchantmentCondition(final Enchantment enchantment, final int level) {
        this.enchantment = enchantment;
        this.level = level;
    }

    @Override
    public boolean isSatisfied(final PotentialCatchData data) {
        final ItemStack itemInHand = data.getPlayer().getInventory().getItemInMainHand();
        return itemInHand != null &&
                itemInHand.containsEnchantment(enchantment) &&
                itemInHand.getEnchantmentLevel(enchantment) >= level;
    }

}
