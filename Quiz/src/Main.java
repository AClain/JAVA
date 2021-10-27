import java.util.Scanner;

public class Main {
    private int score = 0;
    private int currentQuestion = 0;
    private String firstName = "";
    private String lastName = "";


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getCurrentQuestion() {
        return currentQuestion;
    }

    public void setCurrentQuestion(int currentQuestion) {
        this.currentQuestion = currentQuestion;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private static void initQuiz() {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter first name: ");
        this.setFirstName(sc.nextLine());
        System.out.print("Enter last name: ");
        this.setLastName(sc.nextLine());
    }

    public static void main(String[] args) {

    }
}
