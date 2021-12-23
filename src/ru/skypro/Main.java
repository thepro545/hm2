package ru.skypro;

public class Main {

    public static void main(String[] args) {

        int weight = 7000;
        int lost1 = 250;
        int lost2 = 500;

        int res1 = 7000/250;
        int res2 = 7000/500;

        System.out.println("Нужно " + res1 + " дней, чтобы похудеть (при 250 гр в день)");
        System.out.println("Нужно " + res2 + " дней, чтобы похудеть (при 500 гр в день)");
        System.out.println("В среднем нужен " + ((res1+res2)/2) + " день, чтобы похудеть");
    }
}
