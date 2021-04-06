package ExamBasicsTest;

import java.util.Scanner;

public class DivisioWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int p1Counter = 0; // % 2==0
        int p2Counter = 0; // % 3==0
        int p3Counter = 0; // % 4==0
        int counter = 0;

        for (int i = 1; i <= 1000; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            counter++;
            if (input % 2 == 0) {
                p1Counter++;
            }
            if (input % 3 == 0) {
                p2Counter++;
            }
            if (input % 4 == 0) {
                p3Counter++;
            }
            if (counter == n) {
                break;
            }
        }
        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%", 1.0 * p1Counter / n * 100, 1.0 * p2Counter / n * 100,
                1.0 * p3Counter / n * 100);
    }
}
