import java.util.Scanner;

public class EmpSalary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter joining year: ");
        int joinYear = sc.nextInt();

        System.out.print("Enter current year: ");
        int currYear = sc.nextInt();

        int workingyear = currYear - joinYear;

        double letInitialSalary = 1000;
        double incrementedSalary;
        if(workingyear >= 3){
            incrementedSalary = 1000 + (1000*30)/100;
            System.out.println("Year gap: "+workingyear);
            System.out.println("Salary Incremented by 30%, final salay is: "+incrementedSalary);
        }

        else{
            System.out.println("Year gap: "+workingyear);
            System.out.println("No increment in Salary");
        }
    }
}

