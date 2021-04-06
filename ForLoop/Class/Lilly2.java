package ForLoop.Class;

import java.util.Scanner;

public class Lilly2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceLaundry = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());

        double N = 0.0;   // сума, която не достига
        double M = 0.0;  // сума, която не достига
        int evenYears = 0;
        int oddYears = 0;
        double money = 0;
        double toy = 0;
        double sum = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
               money += i*10/2.0;
                evenYears ++;
            } else {
            oddYears ++;
            }
        } sum = money + oddYears*priceToy - evenYears;
            if (sum >= priceLaundry) {
                N = sum - priceLaundry;
                System.out.printf("Yes! %.2f", N);
            } else {
                M = priceLaundry - sum;
                System.out.printf("No! %.2f", M);
            }

        }
    }


