import java.util.*;
class Fact
{
	static int i;
	int j;
	int k;
	
	void factorial(int a)
	{
		i=i*j;
		j=j-1;
		if(j==0)
		{
			System.out.println(factorial of given number is" + i);
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
Fact.j=b-1;		
f.factorial(b);
}
}
