import java.util.Scanner;

class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Quiz App!");
        System.out.println("Answer the following questions:");

        // Questions and answers
        String[][] questions = {
            {"What is the capital of France?", "A. Paris", "B. London", "C. Rome", "D. Berlin", "A"},
            {"Which planet is known as the 'Red Planet'?", "A. Jupiter", "B. Mars", "C. Venus", "D. Saturn", "B"},
            {"What is the largest mammal in the world?", "A. African Elephant", "B. Blue Whale", "C. Polar Bear", "D. Giraffe", "B"},
            {"Who painted the 'Mona Lisa'?", "A. Leonardo da Vinci", "B. Vincent van Gogh", "C. Pablo Picasso", "D. Claude Monet", "A"}
        };

        for (int i = 0; i < questions.length; i++) {
            String question = questions[i][0];
            String option1 = questions[i][1];
            String option2 = questions[i][2];
            String option3 = questions[i][3];
            String option4 = questions[i][4];
            String correctAnswer = questions[i][5];

            System.out.println("Question " + (i + 1) + ": " + question);
            System.out.println(option1);
            System.out.println(option2);
            System.out.println(option3);
            System.out.println(option4);

            System.out.print("Your answer (Enter A, B, C, or D): ");
            String userAnswer = scanner.next().toUpperCase();

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect! The correct answer is " + correctAnswer);
            }
            System.out.println();
        }

        System.out.println("Quiz complete!");
        System.out.println("Your score: " + score + "/" + questions.length);

        scanner.close();
    }
}
