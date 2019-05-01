package yuva.Practice.CoreJava;

public class ServltAPI {
	public static void main(String[] args) {
		Servlet ref=new Myclass();
		ref.GeService();
		
	}

}
interface Servlet{
	void GeService();
	void Update();
	void Delete();
}

abstract class Generic implements Servlet{
	public void Update(){
		System.out.println("Update method");
	}
	public void Delete(){
		System.out.println("Delete method");
	}
	
}
 
abstract class Httpserv extends Generic{
	public void GeService(){
		System.out.println("GeService");
		Htservice(10,20);
	}
	
	void     doget(){}
	void     dopost(){}
	void     dotrace(){}
 abstract protected void Htservice(int a,int b);
	
}

class Myclass extends Httpserv{
	protected void Htservice(int a,int b){
		System.out.println("Service in Myclass");
	}
	
}