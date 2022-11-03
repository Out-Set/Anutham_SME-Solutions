class Chaining {
    public static String chaining1(String msg){
        // Here will use the trim, replace, and substring methods, in this order.
          
        //Trim the leading and trailing whitespace.
        String output = msg.trim();

        //Replace the substring First Mate with Quartermaster.
        output = output.replace("First Mate", "Quartermaster");

        //Remove "and a pistol!"
        output = output.substring(0, output.indexOf(" and a pistol"));

        //Add a period at the end of the sentence.
        return output + ".";
    }
     
    public static String chaining2(String msg) {
        // To perform the above operation. We will use the trim, replace, and substring methods, in this order.
          
        //Trim the leading and trailing whitespace.
        //Replace the substring First Mate with Quartermaster.
        //Remove "and a pistol!"
        //Add a period at the end of the sentence.
        return msg.trim().replace("First Mate", "Quartermaster").substring(0, (msg.trim().replace("First Mate", "Quartermaster")).indexOf(" and a pistol")) + ".";
    }
       
    public static void main(String[] args) {
        String msg1 = "  Maroon the First Mate with a flagon of water and a pistol!  ";

        String msg2 = chaining1(msg1);
        System.out.println("Calling chaining1() made the string:\n\"" + msg2 + "\"");
          
        msg2 = chaining2(msg1);
        System.out.println("Calling chaining1() made the string:\n\"" + msg2 + "\"");
    }
}

