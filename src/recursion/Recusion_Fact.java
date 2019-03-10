package recursion;

public class Recusion_Fact {

	public static void main(String str[]){
		
		System.out.println(" Factorial of Number is : "+fact(5));
		
	}

	private static int fact(int i) {	
		if(i==1)
			return  1;
		else
		  return	i*fact(i-1);
		
	}
}
