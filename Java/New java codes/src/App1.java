import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter 1 for Circle.\nEnter 2 for Rectangle.\nEnter your choice: ");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.print("Enter radius of circle: ");
                int radius = sc.nextInt();

                System.out.print("Enter cost of flooring per square foot: ");
                int cost_c = sc.nextInt();

                int totalCost_c = (int)(3.14*radius*radius*cost_c);

                System.out.println("Total cost of the flooring: "+totalCost_c);

                break;

            case 2:
                System.out.print("Enter length of rectangle: ");
                int len = sc.nextInt();

                System.out.print("Enter width of rectangle: ");
                int width = sc.nextInt();

                System.out.print("Enter cost of flooring per square foot: ");
                int cost_r = sc.nextInt();

                int totalCost_r = len*width*cost_r;

                System.out.println("Total cost of the flooring: "+totalCost_r);

                break;

            default: System.out.println("Enter correct choice!");
                break;
        }

        sc.close();
    }
}

