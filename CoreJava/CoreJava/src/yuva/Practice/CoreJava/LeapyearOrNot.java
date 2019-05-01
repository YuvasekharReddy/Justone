package yuva.Practice.CoreJava;
import java.util.Scanner;
class LeapyearOrNot
{
public static void main(String []ade)
{
System.out.println("Enter year:");
Scanner sc =new  Scanner(System.in);
int year=sc.nextInt();
if(year%4==0)
{
System.out.println(year+" is a leap year....");
}
else
System.out.println(year+" is a Non-leap year....");
}
}
