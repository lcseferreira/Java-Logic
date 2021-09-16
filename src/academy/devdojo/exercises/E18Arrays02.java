package academy.devdojo.exercises;

import java.util.Scanner;

public class E18Arrays02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[] array1, array2, finalArray;
        array1 = new double[3];
        array2 = new double[3];
        finalArray = new double[3];

        for (int i = 0; i < finalArray.length; i++) {
            System.out.println("Enter a number to array 1: ");
            array1[i] = input.nextDouble();
            System.out.println("Enter a number to array 2: ");
            array2[i] = input.nextDouble();
            finalArray[i] = array1[i] * array2[i];
        }

        for (double number : finalArray) {
            System.out.print(number + " ");
        }
    }
}
