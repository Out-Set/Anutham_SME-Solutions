#include <stdio.h>  
int main() {     
    printf("Enter number of people: ");     
    int n;     
    scanf("%d",&n);          
    if(n<20)     
        n=20;          
    float sum=0;              
    printf("Enter 1 to travel with bus A\n");         
    printf("Enter 2 to travel with bus B\n");         
    printf("Enter 3 to travel with bus C\n");                  
    int x;         
    scanf("%d",&x);                  
    
    printf("Enter distance traveled in (km): ");         
    float d;         
    scanf("%f",&d);                  
    if(x==1)         
        sum=d*3*n;         
    else if(x==2)         
        sum=d*4.5*n;         
    else if(x==3)         
        sum=d*6.0*n;                  
    printf("\nThe total cost of the trip is: %f$",sum);
}