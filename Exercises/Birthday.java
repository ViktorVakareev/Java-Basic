package Exercises;

import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        // вход
        int hallRent = Integer.parseInt(scanner.nextLine());
        // калкулации
        double cake = hallRent*0.2;
        double drinks = cake-cake*0.45;
        double animator = hallRent/3.0;
        double budjet = hallRent+cake+drinks+animator;
        // печат
        System.out.println(budjet);
    }
}
