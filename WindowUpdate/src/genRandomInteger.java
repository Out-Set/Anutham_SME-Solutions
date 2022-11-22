import java.util.Random;

public class genRandomInteger {
    public static void main(String[] args) {
        // what is our range?
        for(int i=0; i<=100; i++){
            int max = 1000;
            int min = 0;
            // create instance of Random class
            Random randomNum = new Random();
            int showMe = min + randomNum.nextInt(max);
            System.out.println(showMe); 
        }   
    }
}
