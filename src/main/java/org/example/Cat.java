package org.example;

public class Cat extends Animal {

    public static int catsCount = 0;

    private boolean full = false;

    public Cat(String name) {
        super(name);
        catsCount++;
    }

    @Override
    public void run(int distance) {

        if (distance <= 200) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать столько.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eat(Bowl bowl, int foodAmount) {

        if (bowl.getFood() >= foodAmount) {

            bowl.decreaseFood(foodAmount);

            full = true;

            System.out.println(
                    name + " съел "
                            + foodAmount + " еды.");
        } else {

            System.out.println(
                    name + " не хватило еды.");
        }
    }

    public void printInfo() {
        System.out.println(
                name + " сытость: " + full);
    }
}