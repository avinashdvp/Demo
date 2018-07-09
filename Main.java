package abc;
class A
{
	static void m1()
	{
		System.out.println("from m1");
		B b=new B();
		b.m2();
		
	}
}
class B
{   
	void m2()
	{
	
		System.out.println("from m2");
	
	}
}

public class Main {

	public static void main(String[] args) 
	{
	
	A a=new A();	
	a.m1();

	}

}
