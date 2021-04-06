package IfElse.LAB;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine()); //sec
        double distance = Double.parseDouble(scanner.nextLine()); //m
        double time1m = Double.parseDouble(scanner.nextLine()); //sec

        double time = (distance*time1m) + Math.floor(distance/15)*12.5;  //sec

        if (time >= record) {
            time = Math.abs(record - time);
            System.out.printf("No, he failed! He was %.2f seconds slower.", time);
        } else {

            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", time);
        }

    }
}
