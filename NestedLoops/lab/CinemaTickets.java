package NestedLoops.lab;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();

        int counterStudent = 0;
        int counterStandard = 0;
        int counterKid = 0;
        int ticketsSum = 0;


        while (!movie.equals("Finish")) {
            boolean flag = false;
            int emptySeats = Integer.parseInt(scanner.nextLine());
            String tickets = scanner.nextLine();
            ticketsSum = 0;
            while (!tickets.equals("End")) {

                if (tickets.equals("student")) {
                    counterStudent++;
                }
                if (tickets.equals("standard")) {
                    counterStandard++;
                }
                if (tickets.equals("kid")) {
                    counterKid++;
                }
                ticketsSum++;
                tickets = scanner.nextLine();

                if (tickets.equals("Finish")) {
                    flag = true;
                    break;
                }
            }

            double percent = 1.0 * ticketsSum / emptySeats * 100;
            System.out.printf("%s - %.2f%% full.%n", movie, percent);

            if (flag) {
                break;
            }
            movie = scanner.nextLine();
        }
        int totalTickets = counterKid+counterStandard+counterStudent;
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", 1.0 * counterStudent / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", 1.0 * counterStandard / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.", 1.0 * counterKid / totalTickets * 100);
    }
}
