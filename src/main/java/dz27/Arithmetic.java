package dz27;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Первое число:");
        int a = sc.nextInt();

        System.out.println("Второе число:");
        int b = sc.nextInt();

        System.out.println("Сложение: " + (a + b));
        System.out.println("Вычитание: " + (a - b));
        System.out.println("Умножение: " + (a * b));
        System.out.println("Деление: " + (a / b));
    }
}
