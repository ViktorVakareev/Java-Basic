package IfElse;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // вход
        int a = Integer.parseInt(scanner.nextLine());
        int b  = scanner.nextInt(); // прави същото като Integer.parseInt(scanner.nextLine())
        double del = 1.0*a / b;
        System.out.println(del);
    }
}
