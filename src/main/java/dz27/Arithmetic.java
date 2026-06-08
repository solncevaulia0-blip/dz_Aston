package dz27;

import java.util.Scanner;

public class Arithmetic {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Первое число:");
        int a = sc.nextInt();
        System.out.println("Второе число:");
        int b = sc.nextInt();
        System.out.println("Сложение: " + add(a, b));
        System.out.println("Вычитание: " + subtract(a, b));
        System.out.println("Умножение: " + multiply(a, b));
        System.out.println("Деление: " + divide(a, b));
    }
}
