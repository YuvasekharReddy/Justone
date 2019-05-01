package yuva.Practice.CoreJava;

import java.util.Scanner;
class LabQ22
{
public static void main(String []ade)
{
System.out.println("Enter Character..:");
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
if(ch>=65&&ch<=90)
System.out.println("a)  "+ch+" is Upper case Alphabet");
else
if(ch>=97&&ch<=122)
System.out.println("b)  "+ch+" is Lower case Alphabet ");
else
if(ch>='0'&&ch<='9')
System.out.println("c)  "+ch+"  is a digit   ");
else
System.out.println("d)   "+ch+" Special Symbol   ");
}
}