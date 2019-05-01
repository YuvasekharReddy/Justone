//WAJP to find sum from cmd line Args..
package yuva.Practice.CoreJava;
class LabQ32
{
public static void main(String []as)
{
if(as.length<2)
{
String str1=as[0];
String str2=as[1];
int a=Integer.parseInt(str1);
int b=Integer.parseInt(str2);
System.out.println("Sum of CLA Args is :  "+(a+b));
}
else
System.out.println("Enter only two num in CLA ");
}
}