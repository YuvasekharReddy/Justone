package yuva.Practice.CoreJava;

public class Lab603 {
	public static void main(String[] args) {
		Student1 st1=null;
		System.out.println(st1);
		st1=new Student1(99,"sri");
		System.out.println(st1);
		String str=new String("yuva raj igrigjd");
		System.out.println(str);
		Integer ref=new Integer(123);
		System.out.println(ref);
	}

}
class Student1{
	int sid;
    String name;
    Student1(int sid,String name){
    	this.sid=sid;
    	this.name=name;
    }
    /*public String toString(){
    	return sid+"\t"+name;
    }*/
}