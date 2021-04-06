package IfElse.LAB;

import java.util.Scanner;

public class SecondsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstTime = Integer.parseInt(scanner.nextLine());
        int secondTime = Integer.parseInt(scanner.nextLine());
        int thirdTime = Integer.parseInt(scanner.nextLine());

        int totalTime = firstTime + secondTime + thirdTime;
        int min = totalTime / 60;
        int seconds = totalTime % 60;
        
        if (seconds >= 10) {
            System.out.printf("%d:%d", min, seconds);
        }else {
        System.out.printf("%d:0%d", min, seconds);}

    }
}

