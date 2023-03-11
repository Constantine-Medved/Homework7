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
    }

    public static void task1() {
        System.out.println("Задача 1.");
        int monthSavings = 15000;
        int totalSavings = 0;
        int monthNo = 0;
        while (totalSavings < 2_459_000) {
            monthNo = monthNo + 1;
            totalSavings = totalSavings + monthSavings;
            System.out.println("Месяц " + monthNo + ", сумма накоплений равна " + totalSavings + " рублей.");
        }
        System.out.println("Чтобы накопить 2459000 рублей, потребуется " + monthNo + " месяцев.");
    }

    public static void task2() {
        System.out.println("Задача 2.");
        int i = 0;
        while (i <10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (;i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3.");
        int population = 12_000_000;
        int annualBirthsPer1000 = 17;
        int annualDeathsPer1000 = 8;
        int year = 1;
        System.out.println("На начало года " + year + ", численность населения составляет " + population + ".");
        for (;year <=10;year++) {
            population = population + (population/1000)*(annualBirthsPer1000 - annualDeathsPer1000);
            System.out.println("Год " + year + ", численность населения составляет " + population + ".");
        }
    }

    public static void task4() {
        System.out.println("Задача 4.");
    }

    public static void task5() {
        System.out.println("Задача 5.");
    }

    public static void task6() {
        System.out.println("Задача 6.");
    }

    public static void task7() {
        System.out.println("Задача 7.");
    }

    public static void task8() {
        System.out.println("Задача 8.");
    }
}