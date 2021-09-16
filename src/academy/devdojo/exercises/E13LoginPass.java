package academy.devdojo.exercises;

import java.util.Scanner;

public class E13LoginPass {
    public static void main(String[] args) {

        String userLogin = "adminlucas";
        String userPassword = "258456";


        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your login: ");
            String login = input.nextLine();
            System.out.println("Enter your password: ");
            String password = input.nextLine();

            if (login.equals(userLogin) && password.equals(userPassword)) {
                System.out.println("Access granted.");
                break;
            }

            System.out.println("Access denied.\n");
        }
    }
}
