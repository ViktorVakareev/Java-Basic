package SWITCH;

import java.util.Scanner;

public class tradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double sells = Double.parseDouble(scanner.nextLine());

        double commission = 0.00;
        //Град	0 ≤ s ≤ 500	 500 < s ≤ 1 000	1 000 < s ≤ 10 000	s > 10 000
        //Sofia	        5%      7%	                  8%	           12%
        //Varna			4.5%    7.5%                 10%	           13%
        //Plovdiv	   5.5%		8%	                  12%                14.5%
        if (sells >= 0 && sells <= 500 ){
            switch (city) {
                case "Sofia":
                    commission = sells*0.05; System.out.printf("%.2f", commission);
                    break;
                case "Varna":
                    commission = sells*0.045; System.out.printf("%.2f", commission);
                    break;
                case "Plovdiv":
                    commission = sells*0.055; System.out.printf("%.2f", commission);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } else if (sells > 500 && sells <= 1000) {
            switch (city) {
                case "Sofia":
                    commission = sells*0.07; System.out.printf("%.2f", commission);
                    break;
                case "Varna":
                    commission = sells*0.075; System.out.printf("%.2f", commission);
                    break;
                case "Plovdiv":
                    commission = sells*0.08; System.out.printf("%.2f", commission);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } else if (sells > 1000 && sells <= 10000) {
            switch (city) {
                case "Sofia":
                    commission = sells*0.08; System.out.printf("%.2f", commission);
                    break;
                case "Varna":
                    commission = sells*0.1; System.out.printf("%.2f", commission);
                    break;
                case "Plovdiv":
                    commission = sells*0.12; System.out.printf("%.2f", commission);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } else if (sells > 10000) {
            switch (city) {
                case "Sofia":
                    commission = sells*0.12; System.out.printf("%.2f", commission);
                    break;
                case "Varna":
                    commission = sells*0.13; System.out.printf("%.2f", commission);
                    break;
                case "Plovdiv":
                    commission = sells*0.145; System.out.printf("%.2f", commission);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } else {
            System.out.println("error");
        }
    }
}
