import java.util.Random;
import java.util.Scanner;

public class MathGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int num1, num2, answer, userAnswer;
        char playAgain = 'y';
        
        while(playAgain == 'y') {
            num1 = rand.nextInt(10) + 1;
            num2 = rand.nextInt(10) + 1;
            answer = num1 + num2;
            
            System.out.print("What is " + num1 + " + " + num2 + "? ");
            userAnswer = input.nextInt();
            
            if(userAnswer == answer) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect. The answer is " + answer + ".");
            }
            
            System.out.print("Do you want to play again? (y/n) ");
            playAgain = input.next().charAt(0);
        }
        
        System.out.println("Thanks for playing!");
    }
}
