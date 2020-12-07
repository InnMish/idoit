package com.idoit.meta.item.common.book;

import com.idoit.meta.skill.RageMeta;

public class RageBookMeta extends BookMeta {
    public RageBookMeta() {
        className = "RageBook";
    }

    @Override
    protected void initFields() throws ClassNotFoundException {
        super.initFields();
        addMetaField("skill", RageMeta.class);
    }
}
