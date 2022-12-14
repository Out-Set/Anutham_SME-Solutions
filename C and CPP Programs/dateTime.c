#include <stdio.h>

int main(int argv, char** arv) {
    int month[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    char* day[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};   
    int d, m, y, i; 

    printf("Input dd mm yyyy: ");
    scanf("%d %d %d",  &d, &m, &y);

    // correction for leap year
    if (y % 4 == 0 && (y % 100 != 0 || y % 400 == 0))
        month[1] = 29;

    if (((y < 1600) && (y > 2600)) || m < 1 || m > 12 || d < 1 || d > month[m - 1]) {
        printf("invalid date\n");
        return 1;
    }

    for (i = 1900; i < y; i++)
        if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0))
            d += 366;
        else
            d += 365;

    for (i = 0; i < m - 1; i++) 
        d += month[i];

    printf("%s\n", day[d % 7]);

    return 0;
}

