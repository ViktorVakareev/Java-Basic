package Exam12122020;

import java.util.Scanner;

public class ComputerRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine(); // "march", "april", "may", "june", "july", "august"
        int hours = Integer.parseInt(scanner.nextLine());
        int group = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine(); // "day", "night"

        double priceHour = 0.0;
        double totalPrice = 0.0;

        switch (month) {
            case "march":
                if (time.equals("day")) {
                    priceHour = 10.50;
                } else {
                    priceHour = 8.40;
                }
            case "april":
                if (time.equals("day")) {
                    priceHour = 10.50;
                } else {
                    priceHour = 8.40;
                }
            case "may":
                if (time.equals("day")) {
                    priceHour = 10.50;
                } else {
                    priceHour = 8.40;
                }
                break;
            case "june":
                if (time.equals("day")) {
                    priceHour = 12.60;
                } else {
                    priceHour = 10.20;
                }
            case "july":
                if (time.equals("day")) {
                    priceHour = 12.60;
                } else {
                    priceHour = 10.20;
                }
            case "august":
                if (time.equals("day")) {
                    priceHour = 12.60;
                } else {
                    priceHour = 10.20;
                }
                break;
        }

        if (group >= 4) {
            priceHour = 0.9 * priceHour;
        }
        if (hours >= 5) {
            priceHour = 0.5 * priceHour;
        }
        totalPrice = priceHour * group * hours;

        System.out.printf("Price per person for one hour: %.2f%n", priceHour);
        System.out.printf("Total cost of the visit: %.2f%n", totalPrice);
    }
}
