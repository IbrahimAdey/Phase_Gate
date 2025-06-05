import java.util.Scanner;
import java.util.Random;

public class Questionaire {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int score = 0;
        int totalQuestions = 10;
	int totalAnswer = 0;
	a = true;
	b = false;
	a = true;
	b = false;

	quetion1 = What is 1 + 1 = 2 ?; 
	answer1 = (a)True (b)false ;
	correct1 = (a)True;

	quetion2 = What is 1 + 4 = 5 ? ;
	answer2 = (a)True (b)false;
	correct2 = (a)True;

	quetion3 = What is 11 + 11 = 1111 ?; 
	answer3 = (a)True (b)false ;
	correct3 = (b)false;

	quetion4 = What is 1 * 1 = 2 ? ;
	answer4 = (a)True (b)false ;
	correct4 = (b)false;

	quetion5 = What is 1 * 0 = 10 ? ;
	answer5 = (a)True (b)false ;
	correct5 = (b)false;

	quetion6 = What is 11 * 1 = 11 ?; 
	answer6 = (a)True (b)false ;
	correct6 = (a)True;

	quetion7 = What is 1 / 1 = 0 ? ;
	answer7 = (a)True (b)false ;
	correct7 = (b)false;

	quetion8 = What is 10 + 12 = 22?; 
	answer8 = (a)True (b)false ;
	correct8 = (a)True;

	quetion9 = What is 10 + 3 = 13 ?; 
	answer9 = (a)True (b)false ;
	correct9 = (a)True;

	quetion10 = What is 1 - 1 = 0 ?; 
	answer10 = (a)True (b)false ;
	correct10 = (a)True;

        for (int i = 1; i <= totalQuestions; i++) {
		for (int j = 1; j <= totalAnswers; j++) {
            int question = rand.nextInt(10) + 1;

            System.out.println("Question " + i + ": What is " + question + "?");

            boolean correct = false; }
            for (int attempt = 1; attempt <= 2; attempt++) {
                System.out.print("Attempt " + attempt + ": ");
                int answer = input.nextInt();

                if (answer == correctAnswer) {
                    System.out.println("Correct!");
                    score++;
                    correct = true;
                    break;
                } else {
                    System.out.println("Incorrect.");
                }
            }

            if (!correct) {
                System.out.println("The correct answer was: " + correctAnswer);
            }
            System.out.println();
        }


        System.out.println("Quiz Completed!");
        System.out.println("Your final score: " + score + "/" + totalQuestions);

        input.close();
    }
}