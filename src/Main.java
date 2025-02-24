public class Main {
    public static void main(String[] args) {
        byte clientOS = 1;
        int clientDeviceYear = 2015;
        int year = 2021;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else {
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите полную версию приложения для iOS по ссылке.");
                }
            }
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            } else {
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите полную версию приложения для Android по ссылке.");
                }
            }
        } else {
            System.out.println("Неизвестная операционная система.");
        }

        if (year < 1584) {
            System.out.println(year + " год должен быть больше 1584 для определения високосности.");
        } else {
            if (year % 4 == 0) {
                if (year % 100 != 0) {
                    System.out.println(year + " год является високосным.");
                } else {
                    if (year % 400 == 0) {
                        System.out.println(year + " год является високосным.");
                    } else {
                        System.out.println(year + " год не является високосным.");
                    }
                }
            } else {
                System.out.println(year + " год не является високосным.");
            }
        }


        int deliveryDistance = 95;
        String days = "";
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

        int monthNumber = 12;
        if (monthNumber >= 1 && monthNumber <= 12) {
            String season = "";
            switch (monthNumber) {
                case 1:
                case 2:
                case 12:
                    season = "Зима";
                    break;
                case 3:
                case 4:
                case 5:
                    season = "Весна";
                    break;
                case 6:
                case 7:
                case 8:
                    season = "Лето";
                    break;
                case 9:
                case 10:
                case 11:
                    season = "Осень";
                    break;
            }
            System.out.println(season);
        } else {
            System.out.println("Номер месяца больше возможного.");
        }
    }
}
