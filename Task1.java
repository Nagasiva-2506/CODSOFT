//Java program to generate a random number and prompting user to guess it.

import java.util.Random;
import java.util.Scanner;

//Creating main class 
public class Task1 {
    //main method execution starts from here
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);//Pre defined method to create an object for scanner class
        Random r = new Random();//creating object for the Random class that generates random number 
        
        int lower = 1;//The lower boundary
        int upper = 100;//Upper boundary 
        int numberToGuess = r.nextInt(upper - lower + 1) + lower;//logic that create the random number
        
        int maxAttempts = 5;//maximum attempts for the user 
        int attempts = 0;//initially starts from zero
        int score = 0;//initial score is zero
        
        System.out.println("Welcome to the Number Guessing Game.....!");
        System.out.println("I'm thinking of a number between " + lower+ " and " + upper + ".");
        System.out.println("You have " + maxAttempts + " attempts to guess it.");
        
        while (attempts < maxAttempts) //executes untill the condition becomes false
        {
            System.out.print("Enter your guess: ");//asking the user to guess number 
            int userGuess = s.nextInt();//this will connect with the keyboard and enables user to enter 
            attempts++;//everytime increases by one 
            
            if (userGuess < lower || userGuess > upper)//out of boundary value entered
            {
                System.out.println("Please guess a number between " + lower+ " and " + upper + ".");
                continue;
            }
            
            if (userGuess == numberToGuess) //Guessed correctly
            {
                score = maxAttempts - attempts + 1;//logic to generate score 
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                System.out.println("Your score is: " + score);
                break;//execution stops here
            } else if (userGuess < numberToGuess) //entered smaller than random  
            {
                System.out.println("Guessed lower than generated.....Try bit higher");
            } else //entered greater than random
            {
                System.out.println("Guessed higher than generated.....Try bit lower");
            }
        }
        
        if (attempts >= maxAttempts) //reached max attempts
        {
            System.out.println("Sorry, you've run out of attempts. The correct number was " + numberToGuess + ".");
            System.out.println("Your score is: " + score);
        }
        
        s.close();
    }
}