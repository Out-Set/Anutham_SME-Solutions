#include<stdio.h>
int main(){
    int numOfCpoies;
    float pricePerCopy;

    printf("Enter the number of copies to be printed : ");
    scanf("%d",&numOfCpoies);

    if(numOfCpoies>=0 && numOfCpoies<=99){
        pricePerCopy = 2.00;
        printf("Price per copy : %f")
    }
    else if(numOfCpoies>=100 && numOfCpoies<=499){
        pricePerCopy = 1.75;
    }
    else if (numOfCpoies>=500 && numOfCpoies<=749){}
    {
        pricePerCopy = 1.50;
    }
    else if (numOfCpoies>=750 && numOfCpoies<=1000)
    {
        pricePerCopy = 1.00;
    }
    else{
        pricePerCopy = 0.75;
    }



}