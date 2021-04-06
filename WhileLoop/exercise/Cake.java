package WhileLoop.exercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int lenght = Integer.parseInt(scanner.nextLine());

        int pieces = width * lenght;
        String input = scanner.nextLine();
        int piecesSum = 0;
        boolean noCake = false;

        while (!input.equals("STOP")) {

            int numPieces = Integer.parseInt(input);
            pieces -= numPieces;
            piecesSum += numPieces;
            if (pieces < 0) {
                noCake = true;
                break;
            }

            input = scanner.nextLine();
        }
        String output = "";
        if (noCake) {
            output = String.format("No more cake left! You need %d pieces more.", Math.abs(pieces));
        } else {
            output = String.format("%d pieces are left.", pieces);
        }

        System.out.println(output);
    }
}
