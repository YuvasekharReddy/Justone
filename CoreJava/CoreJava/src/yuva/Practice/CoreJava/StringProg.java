package yuva.Practice.CoreJava;

import java.util.Scanner;

public class StringProg {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String :");
	String s=sc.nextLine();
	int l=s.length();
	int count=0;
	int count1=0;
	int count2=0;
	int count3=0;
	int count4=0;
	char cArr[]=s.toCharArray();
	String s1[]=s.split("");
	System.out.println("Total length of String :"+s1.length);
	String s2[]=s.split(" ");
	System.out.println("words in String :"+s2.length);
	/*for(int i=0;i<s.length();i++){
		char c=s.charAt(i);	
		if(c>=65&&c<=90){
			count++;
			count1++;
		}else if(c>=97&&c<=122){
			count++;
			count2++;
		}
		if(c>=48&&c<=57){
			count++;
			count3++;
		}else{
		count++;
		count4++;
		}
	}
	System.out.println("No of letters in string :"+count);
	System.out.println("No of capital letters in string :"+count1);
	System.out.println("No of small letters in String :"+count2);
	System.out.println("No of numbers in String :"+count3);
	System.out.println("No of special symbols in String :"+count4);
	
	String rev="";
	for(int i=l-1;i>=0;i--){
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);*/
	for(int p=0;p<s2.length;p++){
		String s3=s2[p];
		int l1=s3.length();
		String rev1="";
		for(int r=l1-1;r>=0;r--){
			rev1=rev1+s3.charAt(r);
		}
		System.out.print(" "+rev1);
	}
	/*for(int q=0;q<cArr.length;q++){
		if(cArr[i].equals(s)){
			
		}
		
	}*/
	
}
}
