package com.idoit.character;

import com.idoit.item.armor.*;
import com.idoit.item.weapon.Staff;

public class Wizard {
    public String name;
    public int hp = 100;
    public int mana = 100;
    public int intelligence = 7;
    public int strength;
    public int agility;
    public int level = 1;
    public int experience = 0;
    public int gold = 100;
    public Staff staff;
    public Helmet helmet;
    public Cuirass cuirass;
    public Gloves gloves;
    public Boots boots;
    public Shield shield;

    public Wizard(String n) {
        name = n;
    }
}
