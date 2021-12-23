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

        byte bananas = 80;
        byte milk = 105;
        byte icecream = 100;
        byte eggs = 70;

        float breakfast = bananas * 5 + milk * 2 + icecream * 2 + eggs * 4;

        System.out.println("Вес завтрака = " + breakfast + " грамм");
        System.out.println("Вес завтрака = " + breakfast/1000 + " кг");

// Задание 4

        int weight = 7000;
        int lost1 = 250;
        int lost2 = 500;

        int res1 = 7000/250;
        int res2 = 7000/500;

        System.out.println("Нужно " + res1 + " дней, чтобы похудеть (при 250 гр в день)");
        System.out.println("Нужно " + res2 + " дней, чтобы похудеть (при 500 гр в день)");
        System.out.println("В среднем нужен " + ((res1+res2)/2) + " день, чтобы похудеть");

// Задание 5

        int salaryM = 67760;
        int salaryD = 83690;
        int salaryK = 76230;

        int sMy = salaryM * 12;
        int sDy = salaryD * 12;
        int sKy = salaryK * 12;

        System.out.println("Маша теперь получает " + sMy*1.1 + " рублей. Годовой доход вырос на " + (sMy*1.1-sMy) + " рублей");
        System.out.println("Денис теперь получает " + sDy*1.1 + " рублей. Годовой доход вырос на " + (sDy*1.1-sDy) + " рублей");
        System.out.println("Кристина теперь получает " + sKy*1.1 + " рублей. Годовой доход вырос на " + (sKy*1.1-sKy) + " рублей");
    }
}