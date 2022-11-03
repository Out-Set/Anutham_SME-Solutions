public class App {
    public static void main(String[] args) {
     
        int[] array = new int[]{2, 5, 10, 8, 18, 24, 3, 48, 30, 9, 12};

        for(int i=0; i<array.length; i++){

            // if number is divisible by both 4 and 6
            if((array[i]%4 == 0) && (array[i]%6 ==0)){
                System.out.println("Four Six");
            }
            //if number is divisible by both 4 only
            else if(array[i]%4 == 0){
                System.out.println("Four");
            }
            //if number is divisible by both 6only
            else if(array[i]%6 ==0){
                System.out.println("Six ");
            }
            //if number is not divisible by 4 or 6
            else{
                System.out.println(array[i]);
            }
        }
    }
}

