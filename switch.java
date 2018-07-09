import java.util.*;
class Switch
{
public static void main(String args[])
{
int a,b,c,d,e;
Scanner s=new Scanner(System.in);
System.out.println("enter any number");
a=s.nextInt();
switch(a)
{
case 1:
System.out.println("1");
break;
case 2:
System.out.println("2");
break;
case 3:
System.out.println("3");
break;
default:
System.out.println("entered value is more than 3");
}
}
}