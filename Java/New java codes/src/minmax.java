import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int fir = sc.nextInt();
        System.out.print("Enter second number: ");
        int sec = sc.nextInt();

        if(fir > sec) {
            System.out.println("First number is largest.");
            System.out.println("Second number is smallest.");
        }
        else{
            System.out.println("Second number is largest.");
            System.out.println("First number is Smallest.");
        }

        sc.close();
    }
}

