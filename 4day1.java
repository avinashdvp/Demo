import java.util.*;
class Employee
{
int id;
String name;
int salary;
}
class Main
{
//entry point
public static void main(String args[])
{
//varialble declaration
Employee e1;
Employee e2;
//creating new objects and initalising variables(of employee data type)
e1=new Employee();
e2=new Employee();
//printing addresses of created objects and printing default values of employee details 
System.out.println(" e1 address " + e1);
System.out.println("e2 address  " +e2);
System.out.println("default value of first employee id is " + e1.id);
System.out.println("first employee name is " + e1.name);
System.out.println("default value of first employee salary is "+ e1.salary);
System.out.println("default value of second employee id is " + e2.id);
System.out.println("second employee name is " + e2.name);
System.out.println("default value of employee2 salary is "+ e2.salary);
}
}


