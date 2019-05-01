package yuva.Practice.CoreJava;

public class RepeatNum {
public static void main(String[] args) {
	int a[]={1,2,6,4,9,8,5};
	int b[]={6,7,1,2,4,5};
	for(int i=0;i<a.length;i++){
		for(int j=0;j<b.length;j++){
			if(a[i]==b[j]){
				System.out.print(a[i]);
			}
		}
	}
}
}
