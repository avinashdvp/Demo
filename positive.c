#include<stdio.h>
void main()
{
	int a;
	puts("enter any number");
	scanf("%d",&a);
	
	if(a<0)
	{
		puts("negative");
	}
	else
	if(a>0)
	{
		puts("positive");
	}
	else
	{
	puts("zero");
	}
}
