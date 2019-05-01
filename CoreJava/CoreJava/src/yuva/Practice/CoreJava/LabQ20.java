
package yuva.Practice.CoreJava;
import java.util.Scanner;
class LabQ20
{
public static void main(String []ade)
{
System.out.println("Enter Character..:");
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
if(ch>=97&&ch<=122)
System.out.println(ch+" is Lower case Alphabet ");
else
System.out.println("  Not a Lower case Alphabet  ");
}
}