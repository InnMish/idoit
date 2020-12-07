package com.idoit.meta.character.npc.seller;

import com.idoit.meta.character.KnightMeta;
import com.idoit.meta.character.WizardMeta;
import com.idoit.meta.item.special.IgniteHammerMeta;
import com.idoit.meta.item.stone.CriticalHitStoneMeta;
import com.idoit.meta.item.stone.DamageStoneMeta;
import com.idoit.meta.item.stone.HealStoneMeta;
import com.idoit.meta.item.weapon.BowMeta;
import com.idoit.meta.item.weapon.StaffMeta;
import com.idoit.meta.item.weapon.SwordMeta;

public class BlacksmithMeta extends SellerMeta {
    public BlacksmithMeta() {
        className = "Blacksmith";
    }

    @Override
    protected void initMethods() throws ClassNotFoundException {
        super.initMethods();
        addMethod(void.class, "fix", KnightMeta.class, SwordMeta.class);
        addMethod(void.class, "fix", WizardMeta.class, StaffMeta.class);
        addMethod(void.class, "accept", IgniteHammerMeta.class);
        addMethod(void.class, "insertStoneToWeapon", SwordMeta.class, DamageStoneMeta.class);
        addMethod(void.class, "insertStoneToWeapon", StaffMeta.class, HealStoneMeta.class);
        addMethod(void.class, "insertStoneToWeapon", BowMeta.class, CriticalHitStoneMeta.class);
    }
}
