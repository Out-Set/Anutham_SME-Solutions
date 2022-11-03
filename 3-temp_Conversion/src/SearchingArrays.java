import java.util.Scanner;

public class SearchingArrays {
    public static void main(String[] args) {
        int numEntered = 0;
        boolean valid = false;
        String message;

        Scanner scan = new Scanner(System.in);

        int[] validNumbers = {100, 1, 8, 65, 230, 85, 67, 14, 34, 51, 21, 27, 43, 952};

        do
        {
            System.out.println("Enter a number to see if it is valid or enter '9999' to end: ");
            numEntered = scan.nextInt();

            if(numEntered != 9999){
                for(int x=0; x<validNumbers.length; x++){
                    if(numEntered == validNumbers[x]){
                        valid = true;
                    }
                }

                message = numEntered + " is ";
                message += valid == true? "valid." : "invalid.";

                System.out.println(message);
                valid = false;
            }
        }
        while(numEntered != 9999);

        System.out.println("Done!");

        scan.close();
    }
}

