import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String next = "";

        while (!Objects.equals(next, "q")) {
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter a number (enter q to quit): ");

            next = sc.next();
            if (next.matches("^-?\\d+$")) {
                int num = Integer.parseInt(next);

                StringBuilder output = new StringBuilder();

                for (int i = 1 ; i <= num ; i++) {
                    if (i % 15 == 0) {
                        output.append("FizzBuzz");
                    } else if (i % 5 == 0) {
                        output.append("Buzz");
                    } else if (i % 3 == 0) {
                        output.append("Fizz");
                    } else {
                        output.append(i);
                    }

                    if (i +  1 <= num) {
                        output.append(", ");
                    }
                }

                System.out.println("For input " + next + ", ouput is:\n");
                System.out.println(output);

                continue;
            }

            System.out.print("Input could not be converted to a number. Enter something different.\n");
        }

        System.out.print("Goodbye :(\n");
    }
}
