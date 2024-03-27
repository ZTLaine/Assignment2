//  3/15/24
//  Zack Laine
//  Assignment 2

import java.util.*;

public class Main {
    public static void main(String[] args) {
        NumGuessGame game = new NumGuessGame(1, 101, 5);
        System.out.println("Random num is: " + game.getRandomNum());
        game.startGame();
    }


    public static void originalMain(){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int guess;
        int rng;

        int attempt = 0;
        rng = random.nextInt(0, 100) + 1;
        do {
            System.out.println("Pick a number between 1 and 100");
            guess = scanner.nextInt();

            guess = RangeValidator.inRange(guess, scanner);
            attempt = GuessEvaluator.checkGuess(rng, guess, attempt);
        }while(attempt < 5 && rng != guess);
        scanner.close();
    }
}