package ExamPractice;

import java.util.Scanner;

public class PuppyCare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogFood = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int dogFoodGrams = dogFood * 1000;
        int food2 = 0;
        while (!input.equals("Adopted")) {
            int dailyFood = Integer.parseInt(input);
            food2 += dailyFood;

            input = scanner.nextLine();
        }
        if (food2 > dogFoodGrams) {
            System.out.printf("Food is not enough. You need %d grams more.", food2 - dogFoodGrams);
        } else {
            System.out.printf("Food is enough! Leftovers: %d grams.", dogFoodGrams - food2);
        }
    }
}
