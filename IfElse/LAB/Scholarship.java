package IfElse.LAB;

import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double averageGrade = Double.parseDouble(scanner.nextLine());
        double minimumSalary = Double.parseDouble(scanner.nextLine());

        double socialS = minimumSalary * 0.35;
        double exellentS = averageGrade * 25;
        double scholarshipE = 0.0;
        double scholarshipS = 0.0;

         if (averageGrade > 4.5 && income < minimumSalary ) {
            scholarshipS = socialS;
             //System.out.printf("You get a Social scholarship %.0f BGN", scholarshipS);
        } else if ( averageGrade >= 5.5 && socialS < exellentS ) {
          scholarshipE = exellentS;
            System.out.printf("You get a scholarship for excellent results %.0f BGN", scholarshipE);}

            }
            }





