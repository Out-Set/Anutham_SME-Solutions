import java.util.Scanner;

public class Palindrome{
    public static void main( String args[]){
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter the String");
      String s= sc.nextLine();
      int l=0, r =s.length()-1,flag =0;
      while(l<r){
        if(s.charAt(l) != s.charAt(r)){
          flag=1;
          break; 
        }
        l++;
        r--;  
        }
      if(flag==0)
        System.out.println("String is palindrome");
      else
        System.out.println("String is not palindrome");
    }
    
}