package org.example;

public class Main42 {
    public static void main(String[] args) {
        Figure circle =
                new Circle(5, "Красный", "Черный");
        Figure rectangle =
                new Rectangle(4, 6,
                        "Синий", "Белый");
        Figure triangle =
                new Triangle(3, 4, 5,
                        "Желтый", "Зеленый");
        System.out.println("Круг:");
        circle.printInfo();
        System.out.println("Прямоугольник:");
        rectangle.printInfo();
        System.out.println("Треугольник:");
        triangle.printInfo();
    }
}


