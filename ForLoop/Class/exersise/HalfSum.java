package ForLoop.Class.exersise;

import java.util.Scanner;

public class HalfSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int max = -100000000;
        int sum = 0;
int sum1 =0;
        for (int i = 0; i < n; i++) {

            int num = Integer.parseInt(scanner.nextLine());
            sum += num;
            if (num > max) {
                max = num;
            }
            sum1 = sum - max;
        }
        if (sum1 == max) {
            System.out.printf("Yes%nSum = %d", sum1);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(max-sum1));
        }

    }
}

