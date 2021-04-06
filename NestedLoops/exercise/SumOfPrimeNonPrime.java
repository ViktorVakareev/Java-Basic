package NestedLoops.exercise;

import java.util.Scanner;

public class SumOfPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int primeSum = 0;
        int nonPrimeSum = 0;

        while (!input.equals("stop")) {
            boolean nonPrime = false;
            int number = Integer.parseInt(input);

            if (number < 0) {
                input = scanner.nextLine();
                System.out.println("Number is negative.");
                continue;
            }
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    nonPrime = true;
                    break;
                }
            }
            if (nonPrime) {
                nonPrimeSum += number;
            } else {
                primeSum += number;
            }

            input = scanner.nextLine();

        }
        System.out.printf("Sum of all prime numbers is: %d%n",primeSum);
        System.out.printf("Sum of all non prime numbers is: %d",nonPrimeSum);
    }
}
