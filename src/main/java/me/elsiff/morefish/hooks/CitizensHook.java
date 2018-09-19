package me.elsiff.morefish.hooks;

import net.citizensnpcs.api.CitizensAPI;
import net.citizensnpcs.api.trait.TraitInfo;

public class CitizensHook {
    private TraitInfo fishShop;

    public CitizensHook() {
        this.fishShop = TraitInfo.create(FishShopTrait.class).withName("fishshop");
    }

    public void registerTrait() {
        CitizensAPI.getTraitFactory().registerTrait(fishShop);
    }

    public void deregisterTrait() {
        CitizensAPI.getTraitFactory().deregisterTrait(fishShop);
    }
}
