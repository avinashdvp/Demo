#include<stdio.h>
void main()
{
	int a[100],b[100],n,i,j;
	puts("enter the number of students");
	scanf("%d",&n);
	puts("enter rollnos");
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
		
		puts("enter rollnos\n");
	}
	puts("enter  marks");
	
	for(j=0;j<n;j++)
	{
		scanf("%d",&b[j]);
		
		puts("enter marks\n");

	}
	for(i=0;i<n;i++)
	{
		printf(" %d",a[i]);
	}
	for(j=0;j<n;j++)
	{
	printf(" %d",b[j]);
		
		
	}
}

