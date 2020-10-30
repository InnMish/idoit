package com.idoit.character;

import com.idoit.battlefield.Point;
import com.idoit.item.armor.*;
import com.idoit.item.bijouterie.belt.StrengthBelt;
import com.idoit.item.bijouterie.necklace.StrengthNecklace;
import com.idoit.item.bijouterie.ring.StrengthRing;
import com.idoit.profile.Profile;
import com.idoit.item.common.food.Apple;
import com.idoit.item.weapon.Bow;
import com.idoit.quest.Quest;
import com.idoit.skill.AccurateShot;

public class Archer {
    public Profile profile = new Profile();
    public Bow bow;
    public StrengthRing leftRing;
    public StrengthRing rightRing;
    public StrengthBelt belt;
    public StrengthNecklace necklace;
    public Point point = new Point(0, 0);
    public Quest activeQuest;
    public AccurateShot skill;

    public Archer(String name) {
        profile.setName(name);
    }

    public void hit(Knight enemy) {
        int updatedHp = enemy.getProfile().getHp() - 10;
        enemy.getProfile().setHp(updatedHp);
        bow.durability = bow.durability - 1;
        profile.setStamina(profile.getStamina() - 10);
        System.out.println(profile.getName() + " нанес 10 урона " + enemy.getProfile().getName() +
                ". Теперь у " + enemy.getProfile().getName() + " " + enemy.getProfile().getHp() + " хп.");
    }

    public void castSkill(Knight enemy) {
        skill.apply(this, enemy);
    }

    public void go(int x, int y) {
        point.setXY(x, y);
    }

    public void eat(Apple apple) {
        profile.setHp(profile.getHp() + apple.getPointsToRecover());
    }

    public void setBow(Bow bow) {
        this.bow = bow;
    }

    public void setHelmet(Helmet helmet) {
        profile.getInventory().setHelmet(helmet);
    }

    public void setCuirass(Cuirass cuirass) {
        profile.getInventory().setCuirass(cuirass);
    }

    public void setGloves(Gloves gloves) {
        profile.getInventory().setGloves(gloves);
    }

    public void setBoots(Boots boots) {
        profile.getInventory().setBoots(boots);
    }

    public void setShield(Shield shield) {
        profile.getInventory().setShield(shield);
    }

    public void setLeftRing(StrengthRing leftRing) {
        profile.setAgility(profile.getAgility() + leftRing.getPointsToAdd());
        this.leftRing = leftRing;
    }

    public void setRightRing(StrengthRing rightRing) {
        profile.setAgility(profile.getAgility() + rightRing.getPointsToAdd());
        this.rightRing = rightRing;
    }

    public void setBelt(StrengthBelt belt) {
        profile.setAgility(profile.getAgility() + belt.getPointsToAdd());
        this.belt = belt;
    }

    public void setNecklace(StrengthNecklace necklace) {
        profile.setAgility(profile.getAgility() + necklace.getPointsToAdd());
        this.necklace = necklace;
    }

    public void takeOffLeftRing() {
        profile.setAgility(profile.getAgility() - leftRing.getPointsToAdd());
        leftRing = null;
    }

    public void takeOffRightRing() {
        profile.setAgility(profile.getAgility() - rightRing.getPointsToAdd());
        rightRing = null;
    }

    public void takeOffBelt() {
        profile.setAgility(profile.getAgility() - belt.getPointsToAdd());
        belt = null;
    }

    public void takeOffNecklace() {
        profile.setAgility(profile.getAgility() - necklace.getPointsToAdd());
        necklace = null;
    }

    public void setActiveQuest(Quest activeQuest) {
        this.activeQuest = activeQuest;
    }

    public Bow getBow() {
        return bow;
    }

    public Helmet getHelmet() {
        return profile.getInventory().getHelmet();
    }

    public Cuirass getCuirass() {
        return profile.getInventory().getCuirass();
    }

    public Gloves getGloves() {
        return profile.getInventory().getGloves();
    }

    public Boots getBoots() {
        return profile.getInventory().getBoots();
    }

    public Shield getShield() {
        return profile.getInventory().getShield();
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

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
