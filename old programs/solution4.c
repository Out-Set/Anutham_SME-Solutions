#include<stdio.h>

int main(){
    int size;
    printf("Enter number of elements: ");
    scanf("%d",&size);
    int arr[size];

    // taking input for elements, form user 
    for(int i=0; i<size; i++){
        int num = 0;
        printf("Integer #%d: ", i+1);
        scanf("%d", &num);
        arr[i] = num;
    }


    // printing the elements in array
    printf("Elements of Array: ");
    for(int j=0; j<size; j++){
        printf("%d ", arr[j]);
    }

    printf("\n");
    
    // searching for an element
    int searchNum = 0;
    printf("Element to search in the array: ");
    scanf("%d",&searchNum);

    for(int k=0; k<size; k++){
        if(arr[k] == searchNum){
            printf("Found!");
        }
        else{
            printf("Not Found!");
        }
    }

    return 0;
}

