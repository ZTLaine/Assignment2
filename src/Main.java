//  3/15/24
//  Zack Laine
//  Assignment 2

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int guess;
        int rng;

        int attempt = 0;
        rng = random.nextInt(0, 100) + 1;
        do {
            System.out.println("Pick a number between 1 and 100");
            guess = scanner.nextInt();

            guess = InRange.inRange(guess, scanner);
            attempt = EvaluateGuess.checkGuess(rng, guess, attempt);
        }while(attempt < 5 && rng != guess);
        scanner.close();
    }
}