package age;
class A
{
   static int age;
  void m(int a)
  {
	age=a;
	System.out.print(age);
  }
  void m1()
  {

	  System.out.print(age);
	  
	
  }
  void m2()
  {
	  
	  System.out.print(age);
  }
  
 
  
}

class Main 
{
public static void main(String args[])
{
	A a=new A();
	A a1=new A();
	a.m(100);
	a1.m1();
	
	
	
}
	
}
