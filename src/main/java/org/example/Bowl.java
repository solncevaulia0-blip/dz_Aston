package org.example;
public class Bowl {

    private int food;

    public Bowl(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int foodAmount) {
        food -= foodAmount;
    }

    public void addFood(int food) {
        this.food += food;
    }
}