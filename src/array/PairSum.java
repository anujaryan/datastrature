package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PairSum {

	static int [] arr=null;
	
	int k=0;
	PairSum(int len){
		arr=new int[len]; 
		
		for(int i=0;i<len;i++){
			arr[i]=k;
			k+=5;
		}
		
		
	}
	public static void main(String args[]){
		
		
		int arr[]={8,7,2,5,3,1};
		int sum=10;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		PairSum pair=new PairSum(10);
		
		pair.traversing(arr);
		
		System.out.println(); System.out.println();
		
		System.out.println("Pair of sum is ....");
		// time complexity is n power 2 and space complexity is o(1)
		//pair.pairSum(arr, 15);
		
		//time complexity o(n log(n)) method  sorting method... check out ..
		//pair.pairSumWithNlogComplexity(arr,sum);
		
		
		//time complexity o(n) by using hashing method...
		
		pair.pairSumUsinghashing(arr, sum);
	}
	
	
	
	public void pairSumUsinghashing(int arr[], int sum) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {

			if (map.containsKey(sum - arr[i])) {
				System.out.println("Sum found ! array indexes is :" + i + " , " + map.get(sum - arr[i]) + "(" + arr[i]
						+ "+" + arr[map.get(sum-arr[i])] + ")");
				return;
			}

			map.put(arr[i], i);

		}

		System.out.println("Pair sum not found  !");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void pairSumWithNlogComplexity(int arr[], int sum) {

		// sort the array in incremented order...........
		Arrays.sort(arr);

		int low = 0;
		int high = arr.length - 1;

		while (low < high) {

			if (arr[low] + arr[high] == sum) {
				System.out.println(
						"Sum found ! array indexes is :" + low + " , " + high + "(" + arr[low] + "+" + arr[high] + ")");
				return;
			}

			if (arr[low] + arr[high] < sum)
				low++;
			else
				high--;

		}
		
		
		System.out.println("Sum is not found in array !");
		
		
		
		
		
	}
	
	
	
	
	
	
	
	public void traversing(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
	}
	
	public void pairSum(int arr[],int sum){
		
		boolean flag=false;
		for(int i=0;i<arr.length-1;i++ ){
			
			for(int j=i+1;j<arr.length;j++){
				if(sum==arr[i]+arr[j]){
					System.out.println("Pair found ! index of pairs are   "+ i +" ,  "+ j + "("+arr[i]+"+"+arr[j]+")" );
					return;
				}
				
			}
			
			System.out.println("No pair with given sum found in array !");
			
			
		}
		
		
	}
}
