package ForLoop.Class;

import java.util.Scanner;

public class EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= n; i+=2) {
            double num = Math.pow(2, i);
            int num2 = (int)num;
            System.out.println(num2);
        }
    }
}
