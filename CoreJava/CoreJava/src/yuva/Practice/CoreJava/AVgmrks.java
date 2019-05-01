package yuva.Practice.CoreJava;

import java.util.Scanner;
class AVgmrks
{
public static void main(String []ad)
{
 System.out.println("Enter There subject marks..:");
 Scanner sc=new Scanner(System.in);
 int m1=sc.nextInt();
 int m2=sc.nextInt();
 int m3=sc.nextInt();
  int TM=m1+m2+m3;
  int Avg=TM/3;
 System.out.println("a)  Total marks scored  :"+(TM));	
 System.out.println("b) Average of Total marks:"+(Avg));
   if(Avg>=80)

  System.out.println("Grade  :A\tRemarks   :Excellent");
  else
  if(Avg>=70)
   System.out.println("Grade  :B\tRemarks   :Veygood");
  else
  if(Avg>=60)
System.out.println("Grade  :C\tRemarks   :Good");
else
if(Avg>=50)
System.out.println("Grade  :D\tRemarks   :Satisfactory");
else
if(Avg<=50)
System.out.println("Grade  :F\tRemarks   :Failure!!Better LUck Next Time");

}
}