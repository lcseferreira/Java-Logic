package academy.devdojo.exercises;

import java.util.Scanner;

public class E03ReusingVariables {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary");
        float salary = input.nextFloat();

        float result = salary * 0.3F;

        System.out.println("30% of your salary is R$" + result + ".");

        result = salary * 0.15F;

        System.out.println("15% of your salary is R$" + result + ".");

        result = salary * 0.05F;

        System.out.println("5% of your salary is R$" + result + ".");
    }
}
