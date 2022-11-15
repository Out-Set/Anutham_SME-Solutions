import java.util.Scanner;

public class decToHex {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Decimal number: ");
        int decNumber = sc.nextInt();

        // calling decToHex() method, which takes a decimal number
        DecimalToHexadecimal.decToHex(decNumber);

        sc.close();
    }
}

class DecimalToHexadecimal {
    static void decToHex(int decNumber){
        String hexDecNum = "";

        while(decNumber != 0){
            int rem = decNumber%16;

            if(rem >= 0 && rem <= 9){
                hexDecNum += rem;
            }

            if(rem >= 10 && rem <= 15){
                // ASCII: A To Z = 65 to 91
                hexDecNum += (char)(55 + rem);
            }
            
            decNumber = decNumber/16;
        }

        // the number we got, it has to be reversed for correct output.
        // firstly convert it into string, so that it can be reversed easily through reversed() method.
        StringBuilder sb = new StringBuilder(hexDecNum);
        System.out.println("Hexa-Decimal number: "+sb.reverse());
    }
}



