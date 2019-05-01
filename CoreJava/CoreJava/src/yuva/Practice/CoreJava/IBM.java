package yuva.Practice.CoreJava;

public class IBM {
public static void main(String[] args) {
	int a[]={2,6,8,7,4,5,1};
	int ln=a.length;
	int temp;
	for(int i=0;i<ln;i++){
		for(int j=i+1;j<ln;j++){
			System.out.println(a[i]+ " testing "+ a[j]);
			if(a[i]<a[j]){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				/*a[i]=a[i]+a[j];
				System.out.println("a[i] first : "+a[i]);
				a[j]=a[i]-a[j];
				System.out.println(" a[j] : "+a[j]);
				a[i]=a[i]-a[j];
				System.out.println("a[i] second : "+a[i]);*/
			}
		}
	}
	System.out.println("Desending order:");
	for(int i=0;i<ln;i++){
		System.out.print(a[i]+",");
	}
}
}
