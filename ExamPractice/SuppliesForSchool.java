package ExamPractice;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        double cleaningFluidLitres = Double.parseDouble(scanner.nextLine());
        int discountPercent = Integer.parseInt(scanner.nextLine());

        double price = pens * 5.80 + markers * 7.20 + cleaningFluidLitres * 1.20;
        double discountPrice = price * discountPercent / 100;

        System.out.printf("%.3f", price - discountPrice);
    }
}

//     Пакет химикали - 5.80 лв
//        •	Пакет маркери - 7.20 лв
//        •	Препарат - 1.20 лв (за литър)
