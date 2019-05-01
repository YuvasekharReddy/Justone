package yuva.Practice.CoreJava;

public class Lab753 {
public static void main(String[] args) {
	MyThread t1=new MyThread();
	MyThread t2=new MyThread();
}
}

class MyThread extends Thread{
	MyThread(){
		start();
	}
	public void run(){
		Thread th=Thread.currentThread();
		ThreadGroup tg=th.getThreadGroup();
		System.out.println("Thread Name:"+th.getName());
		System.out.println("Thread Group:"+tg.getName());
	}
}