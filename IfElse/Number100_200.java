package IfElse;

import java.util.Scanner;

public class Number100_200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a < 100) {
            System.out.println("Less than 100");
        } else if (a <= 200) {
            System.out.println("Between 100 and 200");
        } else if (a>200){
            System.out.println("Greater than 200");
        }
    }
}