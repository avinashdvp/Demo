import java.util.*;
class Tables
{
public static void main(String args[])
{
int a,b,i;
int arr[]=new int[11];
Scanner s=new Scanner(System.in);
System.out.println("enter the required table ");
a=s.nextInt();
for(i=1;i<11;i++)
{
arr[i]=a*i;
System.out.println(a+"*"+i+"="+arr[i]);
}
}
}