package com.idoit.meta.character;

import com.idoit.meta.Meta;
import com.idoit.meta.battlefield.PointMeta;
import com.idoit.meta.item.bijouterie.belt.StrengthBeltMeta;
import com.idoit.meta.item.bijouterie.necklace.StrengthNecklaceMeta;
import com.idoit.meta.item.bijouterie.ring.StrengthRingMeta;
import com.idoit.meta.item.common.food.AppleMeta;
import com.idoit.meta.profile.ProfileMeta;
import com.idoit.meta.quest.QuestMeta;

import java.util.HashMap;
import java.util.Map;

public abstract class CharacterMeta extends Meta {
    public CharacterMeta() {
        packageName = BASE_PACKAGE + ".character";
    }

    @Override
    protected void initFields() throws ClassNotFoundException {
        addMetaField("profile", ProfileMeta.class);
        addMetaField("leftRing", StrengthRingMeta.class);
        addMetaField("rightRing", StrengthRingMeta.class);
        addMetaField("belt", StrengthBeltMeta.class);
        addMetaField("necklace", StrengthNecklaceMeta.class);
        addMetaField("point", PointMeta.class);
        addMetaField("activeQuest", QuestMeta.class);
    }

    @Override
    protected void initConstructors() {
        Map<String, Class<?>> constructor = new HashMap<>();
        constructor.put("name", String.class);
        addConstructorWithParams(constructor);
    }

    @Override
    protected void initSetters() throws ClassNotFoundException {
        addMethod(void.class, "setProfile", ProfileMeta.class);
    }

    @Override
    protected void initGetters() throws ClassNotFoundException {
        addMethod(ProfileMeta.class, "getProfile");
        addMethod(QuestMeta.class, "getActiveQuest");
    }

    @Override
    protected void initMethods() throws ClassNotFoundException {
        addMethod(void.class, "hit", KnightMeta.class);
        addMethod(void.class, "go", int.class, int.class);
        addMethod(void.class, "setActiveQuest", QuestMeta.class);
        addMethod(void.class, "eat", AppleMeta.class);
    }
}
