#include<stdio.h> 
#include<stdlib.h>  

int * findEven(int arr[], int size){          
    // creating a pointer     
    int *ptr,i;          
    // allocating the memory dynamically     
    ptr = (int*) malloc(size * sizeof(int));          
    int j=0;          
    // iterate over the array     
    for(i=0; i<size; i++){                  
        // checking whether the ith element is even         
        if(arr[i]%2 == 0){                          
            // if yes then store ith element to the ptr             
            ptr[j++] = arr[i];         
        }     
    }          
        // finally, store -1 at last     
        ptr[j] = -1;          
        // return ptr     
        return ptr; 
}  
    
// main Method
int main (){          
    // array size     
    int n = 9;     
    int i;         

    // declaring array of positive integers     
    int arr[] = {1,2,3,4,5,6,7,8,9}; 

    // printing the original array     
    printf("Original array: \n");     
    for(i=0; i<n; i++)     {         
        printf("%d ",arr[i]);     
    }     
    // declaring a pointer to an int     
    int *p;     i=0;    

    // make a function call find the even numbers     
    p = findEven(arr, n);   

    // print array that contains only even numbers      
    printf("\n\nArray containing only even numbers: \n");     
    for(i=0; i<n; i++)     {         
        // print till 0(element just after -1) appears         
        if(p[i] != 0){             
            printf("%d ",p[i]);         
        }
        else {             
            break;         
        }     
    }

    // changing the line  
    printf("\n");   
    return 0; 
}

