import java.util.Scanner;
import java.util.Random;

public class numberGuessDemo_NR {
    public static void main(String[] args) {
        var RNG = new Random();
        var randNum = RNG.nextInt(10) + 1;
        var commandLineReader = new Scanner(System.in);
        System.out.println("Enter a random number between 1-10:");
        var numGuess = commandLineReader.nextInt();
        if (randNum == numGuess) {
            System.out.println("You guessed the number correctly! " + randNum + " is the correct number!");
        } else {
            while (numGuess != randNum) {
                System.out.println("Sorry, " + numGuess + " is incorrect. Try again:");
                numGuess = commandLineReader.nextInt();
            }
            System.out.println("Successful guess!");
        }
    }
}