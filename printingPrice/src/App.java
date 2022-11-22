import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numOfCpoies;
        double pricePerCopy;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of copies to be printed : ");
        numOfCpoies = sc.nextInt();

        if(numOfCpoies>=0 && numOfCpoies<=99){
            pricePerCopy = 2.00;
            System.out.println("Price per copy : php "+pricePerCopy+" per copy");
            System.out.println("Total cost is : php "+numOfCpoies*pricePerCopy);
        }

        else if(numOfCpoies>=100 && numOfCpoies<=499){
            pricePerCopy = 1.75;
            System.out.println("Price per copy : php "+pricePerCopy+" per copy");
            System.out.println("Total cost is : php "+numOfCpoies*pricePerCopy);
        }

        else if (numOfCpoies>=500 && numOfCpoies<=749){
            pricePerCopy = 1.50;
            System.out.println("Price per copy : php "+pricePerCopy+" per copy");
            System.out.println("Total cost is : php "+numOfCpoies*pricePerCopy);
        }

        else if (numOfCpoies>=750 && numOfCpoies<=1000){
            pricePerCopy = 1.00;
            System.out.println("Price per copy : php "+pricePerCopy+" per copy");
            System.out.println("Total cost is : php "+numOfCpoies*pricePerCopy);
        }

        else{
            pricePerCopy = 0.75;
            System.out.println("Price per copy : php "+pricePerCopy+" per copy");
            System.out.println("Total cost is : php "+numOfCpoies*pricePerCopy);
        }

        sc.close();
    }
}
