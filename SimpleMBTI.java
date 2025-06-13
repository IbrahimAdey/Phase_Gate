import java.util.Scanner;

public class SimpleMBTI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] questions = {
            "A. Expand energy, enjoy groups\nB. Conserve energy, enjoy one-on-one",
     "A. Interpret literally\nB. Look for meaning and possibilities",
     "A. Logical, thinking, questioning\nB. Empathetic, feeling, accomodating",
     "A. Organized, orderly\nB. Flexible, adaptable",
     "A. More outgoing\nB. More reserved",
     "A. Focus on the now\nB. Focus on the future",
     "A. Value justice\nB. Value compassion",
     "A. Prefer a plan\nB. Go with the flow",
     "A. Enjoy crowds\nB. Enjoy solitude",
     "A. Trust experience\nB. Trust intuition",
     "A. Firm\nB.  Gentle",
     "A. Regulated, structured\nB. easy-going, live and let live",
     "A. External, communicative\nB. Internal, keep to youself",
     "A. Focus on here-and-now\nB. Look to the future",
     "A. Tough-minded, just\nB. Tender-hearted, merciful",
     "A. Preparation, plan ahead\nB. Go with the flow, adapt as you go",
     "A. Active, initiate\nB.Reflective, delibrate",
     "A. Facts, things\nB. Ideas, dreams, philosophical",
     "A. Matter of fact, issue-oriented\nB. Sensitive, people-oriented",
     "A. Control, govern\nB. Latitude, freedom"
        };

        int e = 0, i = 0, s = 0, n = 0, t = 0, f = 0, j = 0, p = 0;

        for (int q = 0; q < 20; q++) {
            String answer;
            do {
                System.out.println("\nQuestion " + (q + 1));
                System.out.println(questions[q]);
                System.out.print("Choose A or B: ");
                answer = input.nextLine().trim().toUpperCase();
            } while (!answer.equals("A") && !answer.equals("B"));

            switch (q % 4) {
                case 0: if (answer.equals("A")) e++; else i++; break;
                case 1: if (answer.equals("A")) s++; else n++; break;
                case 2: if (answer.equals("A")) t++; else f++; break;
                case 3: if (answer.equals("A")) j++; else p++; break;
            }
        }

        String mbti = "";
        mbti += (e >= i) ? "E" : "I";
        mbti += (s >= n) ? "S" : "N";
        mbti += (t >= f) ? "T" : "F";
        mbti += (j >= p) ? "J" : "P";

        System.out.println("\nYour MBTI personality type is: " + mbti);
   
    }
}