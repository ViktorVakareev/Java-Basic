package ExamPractice;

import java.util.Scanner;

public class EasterEggs5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggsCount = Integer.parseInt(scanner.nextLine());
        int redCount = 0;
        int orangeCount = 0;
        int blueCount = 0;
        int greenCount = 0;

        int max1 = 0;
        int max2 = 0;
        int max = 0;
        String clo = "";
        for (int i = 1; i <= eggsCount; i++) {
            String colour = scanner.nextLine();

            switch (colour) {
                case "red":
                    redCount++;
                    break;
                case "orange":
                    orangeCount++;
                    break;
                case "blue":
                    blueCount++;
                    break;
                case "green":
                    greenCount++;
                    break;
            }
            max1 = Math.max(redCount, orangeCount);
            max2 = Math.max(blueCount, greenCount);
            if (max1 > max2) {
                max = max1;
                if (redCount > orangeCount) {
                    clo = "red";
                } else {
                    clo = "orange";
                }
            } else {
                max = max2;
                if (blueCount > greenCount) {
                    clo = "blue";
                } else {
                    clo = "green";
                }
            }
        }
        System.out.printf("Red eggs: %d%nOrange eggs: %d%nBlue eggs: %d%nGreen eggs: %d%nMax eggs: %d -> %s", redCount, orangeCount, blueCount, greenCount, max, clo);
    }
}
