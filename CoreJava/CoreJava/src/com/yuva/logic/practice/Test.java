package com.yuva.logic.practice;

public class Test {
public static void main(String[] args) {
	Hello h=new Hello();
	h.process();
	System.out.println("jlc");
}}
class Hello{
	public int process(){
		throw new NullPointerException();
	}
}