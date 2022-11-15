#include<stdio.h>

int main(){

    // initializing array a and b with random values from  to 20.
    int a[6] = {12, 13, 11, 2, 20, 0};
    int b[6] = {16, 18, 4, 6, 7, 8};

    // Printing arrray a and b into rows
    printf("Array a and b into rows: \n");
    for(int i=0; i<6; i++){
        printf("%d\t", a[i]);
    }
    printf("\n\n");

    for(int i=0; i<6; i++){
        printf("%d\t", b[i]);
    }

    // Printing arrray a and b into columns
    printf("\n\nArray a and b into columns: \n");
    for(int i=0; i<6; i++){
        printf("%d\t", a[i]);
        printf("%d\n", b[i]);
    }
    
    return 0;
}

