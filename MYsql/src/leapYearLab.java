import java.util.Scanner;

public class leapYearLab {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
      
    int userYear;
    boolean LeapYear;
        
    System.out.print("Enter the year: ");
    userYear = scnr.nextInt();
 
    LeapYear = isLeapYear(userYear);
 
    //if leap year
    if (LeapYear){
      System.out.println(userYear + " - leap year");
    }
    else{
      System.out.println(userYear + " - not a leap year");
    }

    scnr.close();
  }
 
 
  public static boolean isLeapYear(int userYear){

    boolean LeapYear;
 
      /* Type your code here. */
      if((userYear % 400 == 0) || ((userYear % 4 == 0) && (userYear % 100 != 0))){
        LeapYear = true;
      }
      else{
        LeapYear = false;
      }
    
    return LeapYear;

    }
}

