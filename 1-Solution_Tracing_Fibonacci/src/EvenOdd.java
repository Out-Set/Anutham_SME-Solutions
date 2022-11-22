import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        // Creating an object of Scanner class in oder to take input from user
        Scanner sc = new Scanner(System.in);

        // Read input from the keyboard
        System.out.print("Please enter a number: ");
        int num = sc.nextInt();

        if(num%2 == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

        // after the use of Scanner class, we must close it
        sc.close();
    }
}
