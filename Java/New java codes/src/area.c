#include<stdio.h>

int main()
{
    // initializing variables r, a, b, h as float
    float r, a, b, h;

    // taking inputs for r, a, b, h one by one
    printf("What's your value of r: ");
    scanf("%f", &r);

    printf("What's your value of a: ");
    scanf("%f", &a);

    printf("What's your value of b: ");
    scanf("%f", &b);

    printf("What's your value of h: ");
    scanf("%f", &h);

    // calculating areas
    float triangle_area = (b*h)/2;
    float circle_area = (float)(3.14*r*r);
    float rectangle_area = b*h;
    float eclipse_area = (float)3.14*a*b;
    float trapezoid_area = ((a+b)*h)/2;

    // printing areas
    printf("\nYour triangle has area = %f", triangle_area);
    printf("\nYour circle has area = %f", circle_area);
    printf("\nYour rectangle has area = %f", rectangle_area);
    printf("\nYour eclipse has area = %f", eclipse_area);
    printf("\nYour trapezoid has area = %f", trapezoid_area);

    return 0;
} 

