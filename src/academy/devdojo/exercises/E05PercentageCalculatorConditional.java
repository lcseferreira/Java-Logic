package academy.devdojo.exercises;

import java.util.Scanner;

public class E05PercentageCalculatorConditional {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter your salary: ");
        double salary = input.nextDouble();
        double percentage, result;

        if (salary > 4500) {
            percentage = 30;
        } else {
            percentage = 15;
        }
        result = salary * percentage / 100;

        System.out.println(percentage + "% of your salary is $" + result + ".");
    }

}
