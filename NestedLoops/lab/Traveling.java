package NestedLoops.lab;

import java.util.Scanner;

public class Traveling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination1 = scanner.nextLine();
        double budget1 = Double.parseDouble(scanner.nextLine());

        double sumSavings = 0.0;
        while (!destination1.equals("End")) {

            while (sumSavings < budget1) {
                double savings = Double.parseDouble(scanner.nextLine());
                sumSavings = sumSavings + savings;
            }
            System.out.printf("Going to %s!%n", destination1);
            sumSavings = 0.0;
            destination1 = scanner.nextLine();
            if (destination1.equals("End")) {
                break;
            }
            budget1 = Double.parseDouble(scanner.nextLine());
        }

    }
}
