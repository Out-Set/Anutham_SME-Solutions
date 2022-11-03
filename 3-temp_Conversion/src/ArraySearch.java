import java.util.Scanner;

public class ArraySearch{
    public static void main(String[] args) {

        int numbers[] = new int[]{2, -9, 5, 12, -25, 22, 9, 8, 12};
        int key;
        boolean foundIt = false;

        Scanner input = new Scanner(System.in);
        System.out.println("=>> Array Search program ");
        System.out.print("Enter a number to continue or number 0 to exit: ");
        key = input.nextInt();

        do{

            for(int  i=0; i<numbers.length; i++){
                if(key != numbers[i]){
                    foundIt = false;
                }
                else{
                    foundIt = true;
                }
            }

            if(foundIt == true){
                System.out.println("Found it! :)");
            }
            else{
                System.out.println("Sorry not found it! :");
            }

            System.out.print("Enter a number to continue or number 0 to exit: ");
            key = input.nextInt();
            
        }while((key != 0));

        System.out.println("==> End of Search program! ");
        input.close();
    }
}

