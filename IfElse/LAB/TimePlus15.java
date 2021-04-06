package IfElse.LAB;

import java.util.Scanner;

public class  TimePlus15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        hours = hours*60;  // min
           // min minutes = 0;
        int time = hours + minutes + 15;   ///min
        int time15 = time / 60;
        int min15 = time % 60;

        if (time15 == 24) {
            time15 = 0;
            
        }
        if (min15 <10) {
            System.out.printf("%d:0%d", time15, min15);
        } else

        System.out.printf("%d:%d", time15, min15);
    }
}
