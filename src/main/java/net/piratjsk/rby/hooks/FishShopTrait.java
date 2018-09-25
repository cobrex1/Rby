package net.piratjsk.rby.hooks;

import net.piratjsk.rby.Rby;
import net.citizensnpcs.api.event.NPCRightClickEvent;
import net.citizensnpcs.api.trait.Trait;
import net.citizensnpcs.api.trait.TraitName;
import org.bukkit.event.EventHandler;

@TraitName("fishshop")
public class FishShopTrait extends Trait {

    public FishShopTrait() {
        super("fishshop");
    }

    @EventHandler
    public void click(NPCRightClickEvent event) {
        if (event.getNPC() == this.getNPC()) {
            Rby.getInstance().getFishShopGUI().openGUI(event.getClicker());
        }
    }
}
