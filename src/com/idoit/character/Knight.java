package com.idoit.character;

import com.idoit.battlefield.Point;
import com.idoit.item.armor.*;
import com.idoit.item.bijouterie.belt.StrengthBelt;
import com.idoit.item.bijouterie.necklace.StrengthNecklace;
import com.idoit.item.bijouterie.ring.StrengthRing;
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
    public StrengthRing leftRing;
    public StrengthRing rightRing;
    public StrengthBelt belt;
    public StrengthNecklace necklace;
    public Point point = new Point(0, 0);

    public Knight(String n) {
        name = n;
    }

    public void hit(Knight enemy) {
        enemy.hp = enemy.hp - 10;
        sword.durability = sword.durability - 1;
        System.out.println(name + " нанес 10 урона " + enemy.name + ". Теперь у " + enemy.name + " " + enemy.hp + " хп.");
    }

    public void go(int x, int y) {
        point.setXY(x, y);
    }

    public void setSword(Sword sword) {
        this.sword = sword;
    }

    public void setHelmet(Helmet helmet) {
        this.helmet = helmet;
    }

    public void setCuirass(Cuirass cuirass) {
        this.cuirass = cuirass;
    }

    public void setGloves(Gloves gloves) {
        this.gloves = gloves;
    }

    public void setBoots(Boots boots) {
        this.boots = boots;
    }

    public void setShield(Shield shield) {
        this.shield = shield;
    }

    public void setLeftRing(StrengthRing leftRing) {
        this.leftRing = leftRing;
    }

    public void setRightRing(StrengthRing rightRing) {
        this.rightRing = rightRing;
    }

    public void setBelt(StrengthBelt belt) {
        this.belt = belt;
    }

    public void setNecklace(StrengthNecklace necklace) {
        this.necklace = necklace;
    }
}
