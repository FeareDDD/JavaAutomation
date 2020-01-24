package com.example.edu.task2.classes;

public abstract class Human {
    private String name;
    private int healthPoints;
    private int strength;
    private int agility;
    private int intelligence;

    public abstract void walk();

    public abstract void sleep();

    public String getName(){
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
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

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setName(String name){
        this.name = name;
    }
}
