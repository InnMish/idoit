package com.idoit.meta.skill;

import com.idoit.meta.character.ArcherMeta;
import com.idoit.meta.character.KnightMeta;

public class AccurateShotMeta extends SkillMeta {
    public AccurateShotMeta() {
        className = "AccurateShot";
    }

    @Override
    protected void initMethods() throws ClassNotFoundException {
        addMethod(void.class, "apply", ArcherMeta.class, KnightMeta.class);
    }
}
