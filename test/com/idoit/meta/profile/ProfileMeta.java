package com.idoit.meta.profile;

import com.idoit.meta.Meta;

public class ProfileMeta extends Meta {
    public ProfileMeta() {
        packageName = BASE_PACKAGE + ".profile";
        className = "Profile";
    }

    @Override
    protected void initFields() throws ClassNotFoundException {
        addField("name", String.class);
        addField("strength", int.class);
        addField("agility", int.class);
        addField("intelligence", int.class);
        addField("hp", int.class);
        addField("mana", int.class);
        addField("stamina", int.class);
        addField("level", int.class);
        addField("experience", int.class);
        addField("gold", int.class);
        addField("physicalDefence", int.class);
        addField("magicDefence", int.class);
        addMetaField("inventory", InventoryMeta.class);
    }

    @Override
    protected void initSetters() throws ClassNotFoundException {
        addMethod(void.class, "setName", String.class);
        addMethod(void.class, "setStrength", int.class);
        addMethod(void.class, "setAgility", int.class);
        addMethod(void.class, "setIntelligence", int.class);
        addMethod(void.class, "setHp", int.class);
        addMethod(void.class, "setMana", int.class);
        addMethod(void.class, "setStamina", int.class);
        addMethod(void.class, "setLevel", int.class);
        addMethod(void.class, "setExperience", int.class);
        addMethod(void.class, "setGold", int.class);
        addMethod(void.class, "setPhysicalDefence", int.class);
        addMethod(void.class, "setMagicDefence", int.class);
        addMethod(void.class, "setInventory", InventoryMeta.class);
    }

    @Override
    protected void initGetters() throws ClassNotFoundException {
        addMethod(String.class, "getName");
        addMethod(int.class, "getStrength");
        addMethod(int.class, "getAgility");
        addMethod(int.class, "getIntelligence");
        addMethod(int.class, "getHp");
        addMethod(int.class, "getMana");
        addMethod(int.class, "getStamina");
        addMethod(int.class, "getLevel");
        addMethod(int.class, "getExperience");
        addMethod(int.class, "getGold");
        addMethod(int.class, "getPhysicalDefence");
        addMethod(int.class, "getMagicDefence");
        addMethod(InventoryMeta.class, "getInventory");
    }
}
