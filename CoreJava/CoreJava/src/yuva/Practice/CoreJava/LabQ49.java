// sum of cubes of individual digits
package yuva.Practice.CoreJava;
import java.util.Scanner;
class LabQ49
{
public static void main(String []as)
{
System.out.println("Enter N value:");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i=0,cube=0;
while(i<=n)
{
int c=n%10;
cube=cube+c*c*c;
n=n/10;
i++;
}
System.out.println("\t Cubes of individual digits is: "+cube);
}
}
