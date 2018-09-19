package me.elsiff.morefish.condition;

import me.elsiff.morefish.MoreFish;
import me.elsiff.morefish.hooks.MCMMOHook;
import org.bukkit.entity.Player;

/**
 * Created by elsiff on 2017-06-20.
 */
public class MCMMOSkillCondition implements Condition {
    private final String skillType;
    private final int level;

    public MCMMOSkillCondition(String skillType, int level) {
        this.skillType = skillType;
        this.level = level;
    }

    @Override
    public boolean isSatisfied(Player player) {
        MCMMOHook hooker = MoreFish.getInstance().getMCMMOHook();

        if (hooker == null) {
            MoreFish.getInstance().getLogger().severe("MCMMO Not Found!");
            return false;
        }

        return (hooker.getSkillLevel(player, skillType) >= level);
    }
}
