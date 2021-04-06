package WhileLoop.lab;

import java.util.Scanner;

public class MInNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int min = 999999999;

        while (!input.equals("Stop")) {
            int num = Integer.parseInt(input);

            if (num < min) {
                min = num;
                continue;
            }
            input = scanner.nextLine();
        }
        System.out.printf("%d", min);
    }
}
