package com.idoit.character;

import com.idoit.battlefield.Point;
import com.idoit.item.armor.*;
import com.idoit.item.bijouterie.belt.StrengthBelt;
import com.idoit.item.bijouterie.necklace.StrengthNecklace;
import com.idoit.item.bijouterie.ring.StrengthRing;
import com.idoit.profile.Profile;
import com.idoit.item.common.food.Apple;
import com.idoit.item.weapon.Staff;
import com.idoit.quest.Quest;
import com.idoit.skill.Heal;

public class Wizard {
    public Profile profile = new Profile();
    public Staff staff;
    public StrengthRing leftRing;
    public StrengthRing rightRing;
    public StrengthBelt belt;
    public StrengthNecklace necklace;
    public Point point = new Point(0, 0);
    public Quest activeQuest;
    public Heal skill;

    public Wizard(String name) {
        profile.setName(name);
    }

    public void hit(Knight enemy) {
        int updatedHp = enemy.getProfile().getHp() - 10;
        enemy.getProfile().setHp(updatedHp);
        staff.durability = staff.durability - 1;
        profile.setStamina(profile.getStamina() - 10);
        System.out.println(profile.getName() + " нанес 10 урона " + enemy.getProfile().getName() +
                ". Теперь у " + enemy.getProfile().getName() + " " + enemy.getProfile().getHp() + " хп.");
    }

    public void castSkill(Knight knight) {
        skill.apply(this, knight);
    }

    public void go(int x, int y) {
        point.setXY(x, y);
    }

    public void eat(Apple apple) {
        profile.setHp(profile.getHp() + apple.getPointsToRecover());
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
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
        profile.setIntelligence(profile.getIntelligence() + leftRing.getPointsToAdd());
        this.leftRing = leftRing;
    }

    public void setRightRing(StrengthRing rightRing) {
        profile.setIntelligence(profile.getIntelligence() + rightRing.getPointsToAdd());
        this.rightRing = rightRing;
    }

    public void setBelt(StrengthBelt belt) {
        profile.setIntelligence(profile.getIntelligence() + belt.getPointsToAdd());
        this.belt = belt;
    }

    public void setNecklace(StrengthNecklace necklace) {
        profile.setIntelligence(profile.getIntelligence() + necklace.getPointsToAdd());
        this.necklace = necklace;
    }

    public void takeOffLeftRing() {
        profile.setIntelligence(profile.getIntelligence() - leftRing.getPointsToAdd());
        leftRing = null;
    }

    public void takeOffRightRing() {
        profile.setIntelligence(profile.getIntelligence() - rightRing.getPointsToAdd());
        rightRing = null;
    }

    public void takeOffBelt() {
        profile.setIntelligence(profile.getIntelligence() - belt.getPointsToAdd());
        belt = null;
    }

    public void takeOffNecklace() {
        profile.setIntelligence(profile.getIntelligence() - necklace.getPointsToAdd());
        necklace = null;
    }

    public void setActiveQuest(Quest activeQuest) {
        this.activeQuest = activeQuest;
    }

    public Staff getStaff() {
        return staff;
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

    public Heal getSkill() {
        return skill;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
