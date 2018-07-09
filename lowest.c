//lowest number
#include<stdio.h>
void main()
{
	int a[100],n,i,j,temp;
	puts("how many numbers ?");
	scanf("%d",&n);
	printf ("enter the numbers");
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	for(i=0;i<n;i++)
	{
		if(a[i]>a[i+1])
		{
			temp=a[i];
			a[i]=a[i+1];
			
			a[i+1]=temp;
		}
		if(i==n-1)
		{
		printf("lowest number is %d",a[0]);
		}
	}
	
}
