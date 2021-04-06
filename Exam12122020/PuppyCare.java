package Exam12122020;

import java.util.Scanner;

public class PuppyCare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int foodQuantity = Integer.parseInt(scanner.nextLine()); //kg
        String input = scanner.nextLine();

        int foodEaten = 0; //grams

        while (!input.equals("Adopted")) {
            int food = Integer.parseInt(input);
            foodEaten += food;

            input = scanner.nextLine();
        }
        if (foodEaten <= foodQuantity * 1000) {
            System.out.printf("Food is enough! Leftovers: %d grams.", foodQuantity * 1000 - foodEaten);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", foodEaten - foodQuantity * 1000);
        }
    }
}
