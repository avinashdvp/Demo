package table;

class Polygon
{
	void info()
	{
		System.out.println("closed container");
	}
}
class Square extends Polygon
{
	void area()
	{
		System.out.println("closed con");
	}
	int info(int a)
	{
		System.out.println("closed container");
		return 67;
	}
	
}
class Main
{
 public static void main(String args[])
 
 {
	 Square s=new Square();
	 s.info();
 }
}
 


