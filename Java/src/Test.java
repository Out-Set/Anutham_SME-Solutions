import java.util.Scanner;  
public class Test {      
    public static int factorial(int n) {         
        if (n <= 0){             
            return 1;
        }         
        else{             
            return n * factorial(n-1); 
        }    
    }   
       
    public static int factorialRecursive(int n) {         
        return n <= 0 ? 1 : factorialRecursive(n-1) * n;     
    }  

    public static void main(String[] args) {         
        Scanner in = new Scanner(System.in);         
        System.out.print("Enter an integer: ");         
        int n = in.nextInt();         
        System.out.println("Factorial of "+n+" is " + factorial(n));         
        
        System.out.println(n + "! = " + factorialRecursive(n));     
    } 
} 
 

