package yuva.Practice.CoreJava;

import java.util.Scanner;

public class Test15 {
public static void main(String[] args) {
	int edigit=0,odigit=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num=sc.nextInt();
	while(num!=0){
		int digit=num%10;
		System.out.println("digit : "+digit);
		if(digit%2==0){
			edigit++;
		System.out.println("edigit++ : "+edigit);
		}else{
			odigit++;
		    System.out.println("odigit++ : "+odigit);
		    }
		    num=num/10;
			System.out.println("num : "+num);
		
		}
		System.out.println("total number of Even Digit "+edigit);
		System.out.println("total number of odd Digit "+odigit);
}
}
