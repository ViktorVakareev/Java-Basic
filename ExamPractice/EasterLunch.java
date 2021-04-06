package ExamPractice;

import java.util.Scanner;

public class EasterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kozunak = Integer.parseInt(scanner.nextLine());
        int eggsKora = Integer.parseInt(scanner.nextLine());
        int kurabiiKg = Integer.parseInt(scanner.nextLine());

        double productsSum = kozunak*3.2+eggsKora*4.35+kurabiiKg*5.40+eggsKora*12*0.15;
        System.out.printf("%.2f", productsSum);
//        •	Козунак  – 3.20 лв.
//•	Яйца –  4.35 лв. за кора с 12 яйца
//•	Курабии – 5.40 лв. за килограм
//•	Боя за яйца - 0.15 лв. за яйце

    }
}
