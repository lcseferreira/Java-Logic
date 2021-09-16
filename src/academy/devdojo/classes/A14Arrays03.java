package academy.devdojo.classes;

import java.util.Scanner;

public class A14Arrays03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] multArray = new int[2][2];

        for (int i = 0; i < multArray.length; i++) {
            System.out.println("Array " + (i + 1));
            for (int j = 0; j < multArray[i].length; j++) {
                System.out.print("Enter a number: ");
                multArray[i][j] = input.nextInt();
            }
        }

        System.out.println("In position [0][0] = " + multArray[0][0]);
        System.out.println("In position [0][1] = " + multArray[0][1]);
        System.out.println("In position [1][0] = " + multArray[1][0]);
        System.out.println("In position [1][1] = " + multArray[1][1]);
    }
}
