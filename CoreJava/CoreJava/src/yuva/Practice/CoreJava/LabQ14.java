package yuva.Practice.CoreJava;

import java.util.Scanner;
class LabQ14
{
public static void main(String []as)
{
System.out.println("enter two numbers..:");
Scanner sc =new  Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();

if(a>b)
System.out.println(a+" is Greater than "+b);
else
System.out.println(b+" is Greater than "+a);
}
}