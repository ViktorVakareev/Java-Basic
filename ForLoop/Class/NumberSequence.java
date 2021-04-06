package ForLoop.Class;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()); // задава броя итерации

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {

            int num = Integer.parseInt(scanner.nextLine()); // числата, к. вкарваме от конзолата и сравняваме

            if (num > max) {  //  min value
                max = num;

            }
            if (num < min) { // max value
                min = num;
            }

        }System.out.printf("Max number: %d %n",max);
        System.out.printf("Min number: %d",min);

    }


}
