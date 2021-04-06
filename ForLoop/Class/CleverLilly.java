package ForLoop.Class;

import java.util.Scanner;

public class CleverLilly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceLaundry = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());

        double N = 0.0;   // сума, която не достига
        double M = 0.0;  // сума, която не достига
        int evenYears = 0;
        int oddYears = 0;
        double money =  0;
        double toy = 0;

        if (age%2 == 0) {
           evenYears = age/2;
           oddYears = age/2;
            for (int i = 1; i < evenYears; i += 9) {
                double even = Double.parseDouble(scanner.nextLine());
                money += even;
            }
        } else {
            evenYears = age/2;
            oddYears = age/2 + 1;
            for (int i = 1; i < oddYears; i++) {
                double odd = Double.parseDouble(scanner.nextLine());
               toy += odd*priceToy;
            }
        }


    }
}
