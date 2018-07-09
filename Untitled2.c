#include<stdio.h>
void main()
{
int a[10],b[10],i;
puts("enter values of first matrix");
for(i=0;i<10;i++)
{
	scanf("%d",&a[i]);
} 
puts("enter the values of second matrix");
for(i=0;i<10;i++)
{
	scanf("%d",&b[i]);
} 
for(i=0;i<10;i++)
{
	printf("%d",b[i]);
}
}
