import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Census: ");

        int age = 0;
        int input = 0;
        int count = 0;
        int average = 0;
        while(input > 0){
            System.out.print("Next person's age (negative to quit)? ");
            age = age + input;
            count++;
            if(input < 0){
                average = age/count;
                System.out.print("Average age is: "+average);
            }
        }
        sc.close();
    }
}
