package dz27;

import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Основание:");
        double a = sc.nextDouble();
        System.out.println("Высота:");
        double h = sc.nextDouble();
        double area = (a * h) / 2;
        System.out.println("Площадь = " + area);
    }
}