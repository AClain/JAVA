public class Main {
    public static double average(int... numbers) {
        double result = 0;

        for (int number : numbers) {
            result = result + number;
        }

        return result / numbers.length;
    }

    public static void main(String[] args) {
        System.out.println(average(20, 12, 20, 6));
    }
}
