package yuva.Practice.CoreJava;
import java.util.Scanner;
class LabQ6
{
public static void main(String []as)
{
Scanner sc=new Scanner(System.in);
System.out.println("\tEnter two values to swap");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("\ta = "+a+"\tb = "+b);
System.out.println("\t After Swap");
a=a+b;
b=a-b;
a=a-b;

System.out.println("\ta = "+a+"\tb = "+b);
}
}
