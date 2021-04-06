package WhileLoop.lab;

import java.util.Scanner;

public class ComputerClub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int hours = Integer.parseInt(scanner.nextLine());
        int group = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine();

        double pricePerHour = 0.0;

        if (month.equals("march") || month.equals("april") || month.equals("may")) {
            if (timeOfDay.equals("day")) {
                pricePerHour = 10.50;
                if (group >= 4) {
                    pricePerHour *= 0.9;
                }
                if (hours >= 5) {
                    pricePerHour *= 0.5;
                }

            } else if (timeOfDay.equals("night")) {
                pricePerHour = 8.40;
                if (group >= 4) {
                    pricePerHour *= 0.9;
                }
                if (hours >= 5) {
                    pricePerHour *= 0.5;
                }
            }
        } else if (month.equals("june") || month.equals("july") || month.equals("august")) {
            if (timeOfDay.equals("day")) {
                pricePerHour = 12.60;
                if (group >= 4) {
                    pricePerHour *= 0.9;
                }
                if (hours >= 5) {
                    pricePerHour *= 0.5;
                }

            } else if (timeOfDay.equals("night")) {
                pricePerHour = 10.20;
                if (group >= 4) {
                    pricePerHour *= 0.9;
                }
                if (hours >= 5) {
                    pricePerHour *= 0.5;
                }
            }
        }
        double totalCost = hours * pricePerHour * group;
        System.out.printf("Price per person for one hour: %.2f%n", pricePerHour);
        System.out.printf("Total cost of the visit: %.2f", totalCost);
    }

}

