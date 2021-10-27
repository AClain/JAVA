import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String next = "";

        while (!next.equals("q")) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number:");
            next = sc.next();

            if (next.matches("-?\\d+")) {
                int number = Integer.parseInt(next);

                if (number <= 0) {
                    System.out.println("Please provide a number greater or equal to 1.\n");
                    continue;
                }

                System.out.println("1");
                if (number == 1) {
                    continue;
                } else {
                    System.out.println("11");
                    if (number == 2) {
                        continue;
                    }
                }

                StringBuilder output = new StringBuilder("");
                StringBuilder copy = new StringBuilder("11");

                number = number - 2;

                for (; number > 0 ; number--) {
                    char currentNumber = copy.charAt(0);
                    int countCurrentNumber = 0;

                    for (int i = 0 ; i < copy.length() ; i++) {
                        if (copy.charAt(i) != currentNumber) {
                            output.append(countCurrentNumber);
                            output.append(currentNumber);
                            countCurrentNumber = 0;
                            currentNumber = copy.charAt(i);
                        }

                        countCurrentNumber++;
                    }

                    if (countCurrentNumber > 0) {
                        output.append(countCurrentNumber);
                        output.append(currentNumber);
                    }

                    System.out.println(output);
                    copy.setLength(0);
                    copy.append(output);
                    output.setLength(0);
                }
            }
        }
    }
}
