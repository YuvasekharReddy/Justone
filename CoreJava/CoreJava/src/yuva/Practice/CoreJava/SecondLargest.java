package yuva.Practice.CoreJava;

public class SecondLargest {
public static void main(String[] args) {
	int arr[]={1,3,5,9,8,10,11,12};
	int largest=arr[0];
	int secondlargest=arr[0];
	int l=arr.length;
	for(int i=0;i<l;i++){
		if(largest<arr[i]){
			secondlargest=largest;
			largest=arr[i];
		}else if(secondlargest<arr[i]){
			secondlargest=arr[i];
		}
	}
	System.out.println("largest:"+largest);
	System.out.println("secondlargest"+secondlargest);
}
}
