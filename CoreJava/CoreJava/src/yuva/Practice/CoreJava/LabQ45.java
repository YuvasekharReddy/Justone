// Display no.of digits available
package yuva.Practice.CoreJava;
import java.util.Scanner;
class LabQ45
{
public static void main(String []as)
{
System.out.println("Enter N value:");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int count=0,i=0;
while(i<n)
{
int d=n%10;
count++;
n=n/10;
}
System.out.println("\tNumber of digits are:"+count);
}
}
