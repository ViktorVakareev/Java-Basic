package ExamBasicsTest;

import java.util.Scanner;

public class TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String productName = scanner.nextLine();

        double currentBudget = budget;
        double totalPrice = 0.0;
        int productCounter = 0;
        boolean noMoney = false;
        while (!productName.equals("Stop")) {
            double productPrice = Double.parseDouble(scanner.nextLine());
            productCounter++;

            if (productCounter % 3 == 0) {
                productPrice *= 0.5;
            }

            if (productPrice > currentBudget) {
                noMoney = true;
                System.out.printf("You don't have enough money!%nYou need %.2f leva!", productPrice - currentBudget);
                break;
            }
            currentBudget -= productPrice;

            totalPrice += productPrice;
            productName = scanner.nextLine();
        }


        if (!noMoney) {
            System.out.printf("You bought %d products for %.2f leva.", productCounter, totalPrice);
        }
    }
}
