package inheritence;
class Similar
{
	String name;
	int age;
	void setval(String b,int c)
	{
	name=b;
	age=c;
	}
	void dispsim()
	{
		System.out.println(name);
		System.out.println(age);
	}
	
}
class Student extends Similar
{
 int rollno;
 int rank;
 void studinp(String a,int f,int c,int d)
 {
	setval(a,f);
	rollno=c;
	rank=d;
 }
 void dispstud()
 {
	 dispsim();
	 System.out.println(rollno);
	 System.out.println(rank);
 }
}
class Teacher extends Similar
{
	int id;
	int sal;
	void teachinp(String a,int b,int c,int d)
	{
		setval(a,b);
		id=c;
		sal=d;
	}
	void dispteach()
	{
		dispsim();
		System.out.println(id);
		System.out.println(sal);
		
	}
	
}


class Main {

	public static void main(String[] args) 
	{
		Student s1=new Student();
		Student s2=new Student();
		Teacher t1=new Teacher();
		Teacher t2=new Teacher();
		s1.studinp("raju",20,200,1);
		t1.teachinp("kiran",30,300,20);
		s1.dispstud();
		t1.dispteach();
	}

}
