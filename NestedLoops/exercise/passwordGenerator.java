package NestedLoops.exercise;

import java.util.Scanner;

public class passwordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 97; k < 97 + l; k++) { // a по ASCII е 97, първите l символа са 97+l
                    for (int m = 97; m < 97 + l; m++) {
                        for (int o = 1; o <= n; o++) { // по-голям от i и j
                            if (o > i && o > j) {
                                System.out.printf("%d%d%c%c%d ", i, j, k, m, o);
                            }
                                                    }
                    }
                }
            }

        }

    }
}
