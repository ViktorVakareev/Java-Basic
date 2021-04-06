package ExamPractice;

import java.util.Scanner;

public class EasterTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String date = scanner.nextLine();
        int sleepoversCount = Integer.parseInt(scanner.nextLine());

        int sleepovers = 0;

        switch (country) {
            case ("France"):
                if (date.equals("21-23")) {
                    sleepovers = 30;
                } else if (date.equals("24-27")) {
                    sleepovers = 35;
                } else {
                    sleepovers = 40;
                }
                break;
            case ("Italy"):
                if (date.equals("21-23")) {
                    sleepovers = 28;
                } else if (date.equals("24-27")) {
                    sleepovers = 32;
                } else {
                    sleepovers = 39;
                }
                break;
            case ("Germany"):
                if (date.equals("21-23")) {
                    sleepovers = 32;
                } else if (date.equals("24-27")) {
                    sleepovers = 37;
                } else {
                    sleepovers = 43;
                }
                break;
        }
        double tripExpenses = 1.0*sleepoversCount*sleepovers;
        System.out.printf("Easter trip to %s : %.2f leva.", country, tripExpenses );
    }
}
