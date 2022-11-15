import java.util.Scanner;

public class occurances {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        String str = "";

        System.out.println("Enter a sentence: ");
        str = sc.nextLine();

        int count = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == 'a'){
                count++;
            }
        }

        // print the occurance of a
        System.out.println("Occurence of a is: " + count);

        sc.close();
    }
}

