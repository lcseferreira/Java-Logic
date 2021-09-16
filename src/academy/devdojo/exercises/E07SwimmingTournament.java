package academy.devdojo.exercises;

import java.util.Scanner;

public class E07SwimmingTournament {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = input.nextLine();

        System.out.println("Enter your age:");
        int age = input.nextInt();

        String category;

        if (age <= 10) {
            category = "- Children's category.";
            System.out.println(name + " " + category);
        } else if (age <= 15) {
            category = "- Youth category.";
            System.out.println(name + " " + category);
        } else if (age <= 19) {
            category = "- Pre-adult category.";
            System.out.println(name + " " + category);
        } else {
            category = "- Adult category.";
            System.out.println(name + " " + category);
        }
    }
}
