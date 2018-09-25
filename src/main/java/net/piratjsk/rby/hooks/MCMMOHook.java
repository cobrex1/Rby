package net.piratjsk.rby.hooks;

import com.gmail.nossr50.api.ExperienceAPI;
import org.bukkit.entity.Player;

/**
 * Created by elsiff on 2017-06-20.
 */
public class MCMMOHook {

    public int getSkillLevel(Player player, String skillType) {
        return ExperienceAPI.getLevel(player, skillType);
    }
}
