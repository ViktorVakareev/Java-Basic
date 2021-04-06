package ExamPractice;

import java.util.Scanner;

public class EasterShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialEggs = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int stock = initialEggs;
        int sold = 0;
        boolean end = false;
        while (!input.equals("Close")) {
            int eggs = Integer.parseInt(scanner.nextLine());

            if (stock < eggs&&input.equals("Buy")) {
                end = true;
                System.out.printf("Not enough eggs in store!%nYou can buy only %d.", stock);
                break;
            }
            if (input.equals("Buy")) {
                stock -= eggs;
                sold += eggs;
            } else {
                stock += eggs;

            }

            input = scanner.nextLine();
        }
        if (!end) {
            System.out.printf("Store is closed!%n%d eggs sold.", sold);
        }
    }
}
