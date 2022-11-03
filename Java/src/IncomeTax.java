import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Income: ");
        int income = sc.nextInt();

        int tax = 0;
        if(income < 500){
            System.out.println("No Tax");
        }
        else if(income >= 500 && income <=1000){
            tax = income - (income*5)/100;
            System.out.println("Tax: "+tax);
        }
        else if(income >=1001 && income <= 1500){
            tax = income - (income*10)/100;
            System.out.println("Tax: "+tax);
        }
        else{
            tax = income - (income*15)/100;
            System.out.println("Tax: "+tax);
        }

        sc.close();
    }
}

