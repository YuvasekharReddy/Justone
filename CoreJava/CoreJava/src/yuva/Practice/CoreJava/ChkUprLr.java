package yuva.Practice.CoreJava;

import java.util.Scanner;
class ChkUprLr
{
public static void main(String []ade)
{
/*System.out.println("Enter Character..:");
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
if(ch>=65&&ch<=90)
System.out.println(ch+" is Upper case Alphabet");
else
System.out.println("  Not a Upper case Alphbet ");*/
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String : ");
	String str=sc.next();
	for(int i=0;i<str.length();i++){
		char ch=str.charAt(i);
		if(ch>=65&&ch<=90)
			System.out.println(ch+" is Upper case Alphabet");
			else
			System.out.println(ch+" is Lower case Alphbet ");
	}
}
}