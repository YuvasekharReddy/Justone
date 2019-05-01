package yuva.Practice.CoreJava;

public class Lab717{
public static void main(String[] args){
System.out.println("main started");
String data="null";
try{
data=args[0];
}catch(ArrayIndexOutOfBoundsException e){
System.out.println("*provide one value as CLA");
}
int x=0;
try{
x=Integer.parseInt(data);
}catch(NumberFormatException e){
System.out.println("*provide int value as CLA");
}
try{
int res=10/x;
System.out.println("result:"+res);
}catch(ArithmeticException e){
System.out.println("*provide non zero int value as CLA");
}
System.out.println("Main Completed");
}
}
