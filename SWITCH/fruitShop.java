package SWITCH;

import java.util.Scanner;

public class fruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double price = 0.00;
    if (day.equals("Monday")||day.equals("Tuesday")||day.equals("Wednesday")||day.equals("Thursday")||day.equals("Friday")) {

        switch (fruit) {
            case "banana":
                price = quantity*2.50;System.out.printf("%.2f",price);
                break;
            case "apple":
                price = quantity*1.20;System.out.printf("%.2f",price);
                break;
            case "orange":
                price = quantity*0.85;System.out.printf("%.2f",price);
                break;
            case "grapefruit":
                price = quantity*1.45;System.out.printf("%.2f",price);
                break;
            case "kiwi":
                price = quantity*2.70;System.out.printf("%.2f",price);
                break;
            case "pineapple":
                price =quantity*5.50;System.out.printf("%.2f",price);
                break;
            case "grapes":
                price = quantity*3.85;
               System.out.printf("%.2f",price);
                break;
            default:
                System.out.println("error");
                break;
        }
    } else if (day.equals("Saturday")||day.equals("Sunday")){

        switch (fruit) {
            case "banana":
                price = quantity*2.70;System.out.printf("%.2f",price);
                break;
            case "apple":
                price = quantity*1.25;System.out.printf("%.2f",price);
                break;
            case "orange":
                price = quantity*0.90;System.out.printf("%.2f",price);
                break;
            case "grapefruit":
                price = quantity*1.60;System.out.printf("%.2f",price);
                break;
            case "kiwi":
                price = quantity*3.00;System.out.printf("%.2f",price);
                break;
            case "pineapple":
                price = quantity*5.60;System.out.printf("%.2f",price);
                break;
            case "grapes":
                price = quantity*4.20;
                System.out.printf("%.2f",price);
                break;

            default:
                System.out.println("error");
                break;

        }
    } else {
        System.out.println("error");
    }

        //Напишете програма, която чете от конзолата плод (banana / apple / orange / grapefruit / kiwi / pineapple / grapes),
        // ден от седмицата (Monday / Tuesday / Wednesday / Thursday / Friday / Saturday / Sunday) и
        // количество (десетично число) , въведени от потребителя, и пресмята цената според цените от таблиците по-горе.
        // При невалиден ден от седмицата или невалидно име на плод да се отпечата "error".
    }
}
