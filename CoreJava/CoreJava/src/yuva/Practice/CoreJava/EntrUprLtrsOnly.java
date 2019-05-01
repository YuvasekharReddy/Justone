package yuva.Practice.CoreJava;

import java.util.Scanner;
class EntrUprLtrsOnly
{
public static void main(String []ade)
{
System.out.println("Enter your Character:");
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
if(ch>=65&&ch<=90)
{
int a=ch;
int b=a+32;
char c=(char)b;
System.out.println(c);
}
else
System.out.println("U Entered upper case letter only");
}
}