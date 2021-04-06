package ForLoop.Class.exersise;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int browserTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= browserTabs; i++) {

            String site = scanner.nextLine();
            if (site.equals("Facebook")) {
                sum += 150;
            }
            if (site.equals("Instagram")) {
                sum += 100;
            }
            if (site.equals("Reddit")) {
                sum += 50;
            }
            if ((salary - sum) <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }
        }
        if (salary > sum) {
            System.out.printf("%d", (salary - sum));
        }
    }
}
