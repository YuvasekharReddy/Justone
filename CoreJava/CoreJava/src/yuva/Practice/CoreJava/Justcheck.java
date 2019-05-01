package yuva.Practice.CoreJava;

public class Justcheck {

	public static void main(String[] args) {
		
		String str="1234";
		int r=0;
		for(int i=0;i<str.length();i++) {
			r=r*10+str.charAt(i)-'0';
			//System.out.println(i +"\t"+ str.charAt(i));
		}
		System.out.println(r);
		
		String str1="Balaji";
		String str2="Balaji";
		
		String str4="Balaji Balaji Balaji Balaji Balaji Balaji";
		
		String str3[]=str4.split(" ");
		for(String st:str3) {
			System.out.println("YYYYY "+st.hashCode());
		}
		System.out.println(str3[1].hashCode()==str3[2].hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str1.hashCode()==str2.hashCode());

	}

}
