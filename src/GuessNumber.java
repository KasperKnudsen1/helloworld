import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int userGuess = 5;
        int numberOfTries = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Gæt et tal mellem 1 og 10");
        Random rand = new Random();
        int numberToGuess = rand.nextInt(10) + 1;

        while (userGuess != numberToGuess) {
            userGuess = input.nextInt();
            if (userGuess > numberToGuess) {
                System.out.println("Dit svar er forkert, tallet er højt");
            } else if (userGuess < numberToGuess) {
                System.out.println("Dit svar er forkert, tallet er for lavt");

        } if (numberToGuess == userGuess) {

            } numberOfTries++;
        } System.out.println(" Du gættede rigigt efter " + numberOfTries + " forsøg");
        System.out.print("Dit svar:" + " " + numberToGuess);
    }
}
