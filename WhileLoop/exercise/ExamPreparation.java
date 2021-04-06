package WhileLoop.exercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int badGrades = Integer.parseInt(scanner.nextLine());
        boolean maxBadGrades = false;
        int gradesCount = 0;
        int badGradesCount = 0;
        int gradesSum = 0;
        String problem = "";
        String problemName = scanner.nextLine();
        while (!problemName.equals("Enough")) {

            int grade = Integer.parseInt(scanner.nextLine());
            gradesSum += grade;
            gradesCount++;
            if (grade <= 4) {
                badGradesCount++;
            }
            if (badGradesCount >= badGrades) {
                maxBadGrades = true;
                break;
            }
            problem = problemName;
            problemName = scanner.nextLine();
        }
        String output = "";
        double averageScore = 1.0 * gradesSum / gradesCount;

        if (maxBadGrades) {
            output = String.format("You need a break, %d poor grades.", badGradesCount);
        } else {
            output = String.format("Average score: %.2f%n" +
                    "Number of problems: %d%n" +
                    "Last problem: %s", averageScore, gradesCount, problem);
        }
        System.out.println(output);
    }
}
