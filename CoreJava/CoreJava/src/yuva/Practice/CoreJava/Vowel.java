package yuva.Practice.CoreJava;
import java.util.Scanner;
class Vowel
{
public static void main(String []ade)
{
/*<=====>import java.util.Scanner;
class Lab350
{
public static void main(String []d)
{
System.out.println("Enter Character :");
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
if(ch>='A'&&ch<=122)
{

switch(ch)
{
case 'a': case 'A': case 'e': case 'E': case 'i':
case 'I': case 'o':  case 'O': case 'u': case 'U':
System.out.println(ch+"  is vowel ");
break;
default:
System.out.println(" Consonant...");
}
}
else
System.out.println("Enter Alphabet..");

}
}=======>*/
System.out.println("Enter your Character....");
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
if(ch=='a'||ch=='A')
{
System.out.println(ch+" Character is vowel:");
}
else
if(ch=='e'||ch=='E')
{
System.out.println(ch+" Character is Vowel:");
}
else
if(ch=='i'||ch=='I')
{
System.out.println(ch+" Character is Vowel:");
}
else
if(ch=='o'||ch=='O')
{
System.out.println(ch+" Character is Vowel:");
}
else
if(ch=='u'||ch=='U')
{
System.out.println(ch+" Character is Vowel:");
}
else
System.out.println(ch+" Consonant...");

}
} 