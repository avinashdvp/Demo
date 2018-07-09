#include<stdio.h>
void main()
{
	int a,b;
	puts("enter any two numbers");
	scanf("%d %d",&a,&b);
	if(a<b)
	{
		puts("b is grater");
	}
	else
	if(a>b)
	{
		puts("a is grater");
	}
	else
	puts("they are equal");
}
