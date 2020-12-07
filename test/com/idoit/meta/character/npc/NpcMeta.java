package com.idoit.meta.character.npc;

import com.idoit.meta.Meta;
import com.idoit.meta.character.KnightMeta;
import com.idoit.meta.quest.QuestMeta;

import java.util.Arrays;

public class NpcMeta extends Meta {
    public NpcMeta() {
        packageName = BASE_PACKAGE + ".character.npc";
        className = "NPC";
    }

    @Override
    protected void initConstructors() {
        addConstructorForFields(Arrays.asList("name", "level"));
    }

    @Override
    protected void initFields() throws ClassNotFoundException {
        addField("name", String.class);
        addField("level", int.class);
        addMetaField("quest", QuestMeta.class);
    }

    @Override
    protected void initMethods() throws ClassNotFoundException {
        addMethod(void.class, "setQuest", QuestMeta.class);
        addMethod(void.class, "giveQuest", KnightMeta.class);
    }
}
