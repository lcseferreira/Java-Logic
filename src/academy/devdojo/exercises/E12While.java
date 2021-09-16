package academy.devdojo.exercises;

import java.util.Scanner;

public class E12While {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the last number: ");
        int lastNumber = input.nextInt();
        int count = 0;

        while (count <= lastNumber) {
            if (count % 2 != 0) {
                System.out.print(count + " ");
            }
            count++;
        }
    }
}
