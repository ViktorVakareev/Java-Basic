package IfElse;

import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // console input
        int score = scanner.nextInt();
        // Calculations
        if (score >= 5) {
            System.out.println("Excellent!");
        } else {
            System.out.println();
        }

    }
}
