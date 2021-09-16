package academy.devdojo.exercises;

import java.util.Scanner;

public class E17Arrays01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[] array1, array2, finalArray ;
        array1 = new double[9];
        array2 = new double[9];
        finalArray = new double[9];

        System.out.println("Array one");
        for (int index = 0; index < array1.length; index++) {
            System.out.println("Enter a number: ");
            array1[index] = input.nextDouble();
        }

        System.out.println();

        System.out.println("Array two");
        for (int index = 0; index < array2.length; index++) {
            System.out.println("Enter a number: ");
            array2[index] = input.nextDouble();
        }

        for (int index = 0; index < finalArray.length; index++) {
            finalArray[index] = array1[index] * array2[index];
        }

        System.out.println();

        for (int index = 0; index < finalArray.length; index++) {
            System.out.println(array1[index] + " x " + array2[index] + " = " + finalArray[index]);
        }
    }
}
