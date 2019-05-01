package yuva.Practice.CoreJava;
import java.util.Scanner;
class LabQ39
{
public static void main(String []as)
{
System .out.println("Enter Num to find factorial:");

int fact=1;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println(fact);
}
}

