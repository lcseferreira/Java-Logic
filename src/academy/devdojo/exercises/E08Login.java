package academy.devdojo.exercises;

import java.util.Scanner;

public class E08Login {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your login: ");
        String login = input.nextLine();

        if (login.isBlank() || login.isEmpty() || "adm".equalsIgnoreCase(login) || "admin".equalsIgnoreCase(login)) {
            System.out.println("Invalid user.");
        } else {
            System.out.println("Successfully registered user.");
        }
    }
}
