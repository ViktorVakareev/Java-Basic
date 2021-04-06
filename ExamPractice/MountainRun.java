package ExamPractice;

import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());   //sec
        double distance = Double.parseDouble(scanner.nextLine()); //metres
        double timeFor1Metre = Double.parseDouble(scanner.nextLine());

        double climbTime = (distance * timeFor1Metre + Math.floor(distance / 50) * 30); // sec

        if (climbTime < record) {
            System.out.printf("Yes! The new record is %.2f seconds.", climbTime);
        } else {
            System.out.printf("No! He was %.2f seconds slower.", Math.abs(record - climbTime));
        }
    }
}
//•	Ако Георги е подобрил рекорда отпечатваме:
//        o	" Yes! The new record is {времето на Георги} seconds."
//        •	Ако НЕ е подобрил рекорда отпечатваме:
//        o	"No! He was {недостигащите секунди} seconds slower."
