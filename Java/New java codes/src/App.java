import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        //  Calling fun
        fun(num);
    }
        
        static void fun(int n){
            if(n == 0){
                return;
            }

            // recursively prints the numbers
            System.out.println(n);
            fun(n-1);
        }
}

