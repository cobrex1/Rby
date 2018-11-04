package net.piratjsk.rby

import org.bukkit.event.Event
import org.bukkit.event.HandlerList
import net.piratjsk.rby.fish.CaughtFish
import org.bukkit.entity.Player
import org.bukkit.event.Cancellable

open class FishEvent(val fish: CaughtFish) : Event() {

    override fun getHandlers(): HandlerList {
        return HandlerList()
    }

}

open class FishPlayerEvent(fish: CaughtFish, val player: Player) : FishEvent(fish)

class FishEatEvent(fish: CaughtFish, player: Player) : FishPlayerEvent(fish, player)
class FishCatchEvent(fish: CaughtFish, player: Player) : FishPlayerEvent(fish, player)
class FishDropEvent(fish: CaughtFish, player: Player) : FishPlayerEvent(fish, player)
class FishEffectEvent(fish: CaughtFish, player: Player) : FishPlayerEvent(fish, player), Cancellable {
    override fun isCancelled(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setCancelled(cancel: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
