import java.util.Random;
import java.util.Scanner;

public class NumGuessGame {
    private int minNum; //inclusive
    private int maxNum; //exclusive
    private int maxAttempts;
    private int randomNum;
    private int attemptsCtr;
    private boolean gameWon;

    public NumGuessGame(int minNum, int maxNum, int maxAttempts){
        this.minNum = minNum;
        this.maxNum = maxNum;
        this.maxAttempts = maxAttempts;

        //slimming down that rng generation
        randomNum = (new Random()).nextInt(this.minNum, this.maxNum);
    }

    public void startGame(){
        Scanner scanner = new Scanner(System.in);
        int guess;
        do {
            System.out.println("Pick a number between 1 and 100");
            guess = scanner.nextInt();

            guess = InRange.inRange(guess, scanner);
            attemptsCtr = EvaluateGuess.checkGuess(randomNum, guess, attemptsCtr);
        }while(attemptsCtr < 5 && randomNum != guess);
        scanner.close();
    }

}
