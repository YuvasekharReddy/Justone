package yuva.Practice.CoreJava;
import java.util.Scanner;
class LabQ28
{
public static void main(String []da)
{
System.out.println("Enter number:");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
switch(a)
{
case 0:
System.out.println("Sunday");
break;
case 1:
System.out.println("Monday");
break;
case 2:
System.out.println("Tuesday");
break;
case 3:
System.out.println("Wednsday");
break;
case 4:
System.out.println("Thursday");
break;
case 5:
System.out.println("Friday");
break;
case 6:
System.out.println("Saturday");
break;
default:
System.out.println("Wrong Input");
}
}
}
/*if(a==0)
System.out.println(" Sunday");
else
if(a==1)
System.out.println(" Monday");
else
if(a==2)
System.out.println(" Tuesday");
else
if(a==3)
System.out.println("  Wednesday");

else
if(a==4)
System.out.println("  Thursday");
else
if(a==5)
System.out.println("    Friday");
else
if(a==6)
System.out.println("   Saturday ");
else
System.out.println("Wrong Input:");*/










