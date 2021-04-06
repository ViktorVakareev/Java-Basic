package ExamPractice;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupNumber = Integer.parseInt(scanner.nextLine());

        double counterMusala = 0;
        int counterMonblanc = 0;
        int counterKilimanjaro = 0;
        int counterK2 = 0;
        int counterEverest = 0;
        int allPeople = 0;

        for (int i = 1; i <= groupNumber; i++) {

            int people = Integer.parseInt(scanner.nextLine()); // people in each group
            allPeople += people;

            if (people <= 5) {
                counterMusala += people;
            } else if (people < 13) {
                counterMonblanc += people;
            } else if (people < 26) {
                counterKilimanjaro += people;
            } else if (people < 41) {
                counterK2 += people;
            } else {
                counterEverest += people;
            }
        }
        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n", 1.0*counterMusala /allPeople*100,1.0*counterMonblanc /allPeople*100, 1.0*counterKilimanjaro /allPeople*100,
                1.0*counterK2 /allPeople*100, 1.0*counterEverest /allPeople*100 );
    }
}
