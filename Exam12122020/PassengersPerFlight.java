package Exam12122020;

import java.util.Scanner;

public class PassengersPerFlight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int flightCompanies = Integer.parseInt(scanner.nextLine());

        String nameMaxPassengers = "";
        double maxPassengers = 0;


        for (int i = 1; i <= flightCompanies; i++) {
            String flightCompanyName = scanner.nextLine();
            String input = scanner.nextLine();
            int currentPassengers = 0;
            int counter = 0;

            while (!input.equals("Finish")) {
                int passengers = Integer.parseInt(input);
                counter++;
                currentPassengers += passengers;
                input = scanner.nextLine();
            }
            double averagePassengers = Math.floor(currentPassengers * 1.0 / counter);
            if (averagePassengers > maxPassengers) {
                maxPassengers = averagePassengers;
                nameMaxPassengers = flightCompanyName;
            }
            System.out.printf("%s: %.0f passengers.%n", flightCompanyName, averagePassengers);
        }
        System.out.printf("%s has most passengers per flight: %.0f", nameMaxPassengers, maxPassengers);
    }
}
