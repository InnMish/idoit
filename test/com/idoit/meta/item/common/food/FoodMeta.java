package com.idoit.meta.item.common.food;

import com.idoit.meta.Meta;

public abstract class FoodMeta extends Meta {
    public FoodMeta() {
        packageName = BASE_PACKAGE + ".item.common.food";
    }

    @Override
    protected void initFields() {
        addField("name", String.class);
        addField("pointsToRecover", int.class);
    }
}
