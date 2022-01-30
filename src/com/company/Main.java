package com.company;

import java.util.Random;

public class Main {
    public static String ageAndTemperature(int men, int temp) {
        System.out.println("Возраст человека = " + generateRandomAge() + " Температура на улице = " + temp);
        if (men > 20 && men < 45 && temp > -20 && temp < 30) {
            System.out.println("Можно идти гулять");
        } else if (men < 20 && temp >= 0 && temp < 28) {
            System.out.println("Можно идти гулять");
        } else if (men > 45 && temp > -10 && temp < 25) {
            System.out.println("Можно идти гулять");
        } else {
            System.out.println("Оставайтесь дома");
        }
        return "Возраст человека = " + men + " Температура на улице = " + temp;
    }

    public static int generateRandomAge() {
        Random random = new Random();
        int x = random.nextInt(70) + 1;
        return x;
    }

    public static void main(String[] args) {

        ageAndTemperature(16, -23);
        ageAndTemperature(25, 27);
        ageAndTemperature(75, 12);
        ageAndTemperature(5, -11);
        ageAndTemperature(40, 17);
        generateRandomAge();

    }

}
