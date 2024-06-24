package org.example.player;

public class Enemy extends Fighter {

    private String name;

    public Enemy(String name, int level, int maxhealth, int damage) {
        super(level, maxhealth, damage);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}

