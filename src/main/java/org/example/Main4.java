package org.example;


public class Main4 {

    public static void main(String[] args) {

        Dog dog = new Dog("Бобик");
        Cat cat = new Cat("Барсик", 15);

        dog.run(300);
        dog.swim(5);

        cat.run(150);
        cat.swim(2);

        System.out.println();

        System.out.println("Животных: " + Animal.animalsCount);
        System.out.println("Собак: " + Dog.dogsCount);
        System.out.println("Котов: " + Cat.catsCount);

        System.out.println();

        Bowl bowl = new Bowl(30);

        Cat[] cats = {
                new Cat("Мурзик", 10),
                new Cat("Рыжик", 15),
                new Cat("Снежок", 20)
        };

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(bowl);
        }

        System.out.println();

        for (int i = 0; i < cats.length; i++) {
            cats[i].printInfo();
        }

        System.out.println();

        bowl.addFood(20);

        System.out.println("Еды в миске: " + bowl.food);
    }
}

class Animal {

    String name;

    static int animalsCount = 0;

    public Animal(String name) {
        this.name = name;
        animalsCount++;
    }

    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " м.");
    }

    public void swim(int distance) {
        System.out.println(name + " проплыл " + distance + " м.");
    }
}

class Dog extends Animal {

    static int dogsCount = 0;

    public Dog(String name) {
        super(name);
        dogsCount++;
    }

    @Override
    public void run(int distance) {

        if (distance <= 500) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать столько.");
        }
    }

    @Override
    public void swim(int distance) {

        if (distance <= 10) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть столько.");
        }
    }
}

class Cat extends Animal {

    static int catsCount = 0;

    int appetite;

    boolean full = false;

    public Cat(String name, int appetite) {
        super(name);
        this.appetite = appetite;
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

    public void eat(Bowl bowl) {

        if (bowl.food >= appetite) {

            bowl.food -= appetite;

            full = true;

            System.out.println(name + " покушал.");
        } else {
            System.out.println(name + " не хватило еды.");
        }
    }

    public void printInfo() {
        System.out.println(name + " сытость: " + full);
    }
}

class Bowl {

    int food;

    public Bowl(int food) {
        this.food = food;
    }

    public void addFood(int food) {
        this.food += food;
    }
}