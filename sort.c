//enter any 5 numbers to sort them
#include<stdio.h>
void main()
{
	int a[100],b,n,j,i,temp;
	puts("enter numbers to be sorted");
	for(i=0;i<5;i++)
		{
		scanf("%d",&a[i]);
		}
		for(j=0;j<5;j++)
		{
		for(i=j;i<5;i++)
		{
			if(a[i]>a[i+1])
			{
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
			if(i==4)
			{
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				
		printf("%d",a[j]);
			}
		}
	}
}


