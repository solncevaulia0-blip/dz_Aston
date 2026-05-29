package dz26;

public class Main26_2 {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "111111");
        phoneBook.add("Петров", "222222");
        phoneBook.add("Иванов", "333333");
        phoneBook.add("Сидоров", "444444");

        phoneBook.get("Иванов");
        phoneBook.get("Петров");
        phoneBook.get("Смирнов");
    }
}