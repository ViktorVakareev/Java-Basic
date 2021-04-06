package NestedLoops.lab;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floor = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());


        String type = "";
        for (int x = floor; x > 0; x--) {

            for (int y = 0; y < rooms; y++) {

                if (x % 2 == 0) {
                    type = "O";

                } else {
                    type = "A";
                }
                if (x==floor) {
                    type = "L";
                }

                System.out.printf("%s%d%d" + " ", type, x, y);
            }
            System.out.println();
        }
    }
}
