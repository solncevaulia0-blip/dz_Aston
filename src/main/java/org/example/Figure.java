package org.example;
interface Figure {
    // методы, которые обязаны реализовать фигуры
    double getArea();
    String getFillColor();
    String getBorderColor();
    // default метод для периметра
    default double getPerimeter() {
        return 0;
    }
    // default метод вывода информации
    default void printInfo() {
        System.out.println("Периметр: " + getPerimeter());
        System.out.println("Площадь: " + getArea());
        System.out.println("Цвет фона: " + getFillColor());
        System.out.println("Цвет границы: " + getBorderColor());
        System.out.println();
    }
}
