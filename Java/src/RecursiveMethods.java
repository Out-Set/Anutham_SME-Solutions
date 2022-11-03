import java.util.Scanner;

//RecursiveMethods class
public class RecursiveMethods {
    
    // oddEvenMatchRec
    public static boolean oddEvenMatchRec(int arr[], int n){
        
        if(arr.length==n)
            return true;
            
        if(n%2==0 && arr[n]%2!=0)
            return false;
        if(n%2==1 && arr[n]%2!=1)
            return false;
        
        return oddEvenMatchRec(arr, n+1);
    }
    
    // sumNRec
    public static int sumNRec(int n){
        if(n==0) return 0;
         
        return n + sumNRec(n-1);
    }
    
    // nDownToOne
    public static void nDownToOne(int n){
        if(n==0) return;
        
        System.out.println (n);
        
        nDownToOne(n-1);
    }
    
    // inputAndPrintReverse
    public static void inputAndPrintReverse(Scanner sc){
        
        int n = sc.nextInt();
        if(n!=0) 
            inputAndPrintReverse(sc);
        System.out.println (n);
    }
    
    // Main method
    public static void main (String[] args){
        
        //Testing oddEvenMatchRec
        System.out.println ("Testing oddEvenMatchRec: ");
        int a[] = {0, 1, 2, 3, 4, 5, 6};
        int b[] = {1, 2, 3, 4, 5};
        System.out.println (oddEvenMatchRec(a, 0));
        System.out.println (oddEvenMatchRec(b, 0));
        System.out.println();

        //Testing sumNRec
        System.out.println ("Testing sumNRec: ");
        System.out.println (sumNRec(10));
        System.out.println (sumNRec(5));
        System.out.println();

        //Testing nDownToOne
        System.out.println ("Testing nDownToOne: ");
        nDownToOne(10);
        System.out.println();
        
        //Testing inputAndPrintReverse
        Scanner sc = new Scanner(System.in);
        System.out.println ("Testing inputAndPrintReverse: ");
        inputAndPrintReverse(sc);
    }
}

