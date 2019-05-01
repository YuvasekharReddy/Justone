package yuva.Practice.CoreJava;
//*** Swap two numbers using bitwise operator**
import java.util.Scanner;
class LabQ7
{
public static void main(String []as)
{
System.out.println("Enter Two number to swap..");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("a = "+a+"\tb  = "+b);
a=b<<0;
b=a<<0;
System.out.println("After Swaping values are:");
System.out.println("a  = "+a+"\tb  = "+b);
}
}
