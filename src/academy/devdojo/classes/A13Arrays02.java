package academy.devdojo.classes;

import java.util.Scanner;

public class A13Arrays02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] grades = new double[4];
        double sum, average;
        sum = average = 0;


        for (int index = 0; index < grades.length; index++) {
            System.out.println("Enter your grade " + (index + 1));
            grades[index] = input.nextDouble();
        }

        for (double grade : grades) {
            sum += grade;
        }

        average = sum / grades.length;

        System.out.println("Your final average is " + average);
    }
}
