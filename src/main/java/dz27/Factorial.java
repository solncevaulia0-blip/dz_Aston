package dz27;

import java.util.Scanner;

public class Factorial {

    public static int calculateFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = sc.nextInt();
        System.out.println("Факториал = " + calculateFactorial(n));
    }
}