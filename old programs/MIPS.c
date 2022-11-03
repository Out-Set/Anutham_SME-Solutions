#include<stdio.h>
int main()
{
	int a = 8192, b = 65536, c = 17, x = 10, z;
	a |= b;
	z = 3*c + a*x;
	z -= a;
	
	return 0;
}


