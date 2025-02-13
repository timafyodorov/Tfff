


import java.util.Scanner;  // Импортируем класс Scanner

public class Main {
    public static void main(String[] args) {
        // Создаем один объект Scanner для ввода данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Вводим возраст человека
        System.out.print("Введите возраст человека: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }


        System.out.print("Введите температуру: ");
        int temperature = scanner.nextInt();  // Вводим число

        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }


        System.out.print("Введите скорость автомобиля: ");
        int speed = scanner.nextInt();
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно.");
        }


        System.out.print("Введите возраст человека: ");
        int years = scanner.nextInt();

        if (years >= 2 && years <= 6) {
            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить в детский сад.");
        } else if (years >= 7 && years <= 17) {
            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить в школу.");
        } else if (years >= 18 && years <= 24) {
            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить в университет.");
        } else if (years > 24) {
            System.out.println("Если возраст человека равен " + years + ", то ему пора ходить на работу.");
        }


        System.out.print("Введите количество людей в вагоне: ");
        int peopleInTrain = scanner.nextInt();
        if (peopleInTrain < 102) {
            if (peopleInTrain < 60) {
                System.out.println("Есть сидячие места.");
            } else {
                System.out.println("Есть только стоячие места.");
            }
        } else {
            System.out.println("Вагон полностью забит.");
        }


        System.out.print("Введите первое число: ");
        int one = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int two = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int three = scanner.nextInt();

        if (one >= two && one >= three) {
            System.out.println("Наибольшее число: " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Наибольшее число: " + two);
        } else {
            System.out.println("Наибольшее число: " + three);
        }


        scanner.close();
    }
}

