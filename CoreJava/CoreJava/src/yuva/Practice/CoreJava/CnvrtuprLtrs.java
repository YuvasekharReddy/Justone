package yuva.Practice.CoreJava;
import java.util.Scanner;
class CnvrtuprLtrs
{
public static void main(String []ade)
{
System.out.println("Enter your Character :");
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
if(ch>=97&&ch<=122)
{
int a=ch;
int b=a-32;
char c=(char)b;
System.out.println(c);
}
else
System.out.println("U Entered upper case letter only");
}
}