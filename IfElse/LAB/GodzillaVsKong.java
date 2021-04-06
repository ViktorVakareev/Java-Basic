package IfElse.LAB;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int actors = Integer.parseInt(scanner.nextLine());
        double clothes = Double.parseDouble(scanner.nextLine());

        if (actors > 150) {
            clothes = 0.9*clothes;
        }

        double decor = budget*0.1;
        double result = decor + actors*clothes;
        double balance = budget - result; // Math.abs(balance) is absolute value

        if (result <= budget) {
            System.out.printf("Action! %nWingard starts filming with %.2f leva left.", balance);
        } else {
            System.out.printf("Not enough money! %nWingard needs %.2f leva more.", Math.abs(balance));
        }

    }
}
