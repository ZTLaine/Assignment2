//  3/15/24
//  Zack Laine
//  Assignment 2

public class GuessEvaluator {
    static int checkGuess(int rng, int guess, int attempt){
//        I just want to make a note, because this will match the example output correctly
//        but leaving off with "please pick a higher/lower number" after you've run out of guesses
//        feels like bad form.
//        It should really have a language change to "Guess too high/low!" I think. -- Zack
        if(guess == rng) {
            System.out.println("You win!");
        }
        else if(guess <= rng) {
            System.out.println("Please pick a higher number");
            attempt++;
        }
        else {
            System.out.println("Please pick a lower number");
            attempt++;
        }

        if(attempt > 4){
            System.out.println("You lose!");
            System.out.println("The number to guess was: " + rng);
        }
        return attempt;
    }
}
