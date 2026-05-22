package org.example;

public class Animal {

    protected String name;

    public static int animalsCount = 0;

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