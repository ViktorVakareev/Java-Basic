package ExamPractice;

import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double trunkCapacity = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();

        double volumeSum = 0.0;
        int counter = 0;
        boolean full = false;
        double leftSpace = trunkCapacity;
        while (!input.equals("End")) {
            double suitcaseVolume = Double.parseDouble(input);

            if (counter % 3 == 0) {
                volumeSum += 1.1 * suitcaseVolume;
            } else {
                volumeSum += suitcaseVolume;
            }

            if (suitcaseVolume > leftSpace) {
                full = true;
                break;
            }
            counter++;
            leftSpace -= suitcaseVolume;
            input = scanner.nextLine();
        }
        if (full) {
            System.out.printf("No more space!%nStatistic: %d suitcases loaded.", counter);
        } else {
            System.out.printf("Congratulations! All suitcases are loaded!%nStatistic: %d suitcases loaded.", counter);
        }
    }
}
