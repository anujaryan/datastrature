package recursion;

public class FibonacciSeries {

	public static void main(String[] args) {
		
	
		System.out.println("Finonacci "+fibo(9));
	}

	private static int fibo(int n) {
	
		if (n == 1) 
          return 0;	
		 else if (n == 2) 
                 return 1;
		 else 
          return fibo(n-1)+fibo(n-2);
			
	}
	
	
	
}
