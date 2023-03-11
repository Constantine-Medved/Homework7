public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8Solution1();
        task8Solution2();
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
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i > 0; i--) {
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
        for (; year <= 10; year++) {
            population = population + (population / 1000) * (annualBirthsPer1000 - annualDeathsPer1000);
            System.out.println("Год " + year + ", численность населения составляет " + population + ".");
        }
    }
    public static void task4() {
        System.out.println("Задача 4.");
        double monthSavings = 15000;
        double totalSavings = 0;
        int monthNo = 0;
        while (totalSavings < 12_000_000) {
            monthNo++;
            totalSavings = totalSavings + totalSavings * 0.07;
            totalSavings = totalSavings + monthSavings;
            System.out.print("Месяц " + monthNo + ", сумма накоплений равна ");
            System.out.printf("%.2f", totalSavings);
            System.out.println(" рублей.");
        }
        System.out.println("Чтобы накопить 12000000 рублей, потребуется " + monthNo + " месяцев.");
    }
    public static void task5() {
        System.out.println("Задача 5.");
        double monthSavings = 15000;
        double totalSavings = 0;
        int monthNo = 0;
        while (totalSavings < 12_000_000) {
            monthNo++;
            totalSavings = totalSavings + totalSavings * 0.07;
            totalSavings = totalSavings + monthSavings;
            if (monthNo % 6 == 0) {
                System.out.print("Месяц " + monthNo + ", сумма накоплений равна ");
                System.out.printf("%.2f", totalSavings);
                System.out.println(" рублей.");
            }
        }
        System.out.println("Чтобы накопить 12000000 рублей, потребуется " + monthNo + " месяцев.");
    }
    public static void task6() {
        System.out.println("Задача 6.");
        double monthSavings = 15000;
        double totalSavings = 0;
        int monthNo = 0;
        while (monthNo < 12 * 9) {
            monthNo++;
            totalSavings = totalSavings + totalSavings * 0.07;
            totalSavings = totalSavings + monthSavings;
            if (monthNo % 6 == 0) {
                System.out.print("Месяц " + monthNo + ", сумма накоплений равна ");
                System.out.printf("%.2f", totalSavings);
                System.out.println(" рублей.");
            }
        }
        System.out.print("Всего за 9 лет получится накопить ");
        System.out.printf("%.2f", totalSavings);
        System.out.println(" рублей.");
    }
    public static void task7() {
        System.out.println("Задача 7.");
        int friday = 2;
        if (friday > 7) {
            System.out.println("Пожалуйста, укажите порядковый номер дня первой пятницы в первой неделе месяца: от 1 до 7.");
        } else {
            for (; friday < 31; friday += 7) {
                System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
            }
        }
    }
    public static void task8Solution1() {
        System.out.println("Задача 8. Вариант решения 1 (For).");
        int currentYear = 2023;
        for (int year = 0; year < currentYear + 100; year += 79) {
            if (year > currentYear - 200) {
                System.out.println(year);
            }
        }
    }
    public static void task8Solution2() {
        System.out.println("Задача 8.Вариант решения 2 (While).");
        int currentYear = 2023;
        int before200Years = currentYear - 200;
        int after100Years = currentYear + 100;
        int yearComet = before200Years;
        while (yearComet < after100Years) {
            yearComet++;
            if (yearComet % 79 == 0) {
                System.out.println(yearComet);
            }
        }
    }
}