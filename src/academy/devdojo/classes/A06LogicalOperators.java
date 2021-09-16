package academy.devdojo.classes;

import java.util.Scanner;

public class A06LogicalOperators {

    public static void main(String[] args) {

        // ! (not) && (and) || (or)

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your salary: ");

        double salary = input.nextDouble();
        double tax;

        if (salary <= 1903.98) {
            System.out.println("Exempt.");
        } else if (salary > 1903.98 && salary <= 2826.65) {
            tax = 0.075;
            System.out.println("Income Tax: R$ " + salary * tax);
        } else if (salary > 2826.65 && salary <= 3751.05) {
            tax = 0.15;
            System.out.println("Income Tax: R$ " + salary * tax);
        } else if (salary > 3751.05 && salary <= 4664.68) {
            tax = 0.225;
            System.out.println("Income Tax: R$ " + salary * tax);
        } else {
            tax = 0.275;
            System.out.println("Income Tax: R$ " + salary * tax);
        }
    }
}
