package SWITCH.Exersise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String country = ""; // Bulgaria, Balkans or Europe
        String accommodation = ""; // Camp or Hotel

        if (budget <= 100) {
            country = "Bulgaria";
            switch (season) {
                case "summer":
                    budget = budget * 0.3;
                    accommodation = "Camp";
                    break;
                case "winter":
                    budget = budget * 0.7;
                    accommodation = "Hotel";
                    break;
            }
        } else if (budget <= 1000) {
            country = "Balkans";
            switch (season) {
                case "summer":
                    budget = budget * 0.4;
                    accommodation = "Camp";
                    break;
                case "winter":
                    budget = budget * 0.8;
                    accommodation = "Hotel";
                    break;
            }
        } else {
            country = "Europe";
            budget = budget * 0.9;
            accommodation = "Hotel";
        }
        System.out.printf("Somewhere in %s%n", country);
        System.out.printf("%s - %.2f", accommodation, budget);
    }
}
