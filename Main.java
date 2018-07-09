package table1;
//five table
import java.util.*;
class A
{
	int j=1;
	int i;
	int n;
	int x;
	
	void m1(int a,int b)
	{
		n=a;
	    x=b+1;
	}
    void m()
    {
    	i=n*j;
    	System.out.println("5*"+j+"="+i);
    	j++;
    	
    	if(j==x)
    	{
    		return;
    	}
    	m();
    }
	
}
public class Main {

	public static void main(String[] args) {
		int b;
		int n;
		A a=new A();
		System.out.println("enter any table and upto");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		b=s.nextInt();
		a.m1(n,b);
		a.m();
		
		}

}
