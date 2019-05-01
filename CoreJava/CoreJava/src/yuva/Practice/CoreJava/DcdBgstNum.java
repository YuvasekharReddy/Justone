package yuva.Practice.CoreJava;

import java.util.Scanner;
class DcdBgstNum
{
public static void main(String []as)
{
System.out.println("enter two numbers..:");
Scanner sc =new  Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();

if(a<b&&a<c)
System.out.printf(a+" is lesser among%d %d  ",b,c);
else
if(b<a&&b<c)
System.out.printf(b+" is Lesser than among%d %d  ",a,c);
else
System.out.printf(c+" is Lesser than among%d %d  ",a,b);
}
}