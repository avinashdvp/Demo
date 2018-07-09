//average
#include<stdio.h>
void main()
{
	int a[100], b,n, j, total=0, average, i;
	puts("enter the no of subjects");
	scanf("%d",&n);
	puts("enter the marks");
	for(i=0;i<n;i++)
	{
    scanf("%d",&a[i]);
	}
	for(i=0;i<n;i++)
	{
		total=total+a[i];
	}
	average=total/n;
	printf("average is %d\n",average);
}
