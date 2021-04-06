package ForLoop.Class;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i < n; i+=10) {
            System.out.println(i);
        }
    }
}
