package net.piratjsk.rby.condition;

import net.piratjsk.rby.Rby;
import net.piratjsk.rby.hooks.MCMMOHook;

public class MCMMOSkillCondition implements Condition {
    private final String skillType;
    private final int level;

    public MCMMOSkillCondition(final String skillType, final int level) {
        this.skillType = skillType;
        this.level = level;
    }

    @Override
    public boolean isSatisfied(final PotentialCatchData data) {
        final MCMMOHook mcmmo = Rby.getInstance().getMCMMOHook();
        return mcmmo.getSkillLevel(data.getPlayer(), skillType) >= level;
    }

}
