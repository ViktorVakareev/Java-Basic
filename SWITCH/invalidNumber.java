package SWITCH;

import java.util.Scanner;

public class invalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        boolean isValid = ((number >= 100) && (number <=200));

        if (isValid) {
            System.out.println();
        } else if (number == 0) {
            System.out.println();
        } else {
            System.out.println("invalid");
        }
        //Дадено число е валидно, ако е в диапазона [100…200] или е 0.  Да се напише програма,
        // която чете цяло число, въведено от потребителя, и печата "invalid" ако въведеното число не е валидно.
        //* Подсказка: използвайте условна if проверка с отрицание и логически операции.

    }
}
