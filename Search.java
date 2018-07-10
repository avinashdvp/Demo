package search;


import java.util.Scanner;
class Main 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[]=new int[100],key,key1=0,count=0;
		int i,j,n,total=0,temp;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter key");
	    key=sc.nextInt();
	    System.out.println("enter any 5 numbers");
		for(i=0;i<4;i++)
		{
			a[i]=sc.nextInt();
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
				
			}
			
			
			for(i=0;i<5;i++)
			{
				if(key==a[i])
				{
					key1=a[i];
					count=i;
				}
				
			}
			
			
			
		}
		}
		if(key1==key)
		{
		
		System.out.println("key is\n"+key1);
		}
		else
			System.out.println("key not found");		
}
}