package ExamPractice;

import java.util.Scanner;

public class Christmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();

        double raisedMoney = 0.0;
        int counterWin = 0;
        int counterLose = 0;
        boolean firstDay = false;
        while (!sport.equals("Finish")) {
            String result = scanner.nextLine();
            if (result.equals("win")) {
                raisedMoney += 20;
                counterWin++;
            } else {
                raisedMoney += 0;
                counterLose++;
            }
            sport = scanner.nextLine();
        }

        if (counterWin > counterLose) {
            raisedMoney *= 1.1;
        }
        sport = scanner.nextLine();
        while (!sport.equals("Finish")) {
            if (sport.equals("win")) {
                raisedMoney += 20;
                counterWin++;
            } else {
                raisedMoney += 0;
                counterLose++;
            }
            sport = scanner.nextLine();
        }
        if (counterWin > counterLose) {
            raisedMoney *= 1.3;}

            System.out.printf("You won the tournament! Total raised money: %.2f", raisedMoney);
        }
    }
