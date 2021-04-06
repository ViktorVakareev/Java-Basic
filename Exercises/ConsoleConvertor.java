package Exercises;

import java.util.Scanner;

public class ConsoleConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // входящи данни
double rad = Double.parseDouble(scanner.nextLine());
        // пресмятания
double deg = rad * 180/Math.PI;
        // изход
        System.out.printf("%.0f", deg);


    }
}
