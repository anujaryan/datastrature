package recursion;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		
		System.out.println(naturalSum(6));
		
	}

	private static int naturalSum(int i) {
		
		if(i==0)
			return 0;
		else
			 return naturalSum(i-1)+i;
		
		
	}
}
