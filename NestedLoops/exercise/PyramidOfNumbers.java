package NestedLoops.exercise;

import java.util.Scanner;

public class PyramidOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int counter = 1;

        outerloop: for (int row = 1; row <= n; row++) {

            innerloop: for (int column = 1; column <= row; column++) {
                if (counter > n) {
                break innerloop;

                }
                System.out.printf("%d ", counter);
                counter++;
            }
            if (counter > n)
            break outerloop;
            System.out.println();
        }

    }
}

