package ExamBasicsTest;

import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String contractTerm = scanner.nextLine();
        String contractType = scanner.nextLine();
        String mobileNet = scanner.nextLine();
        int monthsContract = Integer.parseInt(scanner.nextLine());

        double price = 0.0;
        double totalPrice = 0.0;

        switch (contractType) {
            case ("Small"):
                if (contractTerm.equals("one")) {
                    price = 9.98;
                } else {
                    price = 8.58;
                }
                break;
            case ("Middle"):
                if (contractTerm.equals("one")) {
                    price = 18.99;

                } else {
                    price = 17.09;
                }
                break;
            case ("Large"):
                if (contractTerm.equals("one")) {
                    price = 25.98;
                } else {
                    price = 23.59;
                }
                break;
            case ("ExtraLarge"):
                if (contractTerm.equals("one")) {
                    price = 35.99;
                } else {
                    price = 31.79;
                }
                break;
        }

        if (mobileNet.equals("yes")) {
            if (price <= 10) {
                price += 5.5;
            } else if (price <= 30) {
                price += 4.35;
            } else if (price > 30) {
                price += 3.85;
            }
        }

        if (contractTerm.equals("two")) {
            price *= 96.25 / 100;
        }
        totalPrice = monthsContract * price;
        System.out.printf("%.2f lv.", totalPrice);
    }
}
