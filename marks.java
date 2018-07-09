import java.util.*;
class Student
{
int rollno;
String name;
int marks;
}
class Main
{
public static void main(String args[])
{
Student s1;
Student s2;
s1=new Student();
s2=new Student();
s1.rollno=10;
s1.name="mango";
s1.marks=999;
s2.rollno=20;
s2.name="apple";
s2.marks=888;
System.out.println(s1.rollno);
System.out.println(s1.name);
System.out.println(s1.marks);
System.out.println(s2.rollno);
System.out.println(s2.name);
System.out.println(s2.marks);
}
}




