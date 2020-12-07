package com.idoit.meta.knowledge;

import com.idoit.meta.Meta;

public class KnowledgeMeta extends Meta {
    public KnowledgeMeta() {
        packageName = BASE_PACKAGE + ".knowledge";
        className = "Knowledge";
    }

    @Override
    protected void initFields() {
        addField("description", String.class);
        addField("person", String.class);
    }

    @Override
    protected void initSetters() throws ClassNotFoundException {
        addMethod(void.class, "setDescription", String.class);
        addMethod(void.class, "setPerson", String.class);
    }

    @Override
    protected void initGetters() throws ClassNotFoundException {
        addMethod(String.class, "getDescription");
        addMethod(String.class, "getPerson");
    }
}
