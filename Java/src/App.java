public class App {
    public static void main(String[] args) {
        
        // Calling the method: FortyPercentOrLess()
        boolean result = RandomNumberGenerator.FortyPercentOrLess();
        System.out.println(result);
    }
}

class RandomNumberGenerator {
    public static boolean FortyPercentOrLess(){

        int min = 1;  
        int max = 10;  

        // generating Random Number from 1 to 10
        double RandomNumber = Math.random()*(max-min+1)+min;  

        // printing the randomaly generated number
        System.out.println("RandomalyGenerated Number is: "+RandomNumber);

        // checking if it is less than oe equal to 4.
        if(RandomNumber <= 4){
            return true;
        }

        return false;
    }
}

