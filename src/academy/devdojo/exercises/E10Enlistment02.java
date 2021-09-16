package academy.devdojo.exercises;

import java.io.IOException;
import java.util.Scanner;

public class E10Enlistment02 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Enter your gender [M] or [F]: ");
        char gender = (char) System.in.read();

        if ("M".equalsIgnoreCase(String.valueOf(gender)) && age >= 18) {
            System.out.println("Mandatory enlistment.");
        } else if ("F".equalsIgnoreCase(String.valueOf(gender)) && age >= 18) {
            System.out.println("Do you want to enlist?");
        } else if (("F".equalsIgnoreCase(String.valueOf(gender)) || "M".equalsIgnoreCase(String.valueOf(gender))) && age < 18) {
            System.out.println("Enlistment not allowed.");
        } else {
            System.out.println("Invalid input.");
        }
    }
}
