import java.util.*;
class Month
{
public static void main(String args[])
{
int c;
Scanner s=new Scanner(System.in);
System.out.println("enter the month number");
c=s.nextInt();
if(c<5)
{
System.out.println("summer");
}
else
if(c>4&&c<9)
{
System.out.println("winter");
}
else 
if(c<8&&c>13)
{
System.out.println("rainy");
}
else
{
System.out.println("you stupid fellow enter valid month");
}
}
}

