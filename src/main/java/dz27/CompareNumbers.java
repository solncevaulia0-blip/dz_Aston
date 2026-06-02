package dz27;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Первое число:");
        int a = sc.nextInt();

        System.out.println("Второе число:");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Первое больше");
        } else if (a < b) {
            System.out.println("Второе больше");
        } else {
            System.out.println("Числа равны");
        }
    }
}
