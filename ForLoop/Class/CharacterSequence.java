package ForLoop.Class;

import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int length = text.length(); // дава броя символи на Стринг-а в цяло число

        for (int i = 0; i < length ; i++) {

            char symbol = text.charAt(i); // печата символа, к. съответства на съотвевтната позиция в Стринга-почва се от нула винаги!
            System.out.println(symbol);
        }
    }
}
