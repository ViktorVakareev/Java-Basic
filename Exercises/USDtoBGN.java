package Exercises;

import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // вход
        double USD = Double.parseDouble(scanner.nextLine());
        // пресмятания
        double BGN = USD * 1.79549;
        // изход
        System.out.println(BGN);

    }

}
