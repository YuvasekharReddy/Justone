package yuva.Practice.CoreJava;
import java.util.Scanner;
class LabQ40
{
public static void main(String []as)
{
System.out.println("Enter Number  to check  :");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int c=0;
for(int i=1;i<n/2;i++)
{
if(n%2==0)
{
c=1;
break;
}
}
if(c==1)
System.out.println("GIven Number is not a prime number:");
else
System.out.println("GIven Number is a prime number:");
}
}

