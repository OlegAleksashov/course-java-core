package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Archer extends Hero {

    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(1);
        System.out.printf("%s", "The archer attacks the enemy");
    }
}