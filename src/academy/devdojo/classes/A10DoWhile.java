package academy.devdojo.classes;

import java.util.Scanner;

public class A10DoWhile {

    public static void main(String[] args) {

        int wishContinue = 1;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("PLAYER 1: Enter a number between 1 and 10: ");
            int numPlayer1 = input.nextInt();
            System.out.println("PLAYER 2: Enter a number between 1 and 10: ");
            int numPlayer2 = input.nextInt();

            if (numPlayer1 == numPlayer2) {
                System.out.println("\n### The numbers are the same ###\n");
            } else {
                System.out.println("\n### The numbers are different ###\n");
            }

            System.out.print("""
                    Do you wish to continue?
                    1. Yes
                    2. No
                    """);
            wishContinue = input.nextInt();
        } while (wishContinue == 1);
    }
}
