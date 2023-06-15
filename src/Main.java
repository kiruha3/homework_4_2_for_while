public class Main {
    public static void main(String[] args) {
        // task1();
//        task2();
//        task3();
        //task4();
        //task5();
        //task6();
        //task7();
        task8();

    }

    private static void task1() {
        System.out.println("Задача 1");
        int nowVklad = 0;
        int moneyPerMonth = 15_000;
        int allSum = 2_459_000;
        int i = 0;
        while (allSum > nowVklad) {
            i++;
            nowVklad += moneyPerMonth;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + nowVklad + " рублей");
        }
    }

    private static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i <= 10) {
            System.out.printf(i++ + " ");
        }
        System.out.println();

        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    private static void task3() {
        System.out.println("Задача 3");
        int humanY = 12_000_000;
        int souls = 1000;
        int fertilityPerYearOnThousand = 17;
        int diePerYearOnThousand = 8;
        int fertPerYear = 0;
        int diePerYear = 0;
        for (int i = 1; i <= 10; i++) {
            fertPerYear = humanY / souls * fertilityPerYearOnThousand;
            diePerYear = humanY / souls * diePerYearOnThousand;
            humanY = humanY + fertPerYear - diePerYear;
            System.out.println("Год " + i + ", численность населения составляет " + humanY);
        }
    }

    private static void task4() {
        System.out.println("Задача 4");
        int dreamMoneyFinally = 12_000_000;
        double nowMoney = 0;

        int firstDepoit = 15_000;

        float yearPercent = 0.07f;

        float monthPercent = yearPercent + 1;
        nowMoney += firstDepoit;
        int i = 0;
        while (dreamMoneyFinally > nowMoney) {
            i++;
            nowMoney = nowMoney * monthPercent;
            System.out.printf("Месяц %d, денег на текущий месец вклад имеет %.2f %n", i, nowMoney);
        }
    }

    private static void task5() {
        System.out.println("Задача 5");
        int dreamMoneyFinally = 12_000_000;
        double nowMoney = 0;

        int firstDepoit = 15_000;

        float yearPercent = 0.07f;

        float monthPercent = yearPercent + 1;
        nowMoney += firstDepoit;
        int i = 0;
        while (dreamMoneyFinally > nowMoney) {
            i++;
            nowMoney = nowMoney * monthPercent;
            if (i % 6 == 0) {
                System.out.printf("Месяц %d, денег на текущий месец вклад имеет %.2f %n", i, nowMoney);
            }
        }
    }

    private static void task6() {
        System.out.println("Задача 6");
        double nowMoney = 0;

        int firstDepoit = 15_000;

        float yearPercent = 0.07f;

        int year = 12;
        int halfYear = year / 2;
        int countYear = 9;
        int countAllMonth = year * countYear;

        float monthPercent = yearPercent + 1;
        nowMoney += firstDepoit;
        int i = 0;
        while (i <= countAllMonth) {
            i++;
            nowMoney = nowMoney * monthPercent;
            if (i % halfYear == 0) {
                System.out.printf("Месяц %d, денег на текущий месец вклад имеет %.2f %n", i, nowMoney);
            }
        }

    }

    private static void task7() {
        System.out.println("Задача 7");
        int firtFriday = 2;
        int oneWeek = 7;
        int dayPerMonth = 31;
        int i = firtFriday;
        while (i < 31) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
            i += oneWeek;
        }
    }

    private static void task8() {
        System.out.println("Задача 8");
        int nowYear = 2023;
        int distanceBetweenKometa = 79;
        int intervalEnter = 200;
        int intervalFuture = 100;
        for (int i = nowYear - intervalEnter; i < nowYear + intervalFuture; i++) {
            if (i % distanceBetweenKometa == 0) {
                System.out.println(i);
            }
        }
    }

}