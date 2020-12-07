package com.idoit.meta.character.npc.seller;

import com.idoit.meta.Meta;

import java.util.Arrays;

public abstract class SellerMeta extends Meta {
    public SellerMeta() {
        packageName = BASE_PACKAGE + ".character.npc.seller";
    }

    @Override
    protected void initFields() {
        addField("name", String.class);
        addField("gold", int.class);
        addField("level", int.class);
    }

    @Override
    protected void initConstructors() {
        addConstructorForFields(Arrays.asList("name", "level"));
    }
}
