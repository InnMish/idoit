package com.idoit.meta.item.common.book;

import com.idoit.meta.Meta;

import java.util.Arrays;

public abstract class BookMeta extends Meta {
    public BookMeta() {
        packageName = BASE_PACKAGE + ".item.common.book";
    }

    @Override
    protected void initFields() throws ClassNotFoundException {
        addField("name", String.class);
        addField("minLevel", int.class);
    }

    @Override
    protected void initConstructors() {
        addConstructorForFields(Arrays.asList("name", "minLevel"));
    }
}
