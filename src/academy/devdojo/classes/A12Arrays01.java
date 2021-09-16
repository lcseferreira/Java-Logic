package academy.devdojo.classes;

public class A12Arrays01 {

    public static void main(String[] args) {

        double[] grades = new double[4];
        grades[0] = 7;
        grades[1] = 9;
        grades[2] = 8.5;
        grades[3] = 10;

        // Iterating grades - foreach

        for (double grade : grades) {
            System.out.println("Grade: " + grade);
        }

        System.out.println();

        // Averagem

        double sum, average;
        sum = average = 0;

        for (double grade : grades) {
            sum += grade;
        }

        average = sum / grades.length;

        System.out.println("The average of the grades is " + average);


    }
}
