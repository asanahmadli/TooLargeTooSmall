import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Please enter your mystery number");
        int num = scan.nextInt();

        int guesses = 0;
        while (true) {
            int number = random.nextInt(10);
            if (num > 10) {
                System.out.println("Your mystery number is bigger than random number range!");
                System.out.println("Start over again!");
                System.out.println("Your number not found!");
                break;
            } else if (number >= 5 && number != num) {
                System.out.println("Too large");
            } else if (number == num) {
                System.out.println("Correct guess");
                System.out.println("Your number found in " + guesses + " guesses");
                break;
            } else if (number < 5) {
                System.out.println("Too small");
            }
            guesses++;
        }


    }

}

