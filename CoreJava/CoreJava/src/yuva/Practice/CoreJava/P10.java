package yuva.Practice.CoreJava;

public class P10 {
public static void main(String[] args) {
	AA aobj=new BB();
	System.out.println(aobj.x);
}}
class AA{
	
	String x="jlc";
}

class BB extends AA{
	
	int x=10;
	
}


