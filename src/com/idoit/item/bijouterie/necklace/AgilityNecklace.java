package com.idoit.item.bijouterie.necklace;

public class AgilityNecklace {
    public String name;
    public int pointsToAdd;

    public AgilityNecklace(String n, int pTA) {
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
