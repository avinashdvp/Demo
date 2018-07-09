#include<stdio.h>
void main()
{
    char ch;
	int i=0;
	puts("enter any character to print it twice\n");
	scanf("%c",&ch);
	while(i<2)
	{
		printf("%c\n",ch);
		i++;
	}
	
}
