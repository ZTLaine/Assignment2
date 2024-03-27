//  3/15/24
//  Zack Laine
//  Assignment 2

import java.util.Scanner;

public class RangeValidator {
    static int inRange(int guess, Scanner scanner){
        //Checking to be sure it's in range
        while (guess < 1 || guess > 100) {
            System.out.println("Your guess is not between 1 and 100, please try again");
            guess = scanner.nextInt();
        }
        return guess;
    }
}
