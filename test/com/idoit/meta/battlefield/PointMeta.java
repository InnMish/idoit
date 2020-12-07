package com.idoit.meta.battlefield;

import com.idoit.meta.Meta;

import java.util.Arrays;

public class PointMeta extends Meta {
    public PointMeta() {
        packageName = BASE_PACKAGE + ".battlefield";
        className = "Point";
    }

    @Override
    protected void initFields() {
        addField("x", int.class);
        addField("y", int.class);
    }

    @Override
    protected void initConstructors() {
        addConstructorForFields(Arrays.asList("x", "y"));
    }

    @Override
    protected void initSetters() throws ClassNotFoundException {
        addMethod(void.class, "setX", int.class);
        addMethod(void.class, "setY", int.class);
        addMethod(void.class, "setXY", int.class, int.class);
    }

    @Override
    protected void initGetters() throws ClassNotFoundException {
        addMethod(int.class, "getX");
        addMethod(int.class, "getY");
    }
}
