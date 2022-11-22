public class TheMainList{
    public static void main(String args[])throws Exception{
        FixedArrayList<Integer> L=new FixedArrayList<Integer>(10);
        L.insert(78);
        L.insert(34);
        L.insert(63);
        L.insert(55);
        L.insert(96);
        L.insert(79);
        L.insert(123);
        L.insert(895);

        System.out.println("Size of the list: "+L.getSize());
        System.out.println("Get the element 96: "+L.getElement(96));
        System.out.println("Delete the element 55: "+L.delete(99));
        System.out.println("Delete the element 55: "+L.delete(55));
        System.out.println("Search 34: "+L.search(34));
        System.out.println("Search 34: "+L.search(60));
        
    }
}


