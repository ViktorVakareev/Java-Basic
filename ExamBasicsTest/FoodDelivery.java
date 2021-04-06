package ExamBasicsTest;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegMenu = Integer.parseInt(scanner.nextLine());

        double menuPrice = chickenMenu*10.35+fishMenu*12.40+vegMenu*8.15;
        double total = menuPrice+menuPrice*0.2+2.5;

        System.out.printf("Total: %.2f", total);
    }
}
