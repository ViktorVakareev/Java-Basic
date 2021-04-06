package IfElse.LAB;

import java.util.Scanner;

public class UnitConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());
        String unitInput = scanner.nextLine();
        String unitOutput = scanner.nextLine();

        double result = 0.0;

        if (unitOutput.equals("mm")){
            num = num*1000;
        } else if (unitOutput.equals("cm")) {
            num = num*100;
        }

        if (unitInput.equals("m")) {
            result = num;
        } else if (unitInput.equals("mm")) {
            result = num*0.001;
        } else if (unitInput.equals("cm")) {
            result = num*0.01;
        }

        System.out.printf("%.3f", result );

    }
}
