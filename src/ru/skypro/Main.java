package ru.skypro;

public class Main {

    public static void main(String[] args) {

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
