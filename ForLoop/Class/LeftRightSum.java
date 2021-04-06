package ForLoop.Class;

import java.util.Scanner;

public class LeftRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumLeft = 0;
        int sumRight = 0;
        int diff = 0;

        for (int i = 0; i < n ; i++) {
           int num1 = Integer.parseInt(scanner.nextLine());
            sumLeft += num1;
        }
        for (int i = 0; i < n; i++) {
            int num2 = Integer.parseInt(scanner.nextLine());
            sumRight += num2;
        }
        if (sumLeft == sumRight ) {
            System.out.printf("Yes, sum = %d", sumLeft);
        } else {
            System.out.printf("No, diff = %d", Math.abs(sumLeft-sumRight));
        }
    }

}
