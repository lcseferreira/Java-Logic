package academy.devdojo.classes;

import java.util.Scanner;

public class A05ConditionalStructure {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter true or false: ");
        boolean condition = input.nextBoolean();

        if (condition) {
            System.out.println("True: inside the block if");
        } else {
            System.out.println("False: inside the block else");
        }
        System.out.println("Out of if-else");
    }
}
