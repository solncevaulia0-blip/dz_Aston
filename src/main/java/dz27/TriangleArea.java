package dz27;

import java.util.Scanner;
public class TriangleArea {

    public static double calculateArea(double a, double h) {
        return (a * h) / 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Основание:");
        double a = sc.nextDouble();
        System.out.println("Высота:");
        double h = sc.nextDouble();
        System.out.println("Площадь = " + calculateArea(a, h));
    }
}