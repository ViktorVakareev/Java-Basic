package Exam12122020;

import java.util.Scanner;

public class GiftsFromSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int S = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        for (int i = M; i >= N; i--) {
            counter = i;
            if (i == S&&i % 2 == 0 && i % 3 == 0) {
                break;
            }
            if (i % 2 == 0 && i % 3 == 0) {

                System.out.printf("%d ", i);
            }

        }

    }
}
