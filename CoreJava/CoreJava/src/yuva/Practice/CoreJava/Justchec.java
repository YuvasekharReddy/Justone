package yuva.Practice.CoreJava;

import java.util.*;

public class Justchec {

	public static void main(String[] args) {
		List lst=new ArrayList();
		lst.add("yuva");
		lst.add("raj");
		lst.add("senkar");
		lst.add("balaji");
		Iterator it=lst.iterator();
		while(it.hasNext()) {
		//	String elementstring=(String)it.next();
			if(it.next().equals("raj")) {
				it.remove();
				
				
			}
			System.out.println(lst);
		}
	
		
	}

}

