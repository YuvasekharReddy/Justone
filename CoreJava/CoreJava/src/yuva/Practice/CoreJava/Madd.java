
package yuva.Practice.CoreJava;

import java.util.Scanner;

public class Madd {
	public static void main(String args[])
	{
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		int c[][]=new int[2][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for a:");
		//int i=sc.nextInt();
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter value for b:");
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("the value in the array A");
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.println(a[i][j]);
			}
		}
		System.out.println("the value in the array B");
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.println(b[i][j]);
			}
		}
		System.out.println("Addition of 2 matrix");
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				c[i][i]=a[i][j]+b[i][j];
				
			}
		}
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.println(c[i][j]);
			}
		}
		System.out.println(c);
	}

}
