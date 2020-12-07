package com.idoit.meta.item.weapon;

import com.idoit.meta.item.stone.DamageStoneMeta;

public class SwordMeta extends WeaponMeta {
    public SwordMeta() {
        className = "Sword";
    }

    @Override
    protected void initFields() throws ClassNotFoundException {
        super.initFields();
        addMetaField("stone", DamageStoneMeta.class);
    }

    @Override
    protected void initSetters() throws ClassNotFoundException {
        super.initSetters();
        addMethod(void.class, "setStone", DamageStoneMeta.class);
    }

    @Override
    protected void initGetters() throws ClassNotFoundException {
        super.initGetters();
        addMethod(DamageStoneMeta.class, "getStone");
    }
}
