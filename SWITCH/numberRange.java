package SWITCH;

import java.util.Scanner;

public class numberRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        if (num >=-100 && num !=0 && num <= 100 ){
        System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        //Да се напише програма, която проверява дали въведеното от потребителя число е в
        // интервала [-100, 100] и е различно от 0 и извежда "Yes", ако отговаря на условията, или "No" ако е извън тях.
        //Примерен вход и изход
        //вход	изход		вход	изход		вход	изход
        //-25	Yes		         0	No		       25	Yes
    }
}
