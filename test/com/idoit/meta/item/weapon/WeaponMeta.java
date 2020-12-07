package com.idoit.meta.item.weapon;

import com.idoit.meta.Meta;

import java.util.Arrays;

public abstract class WeaponMeta extends Meta {
    public WeaponMeta() {
        packageName = BASE_PACKAGE + ".item.weapon";
    }

    @Override
    protected void initFields() throws ClassNotFoundException {
        addField("name", String.class);
        addField("damage", int.class);
        addField("durability", int.class);
    }

    @Override
    protected void initConstructors() {
        addConstructorForFields(Arrays.asList("name", "damage"));
    }

    @Override
    protected void initMethods() throws ClassNotFoundException {
        addMethod(void.class, "setDurability", int.class);
    }
}
