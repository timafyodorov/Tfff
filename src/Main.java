public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        for (int a = 10; a >= 1; a--) {
            System.out.println(a);
        }

        for (int z = 0; z <= 17; z += 2) {
            System.out.println(z);
        }

        for (int y = 10; y >= -10; y--) {
            System.out.println(y);
        }

        for (int year = 1904; year <= 2096; year += 4) {
            System.out.println(year + " год является високосным");
        }

        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }


        int number = 1;
        while (number <= 512) {
            System.out.print(number + " ");
            number *= 2;
        }

        int monthlyDeposit = 29000;
        int totalSavings = 0;
        for (int month = 1; month <= 12; month++) {
            totalSavings += monthlyDeposit;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSavings + " рублей");
        }

        int monthlyContribution = 29000;
        double balance = 0;


        for (int month = 1; month <= 12; month++) {
            balance += monthlyContribution;
            balance += monthlyContribution * 0.01;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + String.format("%.2f", balance) + " рублей");
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + (2 * i));
        }


    }
}


