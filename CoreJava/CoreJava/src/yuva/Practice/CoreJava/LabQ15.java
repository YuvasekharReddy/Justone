package yuva.Practice.CoreJava;

import java.util.Scanner;
class LabQ15
{
public static void main(String []as)
{
System.out.println("enter two numbers..:");
Scanner sc =new  Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();

if(a<b)
System.out.println(a+" is Lesser than "+b);
else
System.out.println(b+" is Lesser than "+a);
}
}