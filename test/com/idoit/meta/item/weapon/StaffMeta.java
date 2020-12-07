package com.idoit.meta.item.weapon;

import com.idoit.meta.Meta;
import com.idoit.meta.item.stone.HealStoneMeta;

public class StaffMeta extends WeaponMeta {
    public StaffMeta() {
        className = "Staff";
    }

    @Override
    protected void initFields() throws ClassNotFoundException {
        super.initFields();
        addMetaField("stone", HealStoneMeta.class);
    }

    @Override
    protected void initSetters() throws ClassNotFoundException {
        super.initSetters();
        addMethod(void.class, "setStone", HealStoneMeta.class);
    }

    @Override
    protected void initGetters() throws ClassNotFoundException {
        super.initGetters();
        addMethod(HealStoneMeta.class, "getStone");
    }
}
