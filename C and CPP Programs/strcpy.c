#include <stdio.h>
#include <stdlib.h>

char* Kstrcpy(char* destination, const char* source);
void Kstrlen(char* str);
void Average_sum(int arr[], int size);

int main(){
    char source[20];
    //taking input string
    printf("Input name -> ");
    gets(source);
    char destination[100];

    int arr[5];
    //taking input of numbers
    for(int i=1; i<=5; i++)
    {
        printf("Input number %d -> ", i);
        scanf("%d", &arr[i]);
    }

    char *destination_ptr = Kstrcpy(destination, source);
    
    printf("\n");
    printf("Output \n");
    printf("Copy of your name %s\n",destination);
   
    Kstrlen(destination);

    Average_sum(arr, 5);
}

// Kstrcpy works like strcpy
char* Kstrcpy(char* destination, const char* source)
{
    if (destination == NULL)
    {
        return NULL;
    }

    int i = 0;
    
    while (source[i] != '\0')
    {
        destination[i] = source[i];
        i++;
    }
    destination[i] = '\0';

    return destination;
}

// calculate length of string
void Kstrlen(char* str)
{
    int n = sizeof(str) / sizeof(char);
    printf("Length of your name %d\n" ,n);
}


//calculate sum and average of inputed numbers
void Average_sum(int arr[], int size)
{
    int sum = 0;
    for(int i=1; i<=size; i++)
    {
        sum = sum + arr[i];
    }

    int average = sum/size;

    printf("The sum of your numbes %d\n", sum);
    printf("The average of your numbes %d\n", average);
}

