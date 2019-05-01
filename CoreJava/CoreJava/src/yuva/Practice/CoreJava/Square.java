package yuva.Practice.CoreJava;
//Num is power of two or not
import java.util.Scanner;
class Square
{
public static void main(String[]as)
{
System.out.print("\n\nEnter value to check:  ");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int square=1;
while(num>=square)
{
if(num==square)
{

System.out.println("\nGiven is num power of two");
return;
}

square=square*2;

}
System.out.println("\nGiven num is not power of two");



}
}