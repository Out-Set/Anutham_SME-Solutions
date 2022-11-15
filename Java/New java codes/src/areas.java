import java.util.Scanner;

public class areas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("What's your value of r: ");
        float r = sc.nextInt();

        System.out.print("What's your value of a: ");
        float a = sc.nextInt();

        System.out.print("What's your value of b: ");
        float b = sc.nextInt();

        System.out.print("What's your value of h: ");
        float h = sc.nextInt();

        float triangle_area = (b*h)/2;
        float circle_area = (float)(3.14*r*r);
        float rectangle_area = b*h;
        float eclipse_area = (float)3.14*a*b;
        float trapezoid_area = ((a+b)*h)/2;

        System.out.println("Your triangle has area = "+triangle_area);
        System.out.println("Your circle has area = "+circle_area);
        System.out.println("Your rectangle has area = "+rectangle_area);
        System.out.println("Your eclipse has area = "+eclipse_area);
        System.out.println("Your trapezoid has area = "+trapezoid_area);

        sc.close();
    }
}
