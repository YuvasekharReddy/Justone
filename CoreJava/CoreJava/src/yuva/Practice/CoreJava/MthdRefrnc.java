package yuva.Practice.CoreJava;

interface T1{
 public	String m1(String str);
}
interface T2{
	 public	void m2(String str);
	}

public class MthdRefrnc {

	public static void main(String[] args) {
		
		//********Static*Refernces**********
		T1 t=Revcal::revscal;
		
		String r=t.m1("Yuvan");
		
		System.out.println(r);
		
		String str=Revcal.revscal("yuvanreddy");
		
		System.out.println(str);
		
		//*********Instance*Reference*********
		Revcal rc=new Revcal();
		T1 tr=rc::revscal1;
		String r1=tr.m1("yuvanfg");
        System.out.println(r1);
        
        //*********Constructor*Reference******
        
        T2 cnt=Revcal::new;
    	cnt.m2("yuvanhjk");
        
	}

	
	
}
