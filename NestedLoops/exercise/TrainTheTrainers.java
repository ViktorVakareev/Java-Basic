package NestedLoops.exercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gradeNumber = Integer.parseInt(scanner.nextLine());  //брой оценки за задача
        String input = scanner.nextLine();

        double FinalGrade = 0.0;
        int gradeCounter = 0;

        while (!input.equals("Finish")) {
            String taskName = input;

            double averageGrade = 0.0;
            gradeCounter++;

            for (int i = 1; i <= gradeNumber; i++) {
                double number = Double.parseDouble(scanner.nextLine());
                averageGrade += number;
            }
            FinalGrade += averageGrade/gradeNumber;
            System.out.printf("%s - %.2f.%n", taskName, averageGrade / gradeNumber);
            input = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", FinalGrade/gradeCounter);
    }
}
