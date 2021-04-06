package ExamPractice;

import java.util.Scanner;

public class EasterParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        double couvert = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double cakePrice = 0.1 * budget;
        double partyCost = 0.0;

        if (guests < 16 && guests > 9) {
            couvert = 0.85 * couvert;
        } else if (guests < 21 && guests > 15) {
            couvert = 0.80 * couvert;
        } else if (guests > 20) {
            couvert = 0.75 * couvert;
        }
        partyCost = guests * couvert + cakePrice;
        if (partyCost <= budget) {
            System.out.printf("It is party time! %.2f leva left.", budget - partyCost);
        } else {
            System.out.printf("No party! %.2f leva needed.", partyCost - budget);
        }
//        •	Между 10 (вкл.) и 15 (вкл.) човека -> 15 % отстъпка от куверта за един човек
//•	Между 15 и 20 (вкл.) човека -> 20 % отстъпка от куверта за един човек
//•	Над 20 човека -> 25 % отстъпка от куверта за един човек

    }
}
