package academy.devdojo.exercises;

import java.util.Scanner;

public class E06OddOrEven {

    public static void main(String[] args) {

        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            String result = number % 2 == 0 ? number + " is odd." : number + " is even.";
            System.out.println(result);

            System.out.println();

            System.out.println("""
                    Do you want to continue?
                    1. Yes
                    2. No
                    """);
            int toContinue = input.nextInt();

            if (toContinue == 2) break;
        }
    }
}
