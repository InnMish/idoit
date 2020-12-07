package com.idoit.meta.item.bijouterie;

import com.idoit.meta.Meta;

import java.util.Arrays;

public class BijouterieMeta extends Meta {

    @Override
    protected void initFields() {
        addField("name", String.class);
        addField("pointsToAdd", int.class);
    }

    @Override
    protected void initConstructors() {
        addConstructorForFields(Arrays.asList("name", "pointsToAdd"));
    }
}
