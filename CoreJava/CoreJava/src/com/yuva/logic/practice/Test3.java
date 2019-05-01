package com.yuva.logic.practice;

@FunctionalInterface
interface StringOperation
{
String stringFunction(String str);
} 

public class Test3{

public static void main(String[] args){
StringOperation reverse=(str)->{
String str1="";
for(int i=str.length()-1;i>=0;i--)
str1=str1+str.charAt(i);

return str1;
};
String rev=reverse.stringFunction("JAVA");
System.out.println(rev);

}
}