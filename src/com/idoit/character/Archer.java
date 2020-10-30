package com.idoit.character;

import com.idoit.battlefield.Point;
import com.idoit.item.armor.*;
import com.idoit.item.bijouterie.belt.StrengthBelt;
import com.idoit.item.bijouterie.necklace.StrengthNecklace;
import com.idoit.item.bijouterie.ring.StrengthRing;
import com.idoit.item.weapon.Bow;
import com.idoit.quest.Quest;
import com.idoit.skill.AccurateShot;

public class Archer {
    public String name;
    public int hp = 100;
    public int mana = 100;
    public int stamina = 100;
    public int agility = 7;
    public int strength;
    public int intelligence;
    public int level = 1;
    public int experience = 0;
    public int gold = 100;
    public Bow bow;
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
    public Quest activeQuest;
    public AccurateShot skill;

    public Archer(String n) {
        name = n;
    }

    public void hit(Knight enemy) {
        enemy.hp = enemy.hp - 10;
        bow.durability = bow.durability - 1;
        stamina = stamina - 10;
        System.out.println(name + " нанес 10 урона " + enemy.name + ". Теперь у " + enemy.name + " " + enemy.hp + " хп.");
    }

    public void castSkill(Knight enemy) {
        skill.apply(this, enemy);
    }

    public void go(int x, int y) {
        point.setXY(x, y);
    }

    public void setBow(Bow bow) {
        this.bow = bow;
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
        agility += leftRing.getPointsToAdd(); //то же, что agility = agility + leftRing.getPointsToAdd();
        this.leftRing = leftRing;
    }

    public void setRightRing(StrengthRing rightRing) {
        agility += rightRing.getPointsToAdd();
        this.rightRing = rightRing;
    }

    public void setBelt(StrengthBelt belt) {
        agility += belt.getPointsToAdd();
        this.belt = belt;
    }

    public void setNecklace(StrengthNecklace necklace) {
        agility += necklace.getPointsToAdd();
        this.necklace = necklace;
    }

    public void takeOffLeftRing() {
        agility -= leftRing.getPointsToAdd(); // то же, что agility = agility - leftRing.getPointsToAdd();
        leftRing = null;
    }

    public void takeOffRightRing() {
        agility -= rightRing.getPointsToAdd();
        rightRing = null;
    }

    public void takeOffBelt() {
        agility -= belt.getPointsToAdd();
        belt = null;
    }

    public void takeOffNecklace() {
        agility -= necklace.getPointsToAdd();
        necklace = null;
    }

    public void setActiveQuest(Quest activeQuest) {
        this.activeQuest = activeQuest;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMana() {
        return mana;
    }

    public int getStamina() {
        return stamina;
    }

    public int getAgility() {
        return agility;
    }

    public int getStrength() {
        return strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getLevel() {
        return level;
    }

    public int getExperience() {
        return experience;
    }

    public int getGold() {
        return gold;
    }

    public Bow getBow() {
        return bow;
    }

    public Helmet getHelmet() {
        return helmet;
    }

    public Cuirass getCuirass() {
        return cuirass;
    }

    public Gloves getGloves() {
        return gloves;
    }

    public Boots getBoots() {
        return boots;
    }

    public Shield getShield() {
        return shield;
    }

    public StrengthRing getLeftRing() {
        return leftRing;
    }

    public StrengthRing getRightRing() {
        return rightRing;
    }

    public StrengthBelt getBelt() {
        return belt;
    }

    public StrengthNecklace getNecklace() {
        return necklace;
    }

    public Point getPoint() {
        return point;
    }

    public Quest getActiveQuest() {
        return activeQuest;
    }

    public AccurateShot getSkill() {
        return skill;
    }
}
