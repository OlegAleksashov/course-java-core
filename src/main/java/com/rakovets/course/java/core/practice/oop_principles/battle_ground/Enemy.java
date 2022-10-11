package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public abstract class Enemy implements Mortal {
    private int health;

    public Enemy() {
    }

    public Enemy(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public abstract void attackHero(Hero hero);

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
