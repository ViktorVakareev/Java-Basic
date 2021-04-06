package SWITCH.Exersise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int row = Integer.parseInt(scanner.nextLine());
        int column = Integer.parseInt(scanner.nextLine());

        double profit = 0.0;
        if (type.equals("Premiere")) {
            profit = 12.00*row*column;
        } else if (type.equals("Normal")) {
            profit = 7.50*row*column;
        } else if (type.equals("Discount")) {
            profit = 5.00*row*column;
        }
        System.out.printf("%.2f leva", profit);
    }
}
