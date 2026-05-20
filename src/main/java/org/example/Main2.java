package org.example;


public class Main2 {

    public static void main(String[] args) {

        // Массив товаров
        Product[] productsArray = new Product[5];

        productsArray[0] = new Product(
                "Samsung S25 Ultra",
                "01.02.2025",
                "Samsung Corp.",
                "Korea",
                5599,
                true);

        productsArray[1] = new Product(
                "iPhone 17",
                "10.01.2025",
                "Apple",
                "USA",
                6200,
                false);

        productsArray[2] = new Product(
                "Lenovo Laptop",
                "15.03.2025",
                "Lenovo",
                "China",
                4500,
                true);

        productsArray[3] = new Product(
                "Sony TV",
                "20.04.2025",
                "Sony",
                "Japan",
                3900,
                false);

        productsArray[4] = new Product(
                "Xiaomi Phone",
                "11.05.2025",
                "Xiaomi",
                "China",
                2200,
                true);

        // Вывод товаров
        System.out.println("Товары:");

        for (int i = 0; i < productsArray.length; i++) {
            productsArray[i].printInfo();
            System.out.println();
        }

        // Park и внутренний класс
        Park park = new Park();

        Park.Attraction attraction1 = park.new Attraction(
                "Колесо обозрения",
                "10:00 - 22:00",
                15);

        Park.Attraction attraction2 = park.new Attraction(
                "Американские горки",
                "11:00 - 23:00",
                25);

        System.out.println("Аттракционы:");

        attraction1.printInfo();
        attraction2.printInfo();
    }
}

class Product {

    String name;
    String productionDate;
    String manufacturer;
    String country;
    double price;
    boolean reserved;

    public Product(String name,
                   String productionDate,
                   String manufacturer,
                   String country,
                   double price,
                   boolean reserved) {

        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.reserved = reserved;
    }

    public void printInfo() {
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна: " + country);
        System.out.println("Цена: " + price);
        System.out.println("Забронирован: " + reserved);
    }
}

class Park {

    class Attraction {

        String name;
        String workingTime;
        double price;

        public Attraction(String name,
                          String workingTime,
                          double price) {

            this.name = name;
            this.workingTime = workingTime;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workingTime);
            System.out.println("Стоимость: " + price);
        }
    }
}