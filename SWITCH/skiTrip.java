package SWITCH;

import java.util.Scanner;

public class skiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stay = Integer.parseInt(scanner.nextLine()); // days
        String room = scanner.nextLine();
        String review = scanner.nextLine();

        double price = 0.00;
        int nights = stay - 1; // нощувка

        switch (room) {
            case "room for one person":
                price = 18;
                break;
            case "apartment":
                price = 25;
                if (nights < 10) {
                    price = price*0.7;
                } else if (nights <= 15){
                    price = price * 0.65;
                } else if (nights> 15) {
                    price = price * 0.5;
                }
                break;
            case "president apartment":
                price = 35;
                if (nights < 10) {
                    price = price*0.9;
                } else if (nights <= 15){
                    price = price * 0.85;
                } else if (nights> 15) {
                    price = price * 0.8;
                }
                break;
        }
        double finalPrice = nights*price;
            if (review.equals("positive")) {
               finalPrice = finalPrice*1.25;
            } else {
                finalPrice = finalPrice*0.9;
            }
        System.out.printf("%.2f", finalPrice);
        }
    }

