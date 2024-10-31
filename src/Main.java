import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 2024;
        checkYear(year);
        System.out.println();

        System.out.println("Задача 2");
        int clientDeviceYear = 2024;
        byte typeOS = 1;
        choiceVersion(typeOS, clientDeviceYear);
        System.out.println();

        System.out.println("Задача 3");
        int deliveryDistance = 99;
        System.out.println(checkDistance(deliveryDistance));
    }

    //Задача 1
    public static void checkYear(int year) {
        if ((year > 1584) && (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    //Задача 2
    public static void choiceVersion(byte type, int year) {
        int currentYear = LocalDate.now().getYear();
        if (type < 0 || type > 1) {
            System.out.println("Введите корректный тип ОС");
            return;
        }
        if (year > currentYear) {
            System.out.println("Введите корректный год");
            return;
        }
        if (type == 0 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (type == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (year < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    //Задача 3
    public static String checkDistance(int distance) {
        int deliveryTime = 1; //сутки
        int result = 0;
        if (distance < 0) {
            return "Введите корректное расстояние";
        }
        if (distance <= 20) {
            result = deliveryTime;
        } else if (distance <= 60) {
            result = deliveryTime + 1;
        } else if (distance <= 100) {
            result = deliveryTime + 2;
        } else {
            return "Доставки нет";
        }
        return "Потребуется " + Integer.toString(result) + (result == 1 ? " день" : " дня");
    }
}