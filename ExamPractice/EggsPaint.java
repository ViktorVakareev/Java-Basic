package ExamPractice;

import java.util.Scanner;

public class EggsPaint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String size = scanner.nextLine();
        String colour = scanner.nextLine();
        int badgesCount = Integer.parseInt(scanner.nextLine());

        int price = 0;

        switch (size) {
            case ("Large"):
                if (colour.equals("Red")) {
                    price = 16;
                } else if (colour.equals("Green")) {
                    price = 12;
                } else {
                    price = 9;
                }
                break;
            case ("Medium"):
                if (colour.equals("Red")) {
                    price = 13;
                } else if (colour.equals("Green")) {
                    price = 9;
                } else {
                    price = 7;
                }
                break;
            case ("Small"):
                if (colour.equals("Red")) {
                    price = 9;
                } else if (colour.equals("Green")) {
                    price = 8;
                } else {
                    price = 5;
                }
                break;
        }
        double finalPrice = 1.0 * price * badgesCount;
        double total = finalPrice - finalPrice * 0.35;
        System.out.printf("%.2f leva.", total);
    }
}
