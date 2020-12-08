package com.company;

// Класс всегда в единственном числе
public class Animal extends Field {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    // Форматируй код! ctrl + alt + l
    private String name;
    private String type;
    private int power;
    private int food;
}
