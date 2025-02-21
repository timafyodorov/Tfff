public class Main {
    public static void main(String[] args) {
        byte clientOS = 1;
        int clientDeviceYear = 2015;
        int year = 2021;
        int deliveryDistance = 95;
        byte days = 1;
        byte monthNumber = 12;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            }
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
        } else {
            System.out.println("Неизвестная операционная система."); // Обработка некорректного clientOS
        }

        if (year < 1584) {
            System.out.println(year + " год должен быть больше 1584 для определения високосности.");
        } else {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " год является високосным.");
            } else {
                System.out.println(year + " год не является високосным.");
            }
        }

        if (deliveryDistance < 0) {
            System.out.println("Некорректное значение расстояния.");
        } else if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (days + 1));
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (days + 2));
        } else {
            System.out.println("Доставки нет.");
        }

        if (monthNumber >= 1 && monthNumber <= 12) {
            String season = "";
            switch (monthNumber) {
                case 1, 2, 12:
                    season = "Зима";
                    break;
                case 3, 4, 5:
                    season = "Весна";
                    break;
                case 6, 7, 8:
                    season = "Лето";
                    break;
                case 9, 10, 11:
                    season = "Осень";
                    break;
            }
            System.out.println(season);
        } else {
            System.out.println("Номер месяца больше возможного.");
        }
    }
}