package yuva.Practice.CoreJava;
import java.util.Scanner;

class LabQ5
{
public static void main(String []sd)
{
System.out.println("enter numbers to swap:");
Scanner sc =new Scanner(System.in);
int a=sc.nextInt();

int b=sc.nextInt();


System.out.println("a=  "+a+"\tb= "+b);
int temp;
temp=a;
a=b;
b=temp;
System.out.println("After Swaaping :\n a= "+a+"  b=  "+b);
}
}