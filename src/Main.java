public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();

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

    }

    private static void task5() {
        System.out.println("Задача 5");

    }

    private static void task6() {
        System.out.println("Задача 6");
    }

    private static void task7() {
        System.out.println("Задача 7");

    }

    private static void task8() {
        System.out.println("Задача 8");

    }

    private static void task9() {
        System.out.println("Задача 9");

    }

    private static void task10() {

    }
}