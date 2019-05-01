package yuva.Practice.CoreJava;
import java.util.Scanner;
class SumfNnaturalnum
{
public static void main(String []as)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter N Value.");
int n=sc.nextInt();
int sum=0;
for(int i=0;i<=n;i++)
{
sum=sum+i;
}
System.out.println("Sum of first N numbers is: "+sum);
}
}
