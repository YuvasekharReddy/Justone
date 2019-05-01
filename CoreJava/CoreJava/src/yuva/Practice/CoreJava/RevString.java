package yuva.Practice.CoreJava;

import java.util.Scanner;

public class RevString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str1="";
	String rev="";
	System.out.println("Enter String : ");
	str1=sc.next();
	int l=str1.length();
	for(int i=l-1;i>=0;i--){
		rev=rev+str1.charAt(i);
	}
	System.out.println(rev);
}

}
