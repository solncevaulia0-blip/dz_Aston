package org.example;

public class Main4 {

    public static void main(String[] args) {

        Dog dog = new Dog("Бобик");
        Cat cat = new Cat("Барсик");

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
                new Cat("Мурзик"),
                new Cat("Рыжик"),
                new Cat("Снежок")
        };

        cats[0].eat(bowl, 10);
        cats[1].eat(bowl, 15);
        cats[2].eat(bowl, 20);

        System.out.println();

        for (int i = 0; i < cats.length; i++) {
            cats[i].printInfo();
        }

        System.out.println();

        bowl.addFood(20);

        System.out.println("Еды в миске: " + bowl.getFood());
    }
}