package ExamPractice;

import java.util.Scanner;

public class EasterBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggs1 = Integer.parseInt(scanner.nextLine());
        int eggs2 = Integer.parseInt(scanner.nextLine());
        String winner = scanner.nextLine();

        boolean player1 = false;
        boolean player2 = false;
        boolean end = false;
        int player1eggs = eggs1;
        int player2eggs = eggs2;

        while (!winner.equals("End of battle")) {

            if (winner.equals("one")) {
                player2eggs--;
            } else {
                player1eggs--;
            }
            if (player1eggs == 0) {
                player1 = true;
                break;
            }
            if (player2eggs == 0) {
                player2 = true;
                break;
            }

            winner = scanner.nextLine();
        }
        if (player1) {
            System.out.printf("Player one is out of eggs. Player two has %d eggs left.", player2eggs);
        }
        if (player2) {
            System.out.printf("Player two is out of eggs. Player one has %d eggs left.", player1eggs);
        }
        if (!player1 && !player2) {
            System.out.printf("Player one has %d eggs left.%nPlayer two has %d eggs left.", player1eggs, player2eggs);
        }
    }
}
