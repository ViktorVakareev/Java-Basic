package IfElse.LAB;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        double bonus = 0.0;


        if (num <= 100) {
            bonus = 5;

        } else if (num > 1000 ) {
            bonus = num * 0.1;

        } else  {
            bonus = num * 0.2;
        }
        if (num % 2 == 0) {    // четни
            bonus = bonus + 1;
        } else if (num % 10 == 5) {    // така указваме, числата, които завършват на 5-при модулно делене ост. = 5
            bonus = bonus + 2;
        }

            System.out.println(bonus);
            System.out.println(num+bonus);

        }


        }