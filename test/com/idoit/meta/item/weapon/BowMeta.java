package com.idoit.meta.item.weapon;

import com.idoit.meta.item.stone.CriticalHitStoneMeta;

public class BowMeta extends WeaponMeta {
    public BowMeta() {
        className = "Bow";
    }

    @Override
    protected void initFields() throws ClassNotFoundException {
        super.initFields();
        addMetaField("stone", CriticalHitStoneMeta.class);
    }

    @Override
    protected void initSetters() throws ClassNotFoundException {
        super.initSetters();
        addMethod(void.class, "setStone", CriticalHitStoneMeta.class);
    }

    @Override
    protected void initGetters() throws ClassNotFoundException {
        super.initGetters();
        addMethod(CriticalHitStoneMeta.class, "getStone");
    }
}
