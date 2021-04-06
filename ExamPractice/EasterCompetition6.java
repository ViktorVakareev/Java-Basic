package ExamPractice;

import java.util.Scanner;

public class EasterCompetition6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterBreads = Integer.parseInt(scanner.nextLine());

        int maxPoints = 0;
        String bakerNameMax = "";
        boolean max = false;

        for (int i = 0; i < easterBreads; i++) {
            int currentPoints = 0;
            String bakerName = scanner.nextLine();
            String input = scanner.nextLine();

            while (!input.equals("Stop")) {
                int points = Integer.parseInt(input);

                currentPoints += points;

                input = scanner.nextLine();
            }

            if (maxPoints < currentPoints) {
                maxPoints = currentPoints;
                bakerNameMax = bakerName;
                max = true;
                System.out.printf("%s has %d points.%n", bakerNameMax, maxPoints);
                System.out.printf("%s is the new number 1!%n", bakerNameMax);
            } else {
                System.out.printf("%s has %d points.%n", bakerName, currentPoints);
            }
        }

        System.out.printf("%s won competition with %d points!", bakerNameMax, maxPoints);
    }

}

