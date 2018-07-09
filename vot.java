import java.util.*;
class Age
{
public static void main(String args[])
{
int b,c;
Scanner a=new Scanner(System.in);
System.out.println("enter the age");
b=a.nextInt();
if(b>19)
{
System.out.println("eligible for voting");
}
else
{
System.out.println("not eligible for voting"); 
}
}
}