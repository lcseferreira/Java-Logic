package academy.devdojo.exercises;

import java.util.Scanner;

public class E04ControlFlow {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age > 17) {
            System.out.println("You're of legal age.");
        } else {
            System.out.println("You're underage.");
        }

        System.out.println("\n---- END OF PROGRAM  ----");
    }
}
