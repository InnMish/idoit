package com.idoit.character;

import com.idoit.battlefield.Point;
import com.idoit.character.npc.NPC;
import com.idoit.character.npc.seller.Blacksmith;
import com.idoit.item.armor.*;
import com.idoit.item.bijouterie.belt.StrengthBelt;
import com.idoit.item.bijouterie.necklace.StrengthNecklace;
import com.idoit.item.bijouterie.ring.StrengthRing;
import com.idoit.item.common.potion.HpPotion;
import com.idoit.item.weapon.Sword;
import com.idoit.quest.Quest;
import com.idoit.skill.Rage;

public class Knight {
    public String name;
    public int strength = 7;
    public int agility;
    public int intelligence;
    public int hp = 100;
    public int mana = 100;
    public int stamina = 100;
    public int level = 1;
    public int experience = 0;
    public int gold = 100;
    public int physicalDefence;
    public int magicDefence;
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
    public Quest activeQuest;
    public Rage skill;

    public Knight(String n) {
        name = n;
    }

    public void hit(Knight enemy) {
        enemy.hp = enemy.hp - 10;
        sword.durability = sword.durability - 1;
        stamina = stamina - 10;
        System.out.println(name + " нанес 10 урона " + enemy.name + ". Теперь у " + enemy.name + " " + enemy.hp + " хп.");
    }

    public void castSkill() {
        skill.apply(this);
    }

    public void go(int x, int y) {
        point.setXY(x, y);
    }

    public void talkTo(NPC npc) {
        npc.giveQuest(this);
    }

    public void talkTo(Blacksmith blacksmith) {
        blacksmith.fix(this, sword);
    }

    public void addGold(int gold) {
        this.gold = this.gold + gold;
    }

    public void addExperience(int exp) {
        this.experience = this.experience + exp;
    }

    public void calculatePhysicalDefence() {
    public void drinkHpPotion(HpPotion potion) {
        hp += potion.getPointsToRecover();
    }

    private void calculatePhysicalDefence() {
        physicalDefence = physicalDefence + helmet.physicalDefence + cuirass.physicalDefence + gloves.physicalDefence + boots.physicalDefence + shield.physicalDefence;
    }

    public void calculateMagicDefence() {
        magicDefence = magicDefence + helmet.magicDefence + cuirass.magicDefence + gloves.magicDefence + boots.magicDefence + shield.magicDefence;
    }

    private double calculateDistance(Point point) {
        int xDif = point.getX() - this.point.getX();
        int yDif = point.getY() - this.point.getY();
        return Math.sqrt(xDif * xDif + yDif * yDif);
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
        strength = strength + leftRing.getPointsToAdd();
        this.leftRing = leftRing;
    }

    public void setRightRing(StrengthRing rightRing) {
        strength = strength + rightRing.getPointsToAdd();
        this.rightRing = rightRing;
    }

    public void setBelt(StrengthBelt belt) {
        strength = strength + belt.getPointsToAdd();
        this.belt = belt;
    }

    public void setNecklace(StrengthNecklace necklace) {
        strength = strength + necklace.getPointsToAdd();
        this.necklace = necklace;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void takeOffLeftRing() {
        strength -= leftRing.getPointsToAdd(); // то же, что strength = strength - leftRing.getPointsToAdd();
        leftRing = null;
    }

    public void takeOffRightRing() {
        strength -= rightRing.getPointsToAdd();
        rightRing = null;
    }

    public void takeOffBelt() {
        strength -= belt.getPointsToAdd();
        belt = null;
    }

    public void takeOffNecklace() {
        strength -= necklace.getPointsToAdd();
        necklace = null;
    }

    public void setActiveQuest(Quest activeQuest) {
        this.activeQuest = activeQuest;
    }

    public void setSkill(Rage skill) {
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getIntelligence() {
        return intelligence;
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

    public int getLevel() {
        return level;
    }

    public int getExperience() {
        return experience;
    }

    public int getGold() {
        return gold;
    }

    public int getPhysicalDefence() {
        return physicalDefence;
    }

    public int getMagicDefence() {
        return magicDefence;
    }

    public Sword getSword() {
        return sword;
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

    public Rage getSkill() {
        return skill;
    }
}
