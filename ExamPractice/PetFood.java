package ExamPractice;

import java.util.Scanner;

public class PetFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double foodQuantity = Double.parseDouble(scanner.nextLine()); // grams food
        double dogFoodSum = 0.0;
        double catFoodSum = 0.0;
        double biscuits = 0.0;
        double allFoodSum = 0.0;

        for (int i = 1; i <= days; i++) {

            double dogFood = Double.parseDouble(scanner.nextLine());
            double catFood = Double.parseDouble(scanner.nextLine());
            dogFoodSum += dogFood;
            catFoodSum += catFood;

            if (i % 3 == 0) {
                biscuits = Math.round(0.1 * (catFood + dogFood));
                allFoodSum = catFoodSum + dogFoodSum;
                System.out.printf("Total eaten biscuits: %.0fgr.%n", biscuits);
            } else {
                allFoodSum = catFoodSum + dogFoodSum;
            }

        }
        System.out.printf("%.2f%% of the food has been eaten.%n", 1.0 * allFoodSum / foodQuantity * 100);
        System.out.printf("%.2f%% eaten from the dog.%n", 1.0 * dogFoodSum / allFoodSum * 100);
        System.out.printf("%.2f%% eaten from the cat.", 1.0 * catFoodSum / allFoodSum * 100);
    }
}
