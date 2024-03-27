import java.util.Random;
import java.util.Scanner;

public class NumGuessGame {
    private int minNum; //inclusive
    private int maxNum; //exclusive
    private int maxAttempts;
    private int randomNum;
    private int attemptsCtr;
    private boolean gameWon;
    private boolean gameEnded;

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

            String validationError = validate(guess);
            if (!validationError.isEmpty()){
                System.out.println(validationError);
                continue;
            }
            attemptsCtr++;
            evaluateGuess(guess);
            if (gameWon){
                System.out.println("You win!");
            }
            else if (attemptsCtr >= maxAttempts){
                System.out.println("You lose!");
                System.out.println("The number to guess was: " + randomNum);
                gameEnded = true;
            }
        }while(!gameEnded && !gameWon);
        scanner.close();
    }

    private void evaluateGuess(int guess){
        if(guess == randomNum) {
            gameWon = true;
            gameEnded = true;
        }
        else if(guess < randomNum) {
            System.out.println("Please pick a higher number");
        }
        else {
            System.out.println("Please pick a lower number");
        }
    }

    private String validate(int guess){
        if (guess < 1 || guess > 100) {
            return "Your guess is not between 1 and 100, please try again";
        }
        return "";
    }

    public int getRandomNum() {
        return randomNum;
    }
}
