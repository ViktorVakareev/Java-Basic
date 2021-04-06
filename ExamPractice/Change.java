package ExamPractice;

import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countBitcoin = Integer.parseInt(scanner.nextLine());
        double countYuan = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

        double leva = countBitcoin * 1168 + (countYuan * 0.15 * 1.76);
        double euro = leva/1.95*(1-commission/100);
        System.out.printf("%.2f", euro);


        //        •	1 биткойн = 1168 лева.
        //•	1 китайски юан = 0.15 долара.
        //•	1 долар = 1.76 лева.
        //•	1 евро = 1.95 лева

    }
}
