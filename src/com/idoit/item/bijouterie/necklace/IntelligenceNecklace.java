package com.idoit.item.bijouterie.necklace;

public class IntelligenceNecklace {
    public String name;
    public int pointsToAdd;

    public IntelligenceNecklace(String n, int pTA) {
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
