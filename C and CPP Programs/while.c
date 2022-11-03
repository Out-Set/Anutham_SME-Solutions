#include <stdio.h>
#include<stdlib.h>

int main()
{

    //file pointer
    FILE *fp;

    //open file for writing
    fp = fopen("fibonacciout.txt", "w");

    // declration of variable data type
    int i, n, first = 0, second = 1, nextTerm;

    //input value of n
    printf("Enter the value of n: ");

    scanf("%d", &n);

    //loop for n times

    for(i = 1; i <= n; i++){

        //printing number to the file "fibonacciout.txt"
        fprintf(fp, "%d, ", first);

        //find the next term
        nextTerm = first + second;
        first = second;
        second = nextTerm;
    }

    printf("data has been successfully written into the file.\n");
    printf("\n");

    return 0;
}

