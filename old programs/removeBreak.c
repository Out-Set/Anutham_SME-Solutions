#include<stdio.h>
int main(){
    int a = 2;
    while (true)
    {
        if(a!=2){
            return false;
        }

        else{
            printf("S1");
            printf("S2");

            if(a==2){
                printf("S3");
                printf("S4");
            }
            else{
                ;;
            }

            if(a==2){
                continue;
            }
            else{
                printf("S5");
            }
        }
        a++;
    }
    
}