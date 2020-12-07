package com.idoit.meta.character;

import com.idoit.meta.battlefield.PointMeta;
import com.idoit.meta.character.npc.NpcMeta;
import com.idoit.meta.character.npc.seller.BlacksmithMeta;
import com.idoit.meta.item.bijouterie.belt.StrengthBeltMeta;
import com.idoit.meta.item.bijouterie.necklace.StrengthNecklaceMeta;
import com.idoit.meta.item.bijouterie.ring.StrengthRingMeta;
import com.idoit.meta.item.common.potion.HpPotionMeta;
import com.idoit.meta.item.weapon.SwordMeta;
import com.idoit.meta.skill.RageMeta;

public class KnightMeta extends CharacterMeta {
    public KnightMeta() {
        className = "Knight";
    }

    @Override
    protected void initFields() throws ClassNotFoundException {
        super.initFields();
        addMetaField("sword", SwordMeta.class);
        addMetaField("leftRing", StrengthRingMeta.class);
        addMetaField("rightRing", StrengthRingMeta.class);
        addMetaField("belt", StrengthBeltMeta.class);
        addMetaField("necklace", StrengthNecklaceMeta.class);
        addMetaField("skill", RageMeta.class);
    }

    @Override
    protected void initSetters() throws ClassNotFoundException {
        super.initSetters();
        addMethod(void.class, "setSword", SwordMeta.class);
        addMethod(void.class, "setLeftRing", StrengthRingMeta.class);
        addMethod(void.class, "setRightRing", StrengthRingMeta.class);
        addMethod(void.class, "setBelt", StrengthBeltMeta.class);
        addMethod(void.class, "setNecklace", StrengthNecklaceMeta.class);
        addMethod(void.class, "setSkill", RageMeta.class);
    }

    @Override
    protected void initGetters() throws ClassNotFoundException {
        super.initGetters();
        addMethod(SwordMeta.class, "getSword");
        addMethod(StrengthRingMeta.class, "getLeftRing");
        addMethod(StrengthRingMeta.class, "getRightRing");
        addMethod(StrengthBeltMeta.class, "getBelt");
        addMethod(StrengthNecklaceMeta.class, "getNecklace");
        addMethod(RageMeta.class, "getSkill");
    }

    @Override
    protected void initMethods() throws ClassNotFoundException {
        super.initMethods();
        addMethod(void.class, "addGold", int.class);
        addMethod(void.class, "addExperience", int.class);
        addMethod(void.class, "calculatePhysicalDefence");
        addMethod(void.class, "calculateMagicDefence");
        addMethod(void.class, "talkTo", NpcMeta.class);
        addMethod(void.class, "talkTo", BlacksmithMeta.class);
        addMethod(void.class, "castSkill");
        addMethod(void.class, "drinkHpPotion", HpPotionMeta.class);
        addMethod(double.class, "calculateDistance", PointMeta.class);
    }
}
