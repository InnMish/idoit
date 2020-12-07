package com.idoit.meta.item.common;

import java.util.Collections;

public class BagMeta extends CommonMeta {
    public BagMeta() {
        className = "Bag";
    }

    @Override
    protected void initFields() {
        addField("name", String.class);
    }

    @Override
    protected void initConstructors() {
        addConstructorForFields(Collections.singletonList("name"));
    }
}
