// Reverse of given number
package yuva.Practice.CoreJava;
import java.util.Scanner;
class LabQ50
{
public static void main(String []as)
{
System.out.println("Enter N value:");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int rev=0;
while(n>0)
{
int c=n%10;
rev=rev*10+c;
n=n/10;

}
System.out.println("\t Reverse of given num is: "+rev);
}
}
