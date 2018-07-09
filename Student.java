class Common
{
	String name;
	int age;

	void commonvals(String a,int b)
{
	name=a;
	age=b;
}

void dispcommon()
{
System.out.println(name);
 System.out.println(age);
}

}
	
 class Student extends Common
 {
	 int id;
	 int rollno;
	 void studinfo(String c,int d,int a,int b)
	 {
		commonvals(c,d);
		 id=a;
		 rollno=b;
	 }
	 void dispstud()
	 { 
		 dispcommon();
		 System.out.println(id);
		 System.out.println(rollno);
	 }
 }
 class Employee extends Common
 {
	 int sal;
	 int age;
	 void empinfo(String c,int d,int a,int b)
	 {
		 commonvals(c,d);
		 sal=a;
		 age=b;
	 }
	 void dispemp()
	 {
		 dispcommon();
		 System.out.println(sal);
		 System.out.println(age);
	 }
 }
 class Main
 {
	 public static void main(String args[])
	 {
		 Student s1=new Student();
		 Student s2=new Student();
		 Employee e2=new Employee();
		 Employee e1=new Employee();
		 s1.studinfo("venkat",123,10,50);
		 s2.studinfo("suresh",124,11,40);
		 e1.empinfo("ram",100,22,60);
		 e2.empinfo("raman",1000,23,70);
		 s1.dispstud();
		 e1.dispemp();
		 s2.dispstud();
		 e2.dispemp();
		 
	 }
 }
