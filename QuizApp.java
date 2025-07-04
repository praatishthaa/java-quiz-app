 import java.util.*;

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Question> questions = new ArrayList<>();

        // Add questions here
        questions.add(new Question("What is the capital of France?",
                new String[]{"Berlin", "Madrid", "Paris", "Rome"}, 3));

        questions.add(new Question("Which data type is used to create a variable that should store text?",
                new String[]{"String", "int", "float", "char"}, 1));

        questions.add(new Question("What is the result of 5 + 3 * 2?",
                new String[]{"16", "11", "13", "10"}, 2));

        questions.add(new Question("Which keyword is used to inherit a class in Java?",
                new String[]{"super", "extends", "this", "implements"}, 2));

        questions.add(new Question("Java is platform-______?",
                new String[]{"independent", "dependent", "neutral", "specific"}, 1));

        questions.add(new Question("Which of these is not a Java primitive data type?",
                new String[]{"int", "boolean", "String", "double"}, 3));

        questions.add(new Question("What does JVM stand for?",
                new String[]{"Java Virtual Machine", "Java Variable Method", "Java Very Much", "Just Virtual Machine"}, 1));

        questions.add(new Question("What will be the output of: System.out.println(10/0);",
                new String[]{"Infinity", "0", "Error", "Exception"}, 4));

        int score = 0;

        System.out.println("Welcome to the Java Quiz\n");

        for (int i = 0; i < questions.size(); i++) {
            System.out.println("Question " + (i + 1) + ":");
            questions.get(i).displayQuestion();

            System.out.print("Your answer (1-4): ");
            int userAnswer = scanner.nextInt();

            if (questions.get(i).isCorrect(userAnswer)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect.\n");
            }
        }

        System.out.println("Quiz completed.");
        System.out.println("Your score: " + score + " out of " + questions.size());

        scanner.close();
    }
}