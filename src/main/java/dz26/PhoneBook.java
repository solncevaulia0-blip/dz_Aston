package dz26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    
    private Map<String, ArrayList<String>> book;
    public PhoneBook() {
        book = new HashMap<>();
    }
    
    public void add(String surname, String phone) {
        if (!book.containsKey(surname)) {
            book.put(surname, new ArrayList<>());
        }
        book.get(surname).add(phone);
    }
    public void get(String surname) {
        if (book.containsKey(surname)) {
            System.out.println(surname + ": " + book.get(surname));
        } else {
            System.out.println("Фамилия не найдена");
        }
    }
}
