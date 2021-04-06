package ExamPractice;

import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutesWalk = Integer.parseInt(scanner.nextLine());
        int countWalks = Integer.parseInt(scanner.nextLine());
        int dailyCalories = Integer.parseInt(scanner.nextLine());

        int burnedCals = countWalks * minutesWalk * 5;

        if (burnedCals >= dailyCalories / 2) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", burnedCals);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", burnedCals);
        }

    }
}
//•	        Ако изгорените калории през разходката са повече или равни на  50% от приетите през деня калории:
//        "Yes, the walk for your cat is enough. Burned calories per day: {общо изгорени калории от разходката}."
//        •	Ако  изгорените калории през разходката са по-малко от 50% от приетите през деня калории:
//        "No, the walk for your cat is not enough. Burned calories per day: {общо изгорени калории от разходката}."
