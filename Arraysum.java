package arraysum;
//addition using array
import java.util.*;
public class Main 
{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[100];
		int i,j,n,total=0;
		System.out.println("enter any 5 numbers");
		Scanner sc=new Scanner(System.in);
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
	
		for(i=0;i<5;i++)
		{
		total=total+a[i];	
		}
		System.out.println("total is"+total);

	}

}
