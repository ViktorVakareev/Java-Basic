package Exam12122020;

import java.util.Scanner;

public class Moon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double speed = Double.parseDouble(scanner.nextLine()); // km/h
        double fuel = Double.parseDouble(scanner.nextLine()); // litres/100 km

        double hoursTrip = Math.ceil((384400*1.0/speed)*2+3);
        double litres = fuel*384400*2.0/100;

        System.out.printf("%.0f%n",hoursTrip);
        System.out.printf("%.0f",litres);
    }
}
