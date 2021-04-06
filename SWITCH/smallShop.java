package SWITCH;

import java.util.Scanner;

public class smallShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        //Предприемчив българин отваря квартални магазинчета в няколко града и продава на различни цени:
        //град / продукт	coffee	water	beer	sweets	peanuts
        //Sofia	             0.50	   0.80	   1.20	   1.45	1.60
        //Plovdiv	         0.40	  0.70	  1.15	  1.30	 1.50
        //Varna	             0.45	0.70	1.10	1.35	1.55
        //Напишете програма, която чете продукт (низ), град (низ) и количество (десетично число),
        // въведени от потребителя, и пресмята и отпечатва колко струва съответното количество от избрания продукт в
        // посочения град.
        double price = 0.0;
        if (city.equals("Sofia")) {
            switch (product) {
                case "coffee":
                    price = quantity * 0.50;
                    break;
                case "water":
                    price = quantity * 0.80;
                    break;
                case "beer":
                    price = 1.20 * quantity;
                    break;
                case "sweets":
                    price = quantity * 1.45;
                    break;
                case "peanuts":
                    price = quantity * 1.60;
                    break;

            }
        } else if (city.equals("Plovdiv")) {
            switch (product) {
                case "coffee":
                    price = quantity * 0.40;
                    break;
                case "water":
                    price = quantity * 0.70;
                    break;
                case "beer":
                    price = 1.15 * quantity;
                    break;
                case "sweets":
                    price = quantity * 1.30;
                    break;
                case "peanuts":
                    price = quantity * 1.50;
                    break;

            } } else if (city.equals("Varna")) {
                switch (product) {
                    case "coffee":
                        price = quantity * 0.45;
                        break;
                    case "water":
                        price = quantity * 0.70;
                        break;
                    case "beer":
                        price = 1.10 * quantity;
                        break;
                    case "sweets":
                        price = quantity * 1.35;
                        break;
                    case "peanuts":
                        price = quantity * 1.55;
                        break;
                }

            }System.out.println(price);
        }
    }

