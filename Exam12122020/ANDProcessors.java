package Exam12122020;

import java.util.Scanner;

public class ANDProcessors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int processorsPlanned = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        int workingDays = Integer.parseInt(scanner.nextLine());  // 8h/day

        double production = workers * workingDays * 8;
        double productionProcessors = Math.floor(production / 3);

        if (productionProcessors < processorsPlanned) {
            System.out.printf("Losses: -> %.2f BGN", (processorsPlanned - productionProcessors) * 110.10);
        } else {
            System.out.printf("Profit: -> %.2f BGN", (productionProcessors - processorsPlanned) * 110.10);
        }
    }
}
