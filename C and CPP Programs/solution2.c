#include<stdio.h>
int main()
{

    int wage_rate, days, salary;

    // taking input, wage rate per day
    printf("Enter the wage rate per day(in $): ");
    scanf("%d",&wage_rate);

    // taking input, number of days
    printf("Number of days worked: ");
    scanf("%d", &days);

    // calculating salary
    salary = wage_rate*days;

    // output the salary
    printf("Total salary: %d$\n",salary);

    return 0;
}

