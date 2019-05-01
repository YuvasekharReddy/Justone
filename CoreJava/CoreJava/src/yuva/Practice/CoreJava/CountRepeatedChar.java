package yuva.Practice.CoreJava;

import java.util.HashMap;

public class CountRepeatedChar {
public static void main(String[] args) {
	String str="yuvasekhar  reddy";
	HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
	for(int i=0;i<str.length();i++){
		if(hm.containsKey(str.charAt(i))){
			hm.put(str.charAt(i),hm.get(str.charAt(i))+1);
			//System.out.println(str.charAt(i)+"\t"+hm.get(str.charAt(i))+1);
		}else{
			hm.put(str.charAt(i),1);
		}
	}
	System.out.println(hm);
}
}
