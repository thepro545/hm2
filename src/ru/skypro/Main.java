package ru.skypro;

public class Main {

    public static void main(String[] args) {

        byte bananas = 80;
        byte milk = 105;
        byte icecream = 100;
        byte eggs = 70;

        float breakfast = bananas * 5 + milk * 2 + icecream * 2 + eggs * 4;

        System.out.println("Вес завтрака = " + breakfast + " грамм");
        System.out.println("Вес завтрака = " + breakfast/1000 + " кг");
    }
}
