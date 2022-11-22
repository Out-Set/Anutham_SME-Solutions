public class genPow {
    public static void main(String[] args) {

        // Outer for loop
        for(int x=1; x<=4; x++){

            // Inner for loop
            for(int n=1; n<=10; n++){
                System.out.println(Math.pow(n, x));
            }
            System.out.println();
        }
    }
}

