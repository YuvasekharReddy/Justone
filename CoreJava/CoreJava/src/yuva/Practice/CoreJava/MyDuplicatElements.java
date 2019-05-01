package yuva.Practice.CoreJava;

public class MyDuplicatElements {

	public static int[] removeDuplicates(int[] input){
		
		int j = 0;
        int i = 1;
		//return if the array length is less than 2
        if(input.length < 2){
			return input;
		}
        while(i < input.length){
            if(input[i] == input[j]){
            	System.out.println("while condition input[i] "+input[i]);
            	System.out.println("while condition input[j] "+input[j]);
                i++;
            }else{
            	input[++j] = input[i++];
            	System.out.println("Else condition input[j] "+input[j]);
            	System.out.println("Else condition input[i] "+input[i]);
            }    
        }
		int[] output = new int[j+1];
		for(int k=0; k<output.length; k++){
			output[k] = input[k];
			System.out.println("for condition output[k] "+output[k]);
			System.out.println("for condition input[k] "+input[k]);
		}
		
		return output;
	}
	
	public static void main(String a[]){
		int[] input1 = {2,3,6,6,8,9,10,10,10,12,12};
		int[] output = removeDuplicates(input1);
		for(int i:output){
			System.out.print(i+" ");
		}
	}
}