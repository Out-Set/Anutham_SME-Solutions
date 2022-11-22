public interface MyList<E>{
    public int getSize();//returns number of items in the list
    public void insert(E data)throws ListOverFlowException;
    public E getElement(E data)throws NoSuchElementException;
    public boolean delete(E data);//return false if the data is not deleted in the list.
    public int search(E data);//return index of data else -1 is return
}


