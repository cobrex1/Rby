package net.piratjsk.rby.fish

import org.bukkit.inventory.ItemStack

open class Specie (
        val name : String,
        val catchConditions: Collection<CatchCondition>,
        val effects: Collection<FishEffect>,
        val chance: Float = 0f,
        val minLength: Float = 0f,
        val maxLength: Float = 0f,
        val icon: ItemStack? = null


) {


    val eatEffects : Collection<CatchCondition>
            get() = this.catchConditions.filter { it is CatchCondition }.toList()


}