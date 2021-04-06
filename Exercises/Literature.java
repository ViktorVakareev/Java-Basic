package Exercises;

import java.util.Scanner;

public class Literature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // вход
int bookPages= Integer.parseInt(scanner.nextLine());
int pagesPerHour = Integer.parseInt(scanner.nextLine());
int days = Integer.parseInt(scanner.nextLine());
        // калкулации
int read = bookPages/pagesPerHour/days;
        // отпечатване
        System.out.println(read);
    }
}
