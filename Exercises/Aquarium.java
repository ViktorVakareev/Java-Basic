package Exercises;

import java.util.Scanner;

public class Aquarium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //вход
        int lenght = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        // калкулации
        double volume = lenght*width*height*1.0;
        double volumeLitres = volume*0.001;
        double result = volumeLitres-volumeLitres*percent/100;
        // принт
        System.out.printf("%.2f",result);
    }
}
