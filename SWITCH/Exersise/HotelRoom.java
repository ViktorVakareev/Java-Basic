package SWITCH.Exersise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int overnight = Integer.parseInt(scanner.nextLine());

        double priceStudio = 0.0;
        double priceApartment = 0.0;
        String room = ""; // Apartment or sStudio

        if (month.equals("May") || month.equals("October")) {
            priceStudio = 50;
            priceApartment = 65;
            if (overnight > 7 && overnight < 14) {
                priceStudio = priceStudio * 0.95;
            } else if (overnight > 14) {
                priceStudio = priceStudio * 0.7;
                priceApartment = priceApartment * 0.9;
            }

        } else if (month.equals("June") || month.equals("September")) {
            priceStudio = 75.20;
            priceApartment = 68.70;

            if (overnight > 14) {
                priceStudio = priceStudio * 0.8;
                priceApartment = priceApartment * 0.9;
            }
        } else if (month.equals("July") || month.equals("August")) {
            priceStudio = 76;
            priceApartment = 77;

            if (overnight > 14) {
                priceApartment = priceApartment * 0.9;
            }
        }
        double totalApartment = overnight*priceApartment;
        double totalStudio = overnight*priceStudio;
        System.out.printf("Apartment: %.2f lv.%n", totalApartment);
        System.out.printf("Studio: %.2f lv.", totalStudio);
    }

}
