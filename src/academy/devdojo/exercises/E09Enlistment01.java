package academy.devdojo.exercises;

import java.util.Scanner;

public class E09Enlistment01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Enter your gender [M] or [F]: ");
        String gender = input.nextLine();

        if ("M".equalsIgnoreCase(gender) && age >= 18) {
            System.out.println("Mandatory enlistment.");
        } else if ("F".equalsIgnoreCase(gender) && age >= 18) {
            System.out.println("Do you want to enlist?");
        } else if (("F".equalsIgnoreCase(gender) || "M".equalsIgnoreCase(gender)) && age < 18) {
            System.out.println("Enlistment not allowed.");
        } else {
            System.out.println("Invalid input.");
        }
    }
}
