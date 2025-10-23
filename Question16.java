import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Questions and correct answers
        String[] questions = {
            "1. Computers understand high-level languages like Java and C. (true/false)",
            "2. An algorithm is a set of instructions to accomplish a task. (true/false)",
            "3. Java first released in 1992. (true/false)",
            "4. RAM is a type of permanent memory. (true/false)",
            "5. Operating systems manage hardware and software resources. (true/false)",
            "6. Java was named a person who makes good coffee. (true/false)",
            "7. Bytecode is platform independent language.  (true/false)",
            "8.JDK is part of JRE.(true/false)",
            "9.Its optional to declare main method as public.(true/false)",
            "10.class file contains byte code.(true/false)"
        };

        String[] correctAnswers = {"false", "true", "false", "false", "true","false","true","false","false","true"};

        int score = 0;

        System.out.println("💡 Welcome to the True/False Quiz!");
        System.out.println("-----------------------------------");

        // Loop through all questions
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase(correctAnswers[i])) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is: " + correctAnswers[i] + "\n");
            }
        }

        System.out.println("-----------------------------------");
        System.out.println("You scored " + score + " out of " + questions.length + "!");
        System.out.println("-----------------------------------");

        scanner.close();
    }
}
