package com.idoit.meta.character.npc.enemy;

import com.idoit.meta.Meta;
import com.idoit.meta.battlefield.PointMeta;
import com.idoit.meta.character.KnightMeta;

import java.util.Arrays;

public abstract class EnemyMeta extends Meta {
    public EnemyMeta() {
        packageName = BASE_PACKAGE + ".character.npc.enemy";
    }

    @Override
    protected void initFields() throws ClassNotFoundException {
        addField("name", String.class);
        addField("hp", int.class);
        addField("level", int.class);
        addField("expReward", int.class);
        addField("goldReward", int.class);
        addField("damage", int.class);
        addMetaField("point", PointMeta.class);
    }

    @Override
    protected void initConstructors() {
        addConstructorForFields(Arrays.asList("level", "damage"));
    }

    @Override
    protected void initMethods() throws ClassNotFoundException {
        addMethod(void.class, "hit", KnightMeta.class);
        addMethod(void.class, "go", int.class, int.class);
    }
}
