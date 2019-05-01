package yuva.Practice.CoreJava;
//find Given num is Amstrong or not
import java.util.Scanner;
class LabQ52
{
public static void main(String []as)
{
System.out.println("Enter Number to Check:");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int temp=n;
int A,arm=0;
while(n>0)
{
A=n%10;
arm=arm+A*A*A;
n=n/10;
}
if(arm==temp)
System.out.println("\tGiven num is Amstrong..:"+arm);
else
System.out.println("\tGiven num is not a Amstrong..:");
}
}