package ExamPractice;

import java.util.Scanner;

public class EasterGuests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double productsSum = 0.0;
        double EasterBread = 0.0;
        double eggs = 0.0;

        EasterBread = Math.ceil(guests * 1.0 / 3);
        eggs = guests * 1.0 * 2;
        productsSum = EasterBread * 4 + eggs * 0.45;
        if (budget >= productsSum) {
            System.out.printf("Lyubo bought %.0f Easter bread and %.0f eggs.%nHe has %.2f lv. left.", EasterBread, eggs, budget - productsSum);
        } else {
            System.out.printf("Lyubo doesn't have enough money.%nHe needs %.2f lv. more.", productsSum - budget);
        }
//        •	Един козунак струва 4лв.
//•	Едно яйце струва 0.45лв.

    }
}
