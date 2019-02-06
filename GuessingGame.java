import java.util.Scanner;
import java.util.Random;
/**
 * Game to guess a number.
 *
 * @author (Robyn)
 * @version (V1.0)
 */
public class GuessingGame
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
    //Create random number
    Random random = new Random();
    //Get user input
    Scanner in = new Scanner(System.in);
    //Generate number between 1 and 10
    int number = random.nextInt(10);
    int guess = -1;
    int counter = 0;
    
    while (guess != number){
    System.out.print("Guess the number ");
    guess = in.nextInt();
    if (guess<number){
        System.out.println("Too low! Guess again");
        counter++;
    } else if (guess>number){
        System.out.println("Too high! Guess again");
        counter++;
    }else{
        System.out.println("You are correct! Lucky guess!");
        System.out.println("You guessed" +counter+ "times");
    }
}
    
    
  

    
    
    
    
    
    }
    }
    