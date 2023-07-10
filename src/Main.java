import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void findLeapYear(int year) {
        if ((year % 4 == 0 && year / 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task1() {
        System.out.println("Задача 1");

        int year = 2021;
        findLeapYear(year);
    }

    public static void findVersion(int year, int clientOS) {
        if (clientOS == 0) {
            if (year < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (year < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void task2() {
        System.out.println("Задача 2");

        int currentYear = LocalDate.now().getYear();
        int clientOS = 0;
        findVersion(currentYear, clientOS);
    }

    public static int findDeliveryTime(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return 1;
        } else if (deliveryDistance < 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        } else {
            return (404);
        }
    }

    public static void task3() {
        System.out.println("Задача 3");

        int deliveryDistance = 95;
        System.out.println("Потребуется дней: " + findDeliveryTime(deliveryDistance));
    }
}
