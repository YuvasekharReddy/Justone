package yuva.Practice.CoreJava;

import java.util.Scanner;
class EvenNum
{
public static void main(String []dd)
{
System.out.println("enter number...");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
if(num%2==0)
System.out.println(" Given num is Even:"+num);
else 
System.out.println(" Given num is Odd:"+num);
}
}