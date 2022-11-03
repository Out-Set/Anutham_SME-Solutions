#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int main()
{
   float x,sum=0,dev;
   int n,i;
   FILE *fp=fopen("powerseriesout.txt","w");
   printf("Value for x: ");
   scanf("%f",&x);
   printf("Degree of n: ");
   scanf("%d",&n);
   for(i=1;i<n+1;i++)
   {
       sum+=((pow(-1,i+1)*pow(x,i))/i);
   }
   fprintf(fp,"x =%f\n",x);
   fprintf(fp,"n =%d\n",n);
   fprintf(fp,"Approximate Value = %f\n",sum);
   fprintf(fp,"Actual Value = %f\n",log(1+x));
   dev=sum-log(1+x);
   dev/=log(1+x);
   dev*=100;
   fprintf(fp,"Relative Error = %f percent",dev);
}

