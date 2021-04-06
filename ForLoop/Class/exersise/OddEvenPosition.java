package ForLoop.Class.exersise;

import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double evenSum = 0.0;
        double evenMax = -1000000000.00;
        double evenMin = 1000000000.00;
        double oddSum = 0.0;
        double oddMax = -1000000000.00;
        double oddMin = 1000000000.00;
        boolean isevenMax = false;
        boolean isevenMin = false;
        boolean isoddMax = false;
        boolean isoddMin = false;


        for (int i = 1; i <= n; i++) {
            double num = Double.parseDouble(scanner.nextLine());

            if (i % 2 == 0) { //  even position
                evenSum += num;
                if (num > evenMax) {
                    evenMax = num;
                    isevenMax = true;
                }
                if (num < evenMin) {
                    evenMin = num;
                    isevenMin = true;
                }
            } else { // odd position
                oddSum += num;
                if (num > oddMax) {
                    oddMax = num;
                    isoddMax = true;
                }
                if (num < oddMin) {
                    oddMin = num;
                    isoddMin = true;
                }
            }
        }

        System.out.printf("OddSum=%.2f,%n", oddSum);
        if (isoddMin) {
            System.out.printf("OddMin=%.2f,%n", oddMin);
        } else {
            System.out.printf("OddMin=No,%n");
        }
        if (isoddMax) {
            System.out.printf("OddMax=%.2f,%n", oddMax);
        } else {
            System.out.printf("OddMax=No,%n");
        }
        System.out.printf("EvenSum=%.2f,%n", evenSum);
        if (isevenMin) {
            System.out.printf("EvenMin=%.2f,%n", evenMin);
        } else {
            System.out.printf("EvenMin=No,%n");
        }
        if (isevenMax) {
        System.out.printf("EvenMax=%.2f", evenMax);}
        else {System.out.println("EvenMax=No");}
    }

}


