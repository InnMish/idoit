package com.idoit.meta.skill;

import com.idoit.meta.Meta;

import java.util.Arrays;

public abstract class SkillMeta extends Meta {
    public SkillMeta() {
        packageName = BASE_PACKAGE + ".skill";
    }

    @Override
    protected void initFields() {
        addField("spendsMana", int.class);
        addField("minLevel", int.class);
        addField("characterClass", String.class);
        addField("name", String.class);
    }

    @Override
    protected void initConstructors() {
        addConstructorForFields(Arrays.asList("name", "spendsMana", "minLevel"));
    }
}
