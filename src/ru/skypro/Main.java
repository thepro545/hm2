package ru.skypro;
// Задание 1
public class Main {

    public static void main(String[] args) {

        byte test1 = 100;
        short test2 = 32000;
        int test3 = 2000000;
        long test4 = 9000000000L;
        float test5 = 2312.2021f;
        double test6 = 23122021.23122021;

        System.out.println ("Выводить ведь не надо  `|_(0-o)_/`");


// Задание 2

        float boxerWeight1 = 78.2f;
        float boxerWeight2 = 82.7f;

        System.out.println("Общий вес бойцов = " + (boxerWeight1 + boxerWeight2) + " кг");
        System.out.println("Разница в весе бойцов = " + (boxerWeight2 - boxerWeight1) + " кг");

// Задание 3

        int bananas = 80;
        int countOfBananas = 5;
        int milk = 105;
        int countOfMilk = 2;
        int iceCream = 100;
        int countOfIceCream = 2;
        int eggs = 70;
        int countOfEggs = 4;
        int gramInKg = 1000;

        float breakfast = bananas * countOfBananas + milk * countOfMilk + iceCream * countOfIceCream + eggs * countOfEggs;
        float gramsInKil = breakfast/gramInKg;

        System.out.println("Вес завтрака = " + breakfast + " грамм");
        System.out.println("Вес завтрака = " + gramsInKil + " кг");

// Задание 4

        int weight = 7000;
        int lost250 = 250;
        int lost500 = 500;

        int daysIfLost250 = weight/lost250;
        int daysIfLost500 = weight/lost500;

        System.out.println("Нужно " + daysIfLost250 + " дней, чтобы похудеть (при 250 гр в день)");
        System.out.println("Нужно " + daysIfLost500 + " дней, чтобы похудеть (при 500 гр в день)");
        System.out.println("В среднем нужен " + ((daysIfLost250+daysIfLost500)/2) + " день, чтобы похудеть");

// Задание 5

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKris = 76230;
        int percent = 10;

        int salaryMashaYear = salaryMasha * 12;
        int salaryDenisYear = salaryDenis * 12;
        int salaryKrisYear = salaryKris * 12;

        float salaryMashaYearAfter = salaryMashaYear * (1+percent/100f);
        float salaryDenisYearAfter = salaryDenisYear * (1+percent/100f);
        float salaryKrisYearAfter = salaryKrisYear * (1+percent/100f);

//        System.out.printf("%.0f", salaryMashaYearAfter);
//        System.out.println();
        System.out.println("Маша теперь получает " + salaryMashaYearAfter + " рублей. Годовой доход вырос на " + (salaryMashaYearAfter-salaryMashaYear) + " рублей");
        System.out.println("Денис теперь получает " + salaryDenisYearAfter + " рублей. Годовой доход вырос на " + (salaryDenisYearAfter-salaryDenisYear) + " рублей");
        System.out.println("Кристина теперь получает " + salaryKrisYearAfter + " рублей. Годовой доход вырос на " + (salaryKrisYearAfter-salaryKrisYear) + " рублей");
    }
}