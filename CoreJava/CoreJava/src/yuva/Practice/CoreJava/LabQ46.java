// Display no.of even no.s and odd no.s avilable upto given no:
package yuva.Practice.CoreJava;
import java.util.Scanner;
class LabQ46
{
public static void main(String []as)
{
System.out.println("Enter N value:");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int even[]=new int[n+1];
int odd[]=new int[n+1];
System.out.println("\tEven Numbers are:");
for(int i=1;i<=n;i++)
{
if(i%2==0){
even[i]=i;
System.out.print("\t"+even[i]);
}
else{
odd[i]=i;
System.out.print("\t"+odd[i]);
}
}
}
}
































/*for(int i=0;i<n;i++)
{
if(i%2==0)
 even[i]=i;
else 
odd[i]=i;
}
for(int i=0;i<=n;i++)
{
System.out.println("Even number are:  "+even);
}
}
}*/

