package NestedLoops.lab;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int sum = 0;
        boolean magic = false;
        boolean flag = false;

        for (int i = x; i <= y; i++) {
            for (int j = x; j <= y; j++) {
                counter++;
                sum = i + j;
                if (sum == magicNumber) {
                    x = i;
                    y = j;
                    magic = true;
                    flag = true;
                    break;
                }
            } if(flag) {
                break;
            }
        }
        if (magic) {
            System.out.printf("Combination N:%d (%d + %d = %d)", counter, x, y, sum);
        } else {
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
        }
    }
}
