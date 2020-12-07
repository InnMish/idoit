package com.idoit.meta.character;

import com.idoit.meta.Meta;
import com.idoit.meta.item.bijouterie.belt.IntelligenceBeltMeta;
import com.idoit.meta.item.bijouterie.necklace.IntelligenceNecklaceMeta;
import com.idoit.meta.item.bijouterie.ring.IntelligenceRingMeta;
import com.idoit.meta.item.weapon.StaffMeta;
import com.idoit.meta.skill.HealMeta;

public class WizardMeta extends CharacterMeta {
    public WizardMeta() {
        className = "Wizard";
    }

    @Override
    protected void initFields() throws ClassNotFoundException {
        super.initFields();
        addMetaField("staff", StaffMeta.class);
        addMetaField("leftRing", IntelligenceRingMeta.class);
        addMetaField("rightRing", IntelligenceRingMeta.class);
        addMetaField("belt", IntelligenceBeltMeta.class);
        addMetaField("necklace", IntelligenceNecklaceMeta.class);
        addMetaField("skill", HealMeta.class);
    }

    @Override
    protected void initSetters() throws ClassNotFoundException {
        super.initSetters();
        addMethod(void.class, "setStaff", StaffMeta.class);
        addMethod(void.class, "setLeftRing", IntelligenceRingMeta.class);
        addMethod(void.class, "setRightRing", IntelligenceRingMeta.class);
        addMethod(void.class, "setBelt", IntelligenceBeltMeta.class);
        addMethod(void.class, "setNecklace", IntelligenceNecklaceMeta.class);
        addMethod(void.class, "setSkill", HealMeta.class);
    }

    @Override
    protected void initGetters() throws ClassNotFoundException {
        super.initGetters();
        addMethod(StaffMeta.class, "getStaff");
        addMethod(IntelligenceRingMeta.class, "getLeftRing");
        addMethod(IntelligenceRingMeta.class, "getRightRing");
        addMethod(IntelligenceBeltMeta.class, "getBelt");
        addMethod(IntelligenceNecklaceMeta.class, "getNecklace");
        addMethod(HealMeta.class, "getSkill");
    }

    @Override
    protected void initMethods() throws ClassNotFoundException {
        super.initMethods();
        addMethod(void.class, "castSkill", KnightMeta.class);
    }
}
