package academy.devdojo.exercises;

import java.util.Scanner;

public class E11SwitchCase {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("""
                SA = Savings Account
                CA = Currents Account
                IA = Investor Account

                Enter your account type:\s""");
        String accountType = input.nextLine();

        switch (accountType.toUpperCase()) {
            case "SA" -> System.out.println("Interest percentual: 0.05%");
            case "CA" -> System.out.println("Interest percentual: 0.02%");
            case "IA" -> System.out.println("Interest percentual: 0.1%");
            default -> System.out.println("Invalid input");
        }
    }
}
