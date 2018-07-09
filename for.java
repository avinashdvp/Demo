import java.util.*;
class For
{
public static void main(String args[])
{
int a,b,i;
Scanner r=new Scanner(System.in);
System.out.println("enter the required table");
a=r.nextInt();
for(i=0;i<10;i++)
{
b=a*i;
System.out.println("5*"+i"="+b);
}
}
}