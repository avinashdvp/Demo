package assending;
//assending order
import java.util.Scanner;
class Main 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[]=new int[100];
		int i,j,n,total=0,temp;
		System.out.println("enter any 5 numbers");
		Scanner sc=new Scanner(System.in);
		for(i=0;i<5;i++)
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
				
		System.out.println(a[j]);
			}
		}
		}
		
}
}
