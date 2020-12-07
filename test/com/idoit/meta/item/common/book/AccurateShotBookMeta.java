package com.idoit.meta.item.common.book;

import com.idoit.meta.skill.AccurateShotMeta;

public class AccurateShotBookMeta extends BookMeta {
    public AccurateShotBookMeta() {
        className = "AccurateShotBook";
    }

    @Override
    protected void initFields() throws ClassNotFoundException {
        super.initFields();
        addMetaField("skill", AccurateShotMeta.class);
    }
}
