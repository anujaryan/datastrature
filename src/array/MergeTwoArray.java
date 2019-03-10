/**
 * 
 */
package array;

import java.util.Arrays;

/**
 * @author anuj
 *
 */
/**
 * @author anuj
 *
 */
public class MergeTwoArray {

	
	public static void main(String str[]){
		
		int x[]={1,4,7,8,10};
		int y[]={2,3,9};
		
		
		merge(x,y);
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
	}

	/**
	 * @param x
	 * @param y
	 */
	private static void merge(int[] x, int[] y) {
		
		int m=x.length;
		int n=y.length;
		
		
		for(int i=0;i<m;i++){
			
			//compare current element of X[] with first element of y[]
			if(x[i]>y[0]){
				//swap 
				int temp=x[i];
				x[i]=y[0];
				y[0]=temp;
				
				int first=y[0];
				
				
				
				//y[0] to itst current position to maintain sorted \
				//order of Y[] Note: Y[1..N-1] is already sorted
				
				
				int k;
				for(k=1;k<n && y[k]<first;k++){
					y[k-1]=y[k];
				}
				y[k-1]=first;
			}
		}
		
	}
}
