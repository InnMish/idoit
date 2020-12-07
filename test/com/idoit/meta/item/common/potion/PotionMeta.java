package com.idoit.meta.item.common.potion;

import com.idoit.meta.Meta;

import java.util.Arrays;

public abstract class PotionMeta extends Meta {
    public PotionMeta() {
        packageName = BASE_PACKAGE + ".item.common.potion";
    }

    @Override
    protected void initFields() {
        addField("name", String.class);
        addField("pointsToRecover", int.class);
    }

    @Override
    protected void initConstructors() {
        addConstructorForFields(Arrays.asList("name", "pointsToRecover"));
    }

    @Override
    protected void initGetters() throws ClassNotFoundException {
        addMethod(String.class, "getName");
        addMethod(int.class, "getPointsToRecover");
    }
}
