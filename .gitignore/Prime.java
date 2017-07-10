import java.io.*;
import java.util.*;
public class Prime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,i,count=0;
a=sc.nextInt();
for(i=2i<a;i++)
{
if((a%i)==0)
{
count++;
}
}
if(count==0)
{
System.out.println("Prime Number");
}
else
{
System.out.println("Not a Prime Number");
}
}
}
