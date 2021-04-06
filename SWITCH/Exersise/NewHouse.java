package SWITCH.Exersise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine()); // брой цветя
        int budget = Integer.parseInt(scanner.nextLine());

        double price = 0.0;

        switch (flower) {
            case "Roses":

                if (count > 80) {
                    price = count * 5 * 0.9;
                } else
                    price = count * 5;
                break;
            case "Dahlias":
                if (count > 90) {
                    price = count * 3.80 * 0.85;
                } else
                    price = count * 3.80;
                break;
            case "Tulips":
                if (count > 80) {
                    price = count * 2.80 * 0.85;
                } else
                    price = count * 2.80;
                break;
            case "Narcissus":
                if (count < 120) {
                    price = count * 3 * 1.15;
                } else
                    price = count * 3.0;
                break;
            case "Gladiolus":
                if (count < 80) {
                    price = count * 2.5 * 1.20;
                } else
                    price = count * 2.5;
                break;
        }
        //double total = budget - price;
        if (budget >= price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, flower, budget - price);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(budget - price));
        }


    }
}
