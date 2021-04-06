package ExamBasicsTest;

import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double fuel = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();

        double tripPrice = fuel*2.1+100;

        if (day.equals("Saturday")) {
            tripPrice *= 0.9;
        } else {
            tripPrice *= 0.8;
        }

        if (budget >= tripPrice) {
            System.out.printf("Safari time! Money left: %.2f lv. ", budget-tripPrice);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", tripPrice-budget);
        }
    }
}
