package Exercises;

import java.util.Scanner;

public class Charity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // вход
        int days = Integer.parseInt(scanner.nextLine());
        int candyman = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int waffle = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());
        // калкулации
        double cakesPerDay = cakes*45.0;
        double wafflePday = waffle*5.80;
        double pancakesPday = pancakes*3.20;
        double sum1 = (cakesPerDay+wafflePday+pancakesPday)*candyman*1.0;
        double sumFinal = sum1*days*1.0;
        double sum = sumFinal-sumFinal/8.0;
        // печат
        System.out.printf("%.2f", sum);
    }
}
