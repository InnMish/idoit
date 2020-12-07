package com.idoit.meta.quest;

import com.idoit.meta.Meta;
import com.idoit.meta.character.KnightMeta;

import java.util.Arrays;

public class QuestMeta extends Meta {
    public QuestMeta() {
        packageName = BASE_PACKAGE + ".quest";
        className = "Quest";
    }

    @Override
    protected void initFields() {
        addField("name", String.class);
        addField("description", String.class);
        addField("expReward", int.class);
        addField("goldReward", int.class);
        addField("minLevel", int.class);
    }

    @Override
    protected void initConstructors() {
        addConstructorForFields(Arrays.asList("name", "description", "expReward", "goldReward", "minLevel"));
    }

    @Override
    protected void initMethods() throws ClassNotFoundException {
        addMethod(void.class, "complete", KnightMeta.class);
    }
}
