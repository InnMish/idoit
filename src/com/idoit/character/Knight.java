package com.idoit.character;

import com.idoit.item.armor.*;
import com.idoit.item.weapon.Sword;

public class Knight {
    public String name;
    public int strength = 7;
    public int agility;
    public int intelligence;
    public int hp = 100;
    public int mana = 100;
    public int level = 1;
    public int experience = 0;
    public int gold = 100;
    public Sword sword;
    public Helmet helmet;
    public Cuirass cuirass;
    public Gloves gloves;
    public Boots boots;
    public Shield shield;

    public Knight(String n) {
        name = n;
    }

    public void hit(Knight enemy) {
        enemy.hp = enemy.hp - 10;
        System.out.println(name + " нанес 10 урона " + enemy.name + ". Теперь у " + enemy.name + " " + enemy.hp + " хп.");
    }
}
