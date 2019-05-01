package yuva.Practice.CoreJava;

import java.util.Scanner;
class ElgbleVote
{
public static void main(String []as)
{
System.out.println("Enter Age.:");
Scanner sc =new Scanner(System.in);
int age=sc.nextInt();
//System.out.println(age);
if(age<18)
System.out.println("He/She Not Eligible to vote:"+age);
else 
System.out.println("He/She Eligible to vote:"+age);
}
}