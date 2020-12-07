package com.idoit.meta.item.armor;

import com.idoit.meta.Meta;

import java.util.Arrays;

public abstract class ArmorMeta extends Meta {
    public ArmorMeta() {
        packageName = BASE_PACKAGE + ".item.armor";
    }

    @Override
    protected void initFields() {
        addField("name", String.class);
        addField("type", String.class);
        addField("physicalDefence", int.class);
        addField("magicDefence", int.class);
        addField("durability", int.class);
    }

    @Override
    protected void initConstructors() {
        addConstructorForFields(Arrays.asList("name", "physicalDefence", "magicDefence"));
    }

    @Override
    protected void initMethods() throws ClassNotFoundException {
        addMethod(void.class, "setDurability", int.class);
    }
}
