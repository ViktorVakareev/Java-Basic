package ExamPractice;

import java.util.Scanner;

public class EasterBake5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterBread = Integer.parseInt(scanner.nextLine());

        int sugarCount = 0;
        int flourCount = 0;
        int sugarMax = 0;
        int flourMax = 0;
        int sugarSum = 0;
        int flourSum = 0;

        for (int i = 1; i <= easterBread; i++) {
            int sugarGrams = Integer.parseInt(scanner.nextLine());
            int flourGrams = Integer.parseInt(scanner.nextLine());

            if (sugarMax < sugarGrams) {
                sugarMax = sugarGrams;
            }
            if (flourMax < flourGrams) {
                flourMax = flourGrams;
            }
            sugarSum += sugarGrams;
            flourSum += flourGrams;
        }

        double sugarPack = Math.ceil(sugarSum * 1.0 / 950);
        double flourPack = Math.ceil(flourSum * 1.0 / 750);

        System.out.printf("Sugar: %.0f%nFlour: %.0f%n", sugarPack, flourPack);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.", flourMax, sugarMax);
    }
}
