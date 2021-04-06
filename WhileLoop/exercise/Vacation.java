package WhileLoop.exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());
        int daysSpending = 0;
        int days = 0;
        boolean spending = false;
        while (availableMoney < vacationMoney) {
            String input = scanner.nextLine();
            double spentSaveMoney = Double.parseDouble(scanner.nextLine());
            days++;
            if (input.equals("spend")) {
                availableMoney -= spentSaveMoney;
                daysSpending++;
                if (daysSpending == 5) {
                    spending = true;
                    break;
                }
            } else {
                availableMoney += spentSaveMoney;
                daysSpending =0;
            }

            if (availableMoney < 0) {
                availableMoney = 0;
            }

        }
        String output = "";

        if (spending) {
            output = String.format("You can't save the money.%n" +
                    "%d", days);
        } if (availableMoney >= vacationMoney) {
            output = String.format("You saved the money for %d days.", days);
        }
        System.out.println(output);
    }
}
