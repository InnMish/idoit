package com.idoit.item.bijouterie.belt;

public class IntelligenceBelt {
    public String name;
    public int pointsToAdd;

    public IntelligenceBelt(String n, int pTA) {
        name = n;
        pointsToAdd = pTA;
    }

    public String getName() {
        return name;
    }

    public int getPointsToAdd() {
        return pointsToAdd;
    }
}
