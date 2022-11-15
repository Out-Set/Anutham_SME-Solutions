import java.util.*;

public class arrList {
	public static void main(String args[]) {

		// create a ArrayList1 of String type and Initialize an ArrayList with add()
		ArrayList<String> arrayList1 = new ArrayList<String>();
			
        arrayList1.add("sun");
        arrayList1.add("bottle");
		// print ArrayList
		System.out.println("ArrayList1 : " + arrayList1);


        // create a ArrayList1 of String type
        ArrayList<String> arrayList2 = new ArrayList<String>();

        // Instantiating arrayList1, after Instantiation arrayList2 will have the same content.
        arrayList2 = arrayList1;
        System.out.println("ArrayList2 : " + arrayList2);
	}
}

