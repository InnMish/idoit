package com.idoit.meta.character.npc.enemy.boss;

import com.idoit.meta.Meta;
import com.idoit.meta.battlefield.PointMeta;
import com.idoit.meta.character.KnightMeta;

import java.util.Arrays;
import java.util.Collections;

public abstract class BossMeta extends Meta {
    public BossMeta() {
        packageName = BASE_PACKAGE + ".character.npc.enemy.boss";
    }

    @Override
    protected void initFields() throws ClassNotFoundException {
        addField("name", String.class);
        addField("level", int.class);
        addField("damage", int.class);
        addField("expReward", int.class);
        addField("goldReward", int.class);
        addMetaField("point", PointMeta.class);
    }

    @Override
    protected void initConstructors() {
        addConstructorForFields(Collections.unmodifiableList(Arrays.asList("level", "damage")));
    }

    @Override
    protected void initSetters() throws ClassNotFoundException {
        addMethod(void.class, "setName", String.class);
        addMethod(void.class, "setLevel", int.class);
        addMethod(void.class, "setDamage", int.class);
        addMethod(void.class, "setExpReward", int.class);
        addMethod(void.class, "setGoldReward", int.class);
        addMethod(void.class, "setPoint", PointMeta.class);
    }

    @Override
    protected void initGetters() throws ClassNotFoundException {
        addMethod(String.class, "getName");
        addMethod(int.class, "getLevel");
        addMethod(int.class, "getDamage");
        addMethod(int.class, "getExpReward");
        addMethod(int.class, "getGoldReward");
        addMethod(PointMeta.class, "getPoint");
    }

    @Override
    protected void initMethods() throws ClassNotFoundException {
        addMethod(void.class, "hit", Meta.getClassFromMeta(new KnightMeta()));
        addMethod(void.class, "go", int.class, int.class);
    }
}
