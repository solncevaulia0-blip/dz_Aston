package Homework5;

public class Main45 {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "abc", "12"},
                {"13", "14", "15", "16"}
        };
        try {
            int result = ArrayProcessor.sumArray(array);
            System.out.println("Сумма = " + result);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера массива: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка данных массива: " + e.getMessage());
        }
        try {
            int[] numbers = new int[3];
            numbers[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймали ArrayIndexOutOfBoundsException");
        }
    }
}
