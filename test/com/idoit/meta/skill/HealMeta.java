package com.idoit.meta.skill;

import com.idoit.meta.character.KnightMeta;
import com.idoit.meta.character.WizardMeta;

public class HealMeta extends SkillMeta {
    public HealMeta() {
        className = "Heal";
    }

    @Override
    protected void initMethods() throws ClassNotFoundException {
        addMethod(void.class, "apply", WizardMeta.class, KnightMeta.class);
    }
}
