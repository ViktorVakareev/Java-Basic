package ExamPractice;

import java.util.Scanner;

public class EasterBakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double flourPrice = Double.parseDouble(scanner.nextLine());
        double flourKg = Double.parseDouble(scanner.nextLine());
        double sugarKg = Double.parseDouble(scanner.nextLine());
        int eggsKora = Integer.parseInt(scanner.nextLine());
        int yeast = Integer.parseInt(scanner.nextLine());

        double sum = flourKg*flourPrice+sugarKg*flourPrice*0.75+eggsKora*flourPrice*1.1+yeast*flourPrice*0.75*0.2;
        System.out.printf("%.2f", sum);

//        •	цената на килограм захар е с 25% по-ниска от тази на килограм брашно
//•	цената на една кора с яйца е с 10% по-висока от цената на килограм брашно
//•	цената на един пакет мая е с 80% по-ниска от цената на килограм захар

    }
}
