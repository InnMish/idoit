package com.idoit.meta.character.npc;

import com.idoit.meta.Meta;
import com.idoit.meta.item.armor.*;

public class ArmorSellerMeta extends NpcMeta {
    public ArmorSellerMeta() throws ClassNotFoundException {
        className = "ArmorSeller";
        addMethod(void.class, "fix", Meta.getClassFromMeta(new HelmetMeta()));
        addMethod(void.class, "fix", Meta.getClassFromMeta(new CuirassMeta()));
        addMethod(void.class, "fix", Meta.getClassFromMeta(new GlovesMeta()));
        addMethod(void.class, "fix", Meta.getClassFromMeta(new BootsMeta()));
        addMethod(void.class, "fix", Meta.getClassFromMeta(new ShieldMeta()));
    }
}
