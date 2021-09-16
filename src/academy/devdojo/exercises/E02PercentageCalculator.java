package academy.devdojo.exercises;

import java.util.Scanner;

public class E02PercentageCalculator {

    public static void main(String[] args) {

        // Data input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        double salary = input.nextDouble();

        System.out.println("Enter a percentage: ");
        double percentage = input.nextDouble();

        double calculateSalaryPercentage = salary * percentage / 100;

        System.out.println(percentage + "% of your salary is R$" + calculateSalaryPercentage + ".");
    }
}
