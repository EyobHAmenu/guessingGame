import java.util.Random;
import java.util.Scanner;

public class guessGame {
    public static void main(String[] args)
    {
        int num;
        int randomNumber;
        boolean boo = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("I am thinking about a number between 1 and 10...");
        Random random_Gen = new Random();

        randomNumber = (random_Gen.nextInt(10) + 1);
        
        while (boo == false){
            System.out.println("Can you guess it?");
            num = sc.nextInt();
            sc.nextLine();
            if(num > randomNumber)
            {
                System.out.println("It's too high. Guess again.");
            }
            else if ( num < randomNumber)
            {
                System.out.println("It's too low. Guess again.");
            }
            else{
                System.out.println("That's right! You are a good guesser.");
                boo = true;
            }
        }

    }
}
