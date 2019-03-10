package recursion;

public class SumOfDigitOfNumber {

	public static void main(String[] args) {
		
		System.out.println(" Sum of Digit : "+sumOfDigit(123457));
	}

	private static int sumOfDigit(int n) {
		
	
		if(n==0)
			return 0;
		else 
			return sumOfDigit(n/10)+n%10;
		
		
		
	}
}
