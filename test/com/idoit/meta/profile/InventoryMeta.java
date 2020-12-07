package com.idoit.meta.profile;

import com.idoit.meta.Meta;
import com.idoit.meta.item.armor.*;
import com.idoit.meta.item.common.BagMeta;

public class InventoryMeta extends Meta {
    public InventoryMeta() {
        packageName = BASE_PACKAGE + ".profile";
        className = "Inventory";
    }

    @Override
    protected void initFields() throws ClassNotFoundException {
        addMetaField("helmet", HelmetMeta.class);
        addMetaField("cuirass", CuirassMeta.class);
        addMetaField("gloves", GlovesMeta.class);
        addMetaField("boots", BootsMeta.class);
        addMetaField("shield", ShieldMeta.class);
        addMetaField("bag", BagMeta.class);
    }

    @Override
    protected void initSetters() throws ClassNotFoundException {
        addMethod(void.class, "setHelmet", HelmetMeta.class);
        addMethod(void.class, "setCuirass", CuirassMeta.class);
        addMethod(void.class, "setGloves", GlovesMeta.class);
        addMethod(void.class, "setBoots", BootsMeta.class);
        addMethod(void.class, "setShield", ShieldMeta.class);
        addMethod(void.class, "setBag", BagMeta.class);
    }

    @Override
    protected void initGetters() throws ClassNotFoundException {
        addMethod(HelmetMeta.class, "getHelmet");
        addMethod(CuirassMeta.class, "getCuirass");
        addMethod(GlovesMeta.class, "getGloves");
        addMethod(BootsMeta.class, "getBoots");
        addMethod(ShieldMeta.class, "getShield");
        addMethod(BagMeta.class, "getBag");
    }
}
