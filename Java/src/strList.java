// import ArrayList
import java.util.ArrayList;

public class strList {
    public static void main(String[] args) {
        
        ArrayList<String> list=new ArrayList<>();

        // add maple
        list.add("maple");

        // add oak
        list.add("oak");

        // add elm at index 1, now oak will shift to position 2
        list.add(1, "elm");

        // remove maple, at index 0
        list.remove(0);

        // add palm, at index 0
        list.add(0, "palm");


        // print the list
        for (String iterable_element : list) {
            System.out.println(iterable_element);
        }
    }
}


