public class stringTraverse {
    public static void main(String[] args) {
        
        String string = "word";

        // initialize an empty string, for traversal
        String character = "";

        for(int i=0; i<string.length(); i++) {
            character = character + string.charAt(i);

            // everytime it traverse a char and prints 
            System.out.println(character);
        }

        // fianlly traversed string
        System.out.println("fianlly traversed string: "+character);
    }
}



