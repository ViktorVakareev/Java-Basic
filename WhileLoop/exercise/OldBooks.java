package WhileLoop.exercise;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bookSearched = scanner.nextLine();

        int bookCounter = 0;
        boolean bookFound = false;
        String bookChecked = scanner.nextLine();
        while (!bookChecked.equals("No More Books")) {


            if (bookChecked.equals(bookSearched)) {
                bookFound = true;
                                break;
            }
            bookCounter++;
            bookChecked = scanner.nextLine();
        }
        String output = "";
        if (bookFound) {
            output = String.format("You checked %d books and found it.", bookCounter );
        } else {
            output = String.format("The book you search is not here!%n"+"You checked %d books.", bookCounter);
        }
        System.out.println(output);
    }
}
