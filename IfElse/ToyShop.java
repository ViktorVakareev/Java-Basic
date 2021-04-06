package IfElse;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // input
        double trip = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double puzzlesRevenue = puzzles * 2.6;
        double dollsRevenue = dolls * 3.0;
        double bearsRevenue = bears * 4.10;
        double minionsRevenue = minions * 8.20;
        double trucksRevenue = trucks * 2.0;
        double ToysRevenue = puzzlesRevenue + dollsRevenue + bearsRevenue + minionsRevenue + trucksRevenue;
        int ToysCount = puzzles + dolls + bears + minions + trucks;

        double Rent = ToysRevenue * 0.10;

        double Discount = ToysRevenue * 0.25;
        if (ToysCount >= 50) {
            ToysRevenue = ToysRevenue - Discount - (ToysRevenue - Discount) * 0.1;
        } else {
            ToysRevenue = ToysRevenue - Rent;}

        // ПО - прост вариант е if (ToysCount >= 50) {
        //            ToysRevenue = ToysRevenue  * 0.75; Отстъпка при 50 или повече
        //        }
        // ToysRevenue = ToysRevenue  * 0.1 Вадим наема след IF, така, че ако е над 50 бр. отстъпката е извадена!

            double Num1 = ToysRevenue - trip;
            double Num2 = trip - ToysRevenue;

            if (ToysRevenue >= trip) {
                System.out.printf("Yes! %.2f lv left.", Num1);
            } else  {
                System.out.printf("Not enough money! %.2f lv needed.", Num2);
            }
        }
    }

