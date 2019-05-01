// Check the given num is palindrome or not 
package yuva.Practice.CoreJava;
import java.util.Scanner;
class LabQ51
{
public static void main(String []as)
{
System.out.println("Enter N value:");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int temp=n;
int rev=0;
while(n>0)
{
int c=n%10;
rev=rev*10+c;
n=n/10;
}
if(rev==temp){
System.out.println("\tgiven num is palindrome: "+rev);
}
else
System.out.println("\t given num is not a palindrome:");
}
}