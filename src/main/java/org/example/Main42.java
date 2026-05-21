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


// ---------------- КРУГ ----------------

class Circle implements Figure {

    double radius;
    String fillColor;
    String borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}


// ---------------- ПРЯМОУГОЛЬНИК ----------------

class Rectangle implements Figure {

    double width;
    double height;
    String fillColor;
    String borderColor;

    public Rectangle(double width, double height,
                     String fillColor, String borderColor) {

        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}


// ---------------- ТРЕУГОЛЬНИК ----------------

class Triangle implements Figure {

    double a;
    double b;
    double c;
    String fillColor;
    String borderColor;

    public Triangle(double a, double b, double c,
                    String fillColor, String borderColor) {

        this.a = a;
        this.b = b;
        this.c = c;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getArea() {

        // формула Герона
        double p = getPerimeter() / 2;

        return Math.sqrt(
                p * (p - a) * (p - b) * (p - c)
        );
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

