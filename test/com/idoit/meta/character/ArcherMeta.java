package com.idoit.meta.character;

import com.idoit.meta.item.bijouterie.belt.AgilityBeltMeta;
import com.idoit.meta.item.bijouterie.necklace.AgilityNecklaceMeta;
import com.idoit.meta.item.bijouterie.ring.AgilityRingMeta;
import com.idoit.meta.item.weapon.BowMeta;
import com.idoit.meta.skill.AccurateShotMeta;

public class ArcherMeta extends CharacterMeta {
    public ArcherMeta() {
        className = "Archer";
    }

    @Override
    protected void initFields() throws ClassNotFoundException {
        super.initFields();
        addMetaField("bow", BowMeta.class);
        addMetaField("leftRing", AgilityRingMeta.class);
        addMetaField("rightRing", AgilityRingMeta.class);
        addMetaField("belt", AgilityBeltMeta.class);
        addMetaField("necklace", AgilityNecklaceMeta.class);
        addMetaField("skill", AccurateShotMeta.class);
    }

    @Override
    protected void initSetters() throws ClassNotFoundException {
        super.initSetters();
        addMethod(void.class, "setBow", BowMeta.class);
        addMethod(void.class, "setLeftRing", AgilityRingMeta.class);
        addMethod(void.class, "setRightRing", AgilityRingMeta.class);
        addMethod(void.class, "setBelt", AgilityBeltMeta.class);
        addMethod(void.class, "setNecklace", AgilityNecklaceMeta.class);
        addMethod(void.class, "setSkill", AccurateShotMeta.class);
    }

    @Override
    protected void initGetters() throws ClassNotFoundException {
        super.initGetters();
        addMethod(BowMeta.class, "getBow");
        addMethod(AgilityRingMeta.class, "getLeftRing");
        addMethod(AgilityRingMeta.class, "getRightRing");
        addMethod(AgilityBeltMeta.class, "getBelt");
        addMethod(AgilityNecklaceMeta.class, "getNecklace");
        addMethod(AccurateShotMeta.class, "getSkill");
    }

    @Override
    protected void initMethods() throws ClassNotFoundException {
        super.initMethods();
        addMethod(void.class, "castSkill", KnightMeta.class);
    }
}
