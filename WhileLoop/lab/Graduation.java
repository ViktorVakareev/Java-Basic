package WhileLoop.lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String student = scanner.nextLine();

        int klass = 1;
        double sum = 0.0;
        int poorGrade = 0;
        boolean excluded = false;
        while (klass <= 12) {
            double grades = Double.parseDouble(scanner.nextLine());
            klass += 1;
            sum = sum + grades;

            if (grades < 4) {
                poorGrade += 1;
                if (poorGrade >= 2) {
                    excluded = true;
                    System.out.printf("%s has been excluded at %d grade", student, klass-2);
                    break;
                }
            }
        } if(!excluded) {
        System.out.printf("%s graduated. Average grade: %.2f", student, 1.0 * sum / 12);
        }
    }
}

