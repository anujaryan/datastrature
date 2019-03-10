package array;

import java.util.Arrays;

public class BinaryArraySort {

	public static void main(String[] args) {
		
		int arr[]={1,0,1,0,0,1,1,0};
		
		System.out.println(Arrays.toString(arr));
		
		
		//time complexity of  solution is o(n) and auxilary space o(!)
		sortBinaryArraybycountzeros(arr);
		
		System.out.println("Binary Arrays sort  withoud count zeros...");
		sortBinaryArrayWithoutCountZeros(arr);
		
		
	}
	
	
	//instead counting zeros. if the current element is zero  we can place  o at next available position in  the a
	// arrays after element processed we fill remaining indices  by 1
	
	private static void sortBinaryArrayWithoutCountZeros(int arr[]){
		
		int k=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0)
				arr[k++]=0;
		}
		
		
		for(int j=k;j<arr.length;j++){
			arr[j]=1;
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	
	
	private static void sortBinaryArraybycountzeros(int arr[]){
		
		int zeros=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0)
				zeros++;
		}
		
		int k=0;
		while(zeros--!=0){
			arr[k++]=0;
			}
		while(k<arr.length){
			arr[k++]=1;
			}
		
		System.out.println(Arrays.toString(arr));
		/*System.out.print("{");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
		System.out.print("}");*/
	}
}
