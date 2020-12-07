package com.idoit.meta.item.common.book;

import com.idoit.meta.skill.HealMeta;

public class HealBookMeta extends BookMeta {
    public HealBookMeta() {
        className = "HealBook";
    }

    @Override
    protected void initFields() throws ClassNotFoundException {
        super.initFields();
        addMetaField("skill", HealMeta.class);
    }
}
