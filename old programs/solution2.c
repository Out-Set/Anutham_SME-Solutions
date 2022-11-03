#include<stdio.h>
int main()
{

    int wage_rate, days, salary;

    printf("Enter the wage rate per day(in $): ");
    scanf("%d",&wage_rate);

    printf("Number of days worked: ");
    scanf("%d", &days);

    salary = wage_rate*days;

    printf("Total salary: %d$\n",salary);

    return 0;
}