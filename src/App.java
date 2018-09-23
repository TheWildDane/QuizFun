import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String q1 = "what color are apples?\n"
                + "(a)red/green\n(b)Orange\n(c)Pink\n";
        String q2 = "what color are Bananas?\n"
                + " (a)red/green\n(b)Yellow\n(c)blue\n";
        Question[] questions = {
                new Question(q1, "a"),
                new Question(q2, "b")
                };
        takeTest(questions);


    }
    public static void takeTest(Question [] questions) {
        int Score = 0;
        Scanner KeyboardInput = new Scanner(System.in);

        for(int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].prompt);
            String answer = KeyboardInput.nextLine();
            if(answer.equals(questions[i].answer)) {
                Score++;
            }
        }
        System.out.println("You got " + Score + "/" + questions.length);
    }
}
