import java.util.Scanner;

public class numberGuess {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int num, guess, tries = 0;
        int max=100,min=1;
        num=(int)(Math.floor(Math.random()*(max-min+1)+min));

        System.out.println("Guess My Number Game");
        System.out.println("--------------------");

        do {
            System.out.print("Enter a guess between 1 and 100: ");
            guess = sc.nextInt();

            if (guess > num) {
                System.out.println("Too high!"); 
            }
            else if (guess < num) {
                System.out.println("Too low!");
            }
            else {
                System.out.println("\nCorrect! You got it in "+tries+ " guesses!");
            }

            tries++;
        }

        while(guess != num);        
    }
}

