public class OddIntegers {
    public static void main(String[] args) {
        
        System.out.println("Printing odd integeres between 3000 and 3999: ");

        // initializing a for loop between 3000 and 3999
        for(int i=3000; i<=3999; i++) {

            // Checking for odd integers
            if(i%2 != 0) {
                System.out.print(i+" ");
            }
        }

        System.out.println();
    }
}

