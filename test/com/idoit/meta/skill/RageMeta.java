package com.idoit.meta.skill;

import com.idoit.meta.character.KnightMeta;

public class RageMeta extends SkillMeta {
    public RageMeta() {
        className = "Rage";
    }

    @Override
    protected void initMethods() throws ClassNotFoundException {
        addMethod(void.class, "apply", KnightMeta.class);
    }
}
