package com.idoit.character.npc.seller;

public class Librarian {
    public String name;
    public int level;
    public int gold;

    public Librarian(String n, int l) {
        name = n;
        level = l;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getGold() {
        return gold;
    }
}
