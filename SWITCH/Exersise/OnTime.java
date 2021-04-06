package SWITCH.Exersise;

import java.util.Scanner;

public class OnTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine()); // 0 to 23
        int examMinute = Integer.parseInt(scanner.nextLine()); // 0 to 59
        int arrivalHour = Integer.parseInt(scanner.nextLine()); // 0 to 23
        int arrivalMinute = Integer.parseInt(scanner.nextLine()); // 0 to 59

        String timing = ""; // Late, On time, Early
        int examTime = examHour * 60 + examMinute;  // in min
        int arrivalTime = arrivalHour * 60 + arrivalMinute;  // in min
        int diff = examTime - arrivalTime;

        if (diff <= 30 && diff > 0 || diff == 0) {   // Early
            timing = "On time";
        } else if (diff < 0) {  // Late
            timing = "Late";
        } else if (diff > 30) {
            timing = "Early";
        }
        int minDiff = Math.abs(diff % 60);
        int hourDiff = Math.abs(diff / 60);
        int fgh = Math.abs(diff);

        System.out.printf("%s %n", timing);
        if (fgh >= Math.abs(60)) {
            if (timing.equals("Late")) {
                if (minDiff < 10) {
                    System.out.printf("%d:0%d hours after the start", hourDiff, minDiff);
                } else {
                    System.out.printf("%d:%d hours after the start", hourDiff, minDiff);
                    }

            } else if (timing.equals("On time") || timing.equals("Early")) {
                if (minDiff < 10) {
                    System.out.printf("%d:0%d hours before the start", hourDiff, minDiff);
                } else {
                    System.out.printf("%d:%d hours before the start", hourDiff, minDiff);
                }
            }
        } else if (fgh < 60) {
            if (timing.equals("Late")) {
                System.out.printf("%d minutes after the start", fgh);
            } else if (timing.equals("On time") || timing.equals("Early")) {
                System.out.printf("%d minutes before the start", fgh);
            }
        }
    }
}




