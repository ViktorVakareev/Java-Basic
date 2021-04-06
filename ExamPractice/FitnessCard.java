package ExamPractice;

import java.util.Scanner;

public class FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String sex = scanner.nextLine(); // m or f
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();

        double price = 0.0;
        switch (sport) {
            case ("Gym"):
                if (sex.equals("m")) {
                    price = 42;
                } else {
                    price = 35;
                }
                break;
            case ("Boxing"):
                if (sex.equals("m")) {
                    price = 41;
                } else {
                    price = 37;
                }
                break;
            case ("Yoga"):
                if (sex.equals("m")) {
                    price = 45;
                } else {
                    price = 42;
                }
                break;
            case ("Zumba"):
                if (sex.equals("m")) {
                    price = 34;
                } else {
                    price = 31;
                }
                break;
            case ("Dances"):
                if (sex.equals("m")) {
                    price = 51;
                } else {
                    price = 53;
                }
                break;
            case ("Pilates"):
                if (sex.equals("m")) {
                    price = 39;
                } else {
                    price = 37;
                }
                break;
        }
        if (age < 20) {
            price *= 0.80;
        }
        if (price > budget) {
            System.out.printf("You don't have enough money! You need $%.2f more.", price-budget);
        } else {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        }
    }
}
