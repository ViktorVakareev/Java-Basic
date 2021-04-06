package Exercises;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // вход
        double strawCost = Double.parseDouble(scanner.nextLine());
        double banana = Double.parseDouble(scanner.nextLine());
        double orange = Double.parseDouble(scanner.nextLine());
        double rasp = Double.parseDouble(scanner.nextLine());
        double straw = Double.parseDouble(scanner.nextLine());
// калкулации
        double raspCost = strawCost*0.5;
        double orangeCost = raspCost-raspCost*0.40;
        double bananaCost = raspCost-raspCost*0.80;
        double result = strawCost*straw+bananaCost*banana+orangeCost*orange
                +raspCost*rasp;
//        печат
        System.out.printf("%.2f", result);
    }
}
