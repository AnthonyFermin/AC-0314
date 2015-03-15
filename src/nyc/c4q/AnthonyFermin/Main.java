package nyc.c4q.AnthonyFermin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int guess;
        int answer = 10;
        int numOfGuesses = 5;

        do {
            System.out.println("Guess a number from 1-20, you have " + numOfGuesses + " chances to guess the correct answer.");
            guess = input.nextInt();
            if(guess == answer){
                System.out.println("That's Correct!! Congratulations!!!");
                break;
            }else if(guess > answer && guess <= 20){
                System.out.println("Your guess is too high!");
                numOfGuesses--;
            }else if(guess < answer && guess > 0){
                System.out.println("Your guess is too low!");
                numOfGuesses--;
            }else{
                System.out.println("Your guess is out of the specified range!!!");
            }
        }while(numOfGuesses > 0);
        if(numOfGuesses <= 0){
            System.out.println("Sorry, you ran out of guesses!");
        }



    }
}
