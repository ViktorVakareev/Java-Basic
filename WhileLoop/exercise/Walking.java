package WhileLoop.exercise;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int goingHome = 0;
        String input = scanner.nextLine();
        int stepsSum = 0;
        int stepsSum1 = 0;
        boolean enoughSteps = false;

        while (!input.equals("Going home")) {

            int stepsCount = Integer.parseInt(input);
            stepsSum += stepsCount;

            if (stepsSum >= 10000) {
                enoughSteps = true;
               // stepsSum1 = stepsSum;
                break;
            }
            input = scanner.nextLine();   // ако искаме да добавим нещо към някоя променлива, го правим с if веднага след като прочетем "Going home", преди да се е "счупил цикъла!"

            }
        if (input.equals("Going home")) {
            goingHome = Integer.parseInt(scanner.nextLine());
            stepsSum += goingHome;
        }

        int stepsDiff = Math.abs(10000 - stepsSum);

        String output = "";
        if (enoughSteps||stepsSum > 10000) {
            output = String.format("Goal reached! Good job!%n" +
                    "%d steps over the goal!", stepsDiff);
        } else if (stepsSum < 10000) {
            output = String.format("%d more steps to reach goal.", stepsDiff);
        }
        System.out.println(output);
    }
}
