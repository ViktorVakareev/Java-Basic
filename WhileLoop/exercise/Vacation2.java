package WhileLoop.exercise;

import java.util.Scanner;

public class Vacation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tripMoney = Integer.parseInt(scanner.nextLine());
        int savedMoney = Integer.parseInt(scanner.nextLine());


        int saveCounter = 0;
        int spendCounter = 0;
        int days = 0;
        boolean noMoney = false;
        String spendSave = scanner.nextLine();

        while (savedMoney < tripMoney) {

            int money = Integer.parseInt(scanner.nextLine());
            days++;

            if (spendSave.equals("spend")) {
                savedMoney -= money;
                spendCounter++;
            }
            if (savedMoney < 0) {
                savedMoney = 0;
            }
            if (spendCounter == 5) {
                noMoney = true;
                System.out.printf("You can't save the money.%n%d", days);
                break;
            }
            if (spendSave.equals("save")) {
                saveCounter++;
                savedMoney += money;
            }
            spendSave = scanner.nextLine();
        }
        if (!noMoney) {
            System.out.printf("You saved the money for %d days.", days);
        }
    }
}
