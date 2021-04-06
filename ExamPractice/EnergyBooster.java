package ExamPractice;

import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String pack = scanner.nextLine();
        int packCount = Integer.parseInt(scanner.nextLine());

        double gelPrice = 0.0;
        switch (fruit) {
            case ("Watermelon"):
                if (pack.equals("small")) {
                    gelPrice = 56*2;
                } else {
                    gelPrice = 28.70*5;
                }
                break;
            case ("Mango"):
                if (pack.equals("small")) {
                    gelPrice = 36.66*2;
                } else {
                    gelPrice = 19.60*5;
                }
                break;
            case ("Pineapple"):
                if (pack.equals("small")) {
                    gelPrice = 42.10*2;
                } else {
                    gelPrice = 24.80*5;
                }
                break;
            case ("Raspberry"):
                if (pack.equals("small")) {
                    gelPrice = 20*2;
                } else {
                    gelPrice = 15.20*5;
                }
                break;
        }
        double totalPrice = gelPrice * packCount;
        if (totalPrice > 399 && totalPrice <=1000) {
            totalPrice *= 0.85;
        } else if (totalPrice > 1000) {
            totalPrice *= 0.5;
        }
        System.out.printf("%.2f lv.", totalPrice);

    }
}