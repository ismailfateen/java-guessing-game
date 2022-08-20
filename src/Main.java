import java.util.Random;
import java.util.Scanner;

public class Main {

    private static int generateNumber() {
        return new Random().nextInt(101);
    }

    private static void printResult(int guess, int generatedNumber) {
        if (guess > generatedNumber) {
            System.out.println("Too high!");
        } else if (guess < generatedNumber) {
            System.out.println("Too low!");
        } else {
            System.out.println("You win!");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        System.out.println("Generated a number between 1 and 100, guess it!");
        int generated = generateNumber();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String guessS = scanner.next();
//            int guess = 0;
            int guess;
            try {
                guess = Integer.parseInt(guessS);
            } catch (NumberFormatException e) {
                System.out.println("Not an integer, too high of a number or too small of one!");
                continue;
            }
            if (guess > 100) {
                System.out.println("More than 100!");
                continue;
            }
            if (guess < 0) {
                System.out.println("Less than 100!");
                continue;
            }

            printResult(guess, generated);
        }
    }


}
