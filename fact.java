import java.util.*;
class Fact
{
	static int i;
	int j=i-1;
	int k;
	
	void factorial(int a)
	{
		i=i*j;
		j=j-1;
		if(j==0)
		{
			System.out.println(i);
			return;
		}
		factorial(a);
	}
}

class Main
{
	public static void main(String args[])
{
int b;		
Fact f =new Fact();
System.out.println("enter any number");
Scanner s=new Scanner(System.in);
b=s.nextInt();
Fact.i=b;
f.factorial(b);
}
}