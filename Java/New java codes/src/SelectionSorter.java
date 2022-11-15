import java.util.Arrays;  
public class SelectionSorter { 

    int[] a;      
    public SelectionSorter(int[] anArray) {         
        a = anArray;      
    }     

    public void sort() {           
        for (int i = a.length - 1; i >= 0; i--) {             
            int maxPos = maximumPosition(i);             
            swap(maxPos, i);         
        }      
    } 

    private int maximumPosition(int to) {          
        int index = 0;         
        for (int i = 0; i <= to; i++) {             
            if (a[index] < a[i]) index = i;         
        }         
        return index;      
    } 

    private void swap(int i, int j) {         
        int temp = a[i];         
        a[i] = a[j];         
        a[j] = temp;     
    }   

    public static int[] check(int[] values) {         
        SelectionSorter sorter = new SelectionSorter(values);         
        sorter.sort();         
        return values;     
    }  

    public static void main(String[] args) {          
        int[] values = {34, -12, 45, 23, 12, 34, -45, -56, 0, 67, -90};         
        System.out.println(Arrays.toString(check(values)));      
    } 
} 
