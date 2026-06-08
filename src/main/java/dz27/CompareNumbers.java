package dz27;

import java.util.Scanner;

public class CompareNumbers {

    public static String compare(int a, int b) {

        if (a > b) {
            return "Первое больше";
        } else if (a < b) {
            return "Второе больше";
        }
        return "Числа равны";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Первое число:");
        int a = sc.nextInt();
        System.out.println("Второе число:");
        int b = sc.nextInt();
        System.out.println(compare(a, b));
    }
}
