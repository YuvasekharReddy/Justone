package yuva.Practice.CoreJava;
import java.util.Scanner;
class Table
{
public static void main(String []as)
{
System.out.println("Enter n value :");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i=1;
while(i<=10)
{
System.out.println(n+" * "+i+" ="+(n*i));
i++;
}
}
}