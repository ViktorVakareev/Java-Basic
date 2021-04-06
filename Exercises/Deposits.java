package Exercises;

import java.util.Scanner;

public class Deposits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // вход от конзола
        double deposit = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double yearlyInterestPercent = Double.parseDouble(scanner.nextLine());

        // Калкулации
double sum = deposit+months*((deposit*yearlyInterestPercent/100)/12);
        // Изход
        System.out.println(sum);
    }
}
