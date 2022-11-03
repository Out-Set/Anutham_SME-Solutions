#include <stdio.h>
#include <string.h>
#include <stdlib.h>
int main() {

    char string[50],sub[50];
    int index,length,i=0,c=0;
    printf("Enter the sentence: ");
    scanf("%[^\n]s",string);
    char * token = strtok(string, ",");
    if(token==NULL){
       printf("Invalid input!!!");
    }
    else{
        while (token != NULL){
            if(i==1)
            index=atoi(token);
            else if (i==2)
            length = atoi(token);
            token = strtok(NULL, ",");
            i++;
        }
    while (c <= length) {
      sub[c] = string[index+c];
      c++;
   }
   sub[c] = '\0';
   printf("\n%s\n", sub);
   }
    return 0;
}