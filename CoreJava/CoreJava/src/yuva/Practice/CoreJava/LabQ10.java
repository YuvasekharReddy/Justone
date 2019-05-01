package yuva.Practice.CoreJava;

import java.util.Scanner;

class LabQ10
{
public static void main(String []as)
{
System.out.println("Enter fahrenheit value:");
Scanner sc=new Scanner(System.in);
int f=sc.nextInt();
int celsius;
celsius=(f-32)*5/9;
System.out.println("Required Fahrenheit value is:"+celsius);


}
}
