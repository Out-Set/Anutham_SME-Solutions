class ListOverFlowException extends Exception{
    public ListOverFlowException(String str){
        super(str);
    }
}
class NoSuchElementException extends Exception{
    public NoSuchElementException(String str){
        super(str);
    }
}

public class FixedArrayList<E> implements MyList<E>{
    private E Array[];
    private int total;
    private int MAX;
    
    public FixedArrayList(int N){
        MAX=N;
        Array=(E[])new Object[MAX];
        total=0;
    }
    public int getSize(){
        return total;
    }

    public void insert(E data)throws ListOverFlowException{
        if(total<MAX){
            Array[total]=data;
            total++;
        }    
    }

    public E getElement(E data)throws NoSuchElementException{
        for(int i=0;i<total;i++){
            if(Array[i]==data)
                return data;
        }
        return null;
    }

    public int search(E data){
        for(int i=0;i<total;i++){
            if(Array[i]==data)
                return i;
        }
        return -1;
    }

    public boolean delete(E data){
        int index=search(data);
        if(index==-1)
            return false;
        
        for(int i=index;i<total-1;i++)
            Array[i]=Array[i+1];
        total--;
        return true;
    }
}

