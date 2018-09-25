package net.piratjsk.rby.condition;

import net.piratjsk.rby.Rby;
import net.piratjsk.rby.hooks.MCMMOHook;
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
        MCMMOHook hooker = Rby.getInstance().getMCMMOHook();

        if (hooker == null) {
            Rby.getInstance().getLogger().severe("MCMMO Not Found!");
            return false;
        }

        return (hooker.getSkillLevel(player, skillType) >= level);
    }
}
