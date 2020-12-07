package com.idoit.meta.character.npc.seller;

import com.idoit.meta.item.armor.*;

public class ArmorSellerMeta extends SellerMeta {
    public ArmorSellerMeta() {
        className = "ArmorSeller";
    }

    @Override
    protected void initMethods() throws ClassNotFoundException {
        super.initMethods();
        addMethod(void.class, "fix", HelmetMeta.class);
        addMethod(void.class, "fix", CuirassMeta.class);
        addMethod(void.class, "fix", GlovesMeta.class);
        addMethod(void.class, "fix", BootsMeta.class);
        addMethod(void.class, "fix", ShieldMeta.class);
    }
}
