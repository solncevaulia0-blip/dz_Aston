import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // 1
        printThreeWords();

        // 2
        checkSumSign();

        // 3
        printColor();

        // 4
        compareNumbers();

        // 5
        System.out.println(checkSum(5, 10));

        // 6
        checkNumber(-5);

        // 7
        System.out.println(isNegative(-10));

        // 8
        printString("Привет", 3);

        // 9
        System.out.println(isLeapYear(2024));

        // 10
        changeArray();

        // 11
        fillArray();

        // 12
        multiplyLessThanSix();

        // 13
        fillDiagonal();

        // 14
        int[] resultArray = createArray(5, 7);
        System.out.println(Arrays.toString(resultArray));
    }

    // 1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // 2
    public static void checkSumSign() {
        int a = 5;
        int b = -3;

        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // 3
    public static void printColor() {
        int value = 101;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // 4
    public static void compareNumbers() {
        int a = 10;
        int b = 5;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // 5
    public static boolean checkSum(int a, int b) {
        int sum = a + b;

        return sum >= 10 && sum <= 20;
    }

    // 6
    public static void checkNumber(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    // 7
    public static boolean isNegative(int number) {
        return number < 0;
    }

    // 8
    public static void printString(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    // 9
    public static boolean isLeapYear(int year) {

        if (year % 400 == 0) {
            return true;
        }

        if (year % 100 == 0) {
            return false;
        }

        return year % 4 == 0;
    }

    // 10
    public static void changeArray() {

        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < array.length; i++) {

            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }

        System.out.println(Arrays.toString(array));
    }

    // 11
    public static void fillArray() {

        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        System.out.println(Arrays.toString(array));
    }

    // 12
    public static void multiplyLessThanSix() {

        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < array.length; i++) {

            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }

        System.out.println(Arrays.toString(array));
    }

    // 13
    public static void fillDiagonal() {

        int size = 5;

        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++) {
            array[i][i] = 1;
        }

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }

            System.out.println();
        }
    }

    // 14
    public static int[] createArray(int len, int initialValue) {

        int[] array = new int[len];

        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }

        return array;
    }
}