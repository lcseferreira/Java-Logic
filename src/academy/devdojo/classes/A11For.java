package academy.devdojo.classes;

public class A11For {

    public static void main(String[] args) {

        for (int number = 1; number < 21; number++) {
            String result = number % 2 == 0 ? "Number " + number + " is even" : "Number " + number + " is odd";
            System.out.println(result);
        }
    }
}
