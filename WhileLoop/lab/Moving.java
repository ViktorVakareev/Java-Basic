package WhileLoop.lab;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int storage_volume = width * length * height;
        int boxes_volume = 0;
        String input = scanner.nextLine();
        boolean full = false;

        while (!input.equals("Done")) {
            int numBoxes = Integer.parseInt(input);
            boxes_volume += numBoxes;

            if (boxes_volume >= storage_volume) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(storage_volume - boxes_volume));
                full = true;
                break;
            }
            input = scanner.nextLine();

        }
        if (!full) {
            System.out.printf("%d Cubic meters left.", storage_volume-boxes_volume);
        }

    }
}
