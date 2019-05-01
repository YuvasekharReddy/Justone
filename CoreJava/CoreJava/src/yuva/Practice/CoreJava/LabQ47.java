// sum of individual digits
package yuva.Practice.CoreJava;
import java.util.Scanner;
class LabQ47
{
public static void main(String []as)
{
System.out.println("Enter N value:");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

int i=0,sum=0;
while(i<n)
{
int d=n%10;
sum=sum+d;
n=n/10;
i++;
}
System.out.println("Sum of Individual Digits are:");
System.out.println("\n\tSum  = "+sum);
}
}
