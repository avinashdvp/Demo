#include<stdio.h>
void main()
{
	int i,j;
	puts("enter any number");
	scanf("%d",&i);
	if(i%5==0)
	{
		puts("divisible by 5");
	}
		else
		if(i%11==0)
		{
			puts("divisible by 11");
		}
		else
		{
		
		puts("not divisible by 5 or 11");
	}
	}

