package yuva.Practice.CoreJava;

import java.util.Scanner;
class LabQ18
{
public static void main(String []ad)
{
System.out.println("Enter Character:");
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int num=(int)ch;
if(ch>=0&&ch<65535)
System.out.println(ch+" is digit..:");
else
{
System.out.println();
System.out.println("is not a digit..:");
}
}
}