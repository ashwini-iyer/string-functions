import java.util.*;
public class factorial {

	/**
	 * Factorial of the number 
	 * @author ashwini
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter a number:-");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int fact = factorial(num);
		System.out.println("Factorial of the number is:- "+fact+" using the normal way.");
		int factRec = fact(num);
		System.out.println("Factorial of the number is:- "+fact+" using the recursive method.");
		
	}
	
	/**
	 * find factorial of a number
	 * @param num
	 * @return
	 */
	public static int factorial(int num){
		 
		int fact =1;
		for(int i=1;i<=num ;i++){
			fact = fact*i;
		}
		return fact;
	}
	
	/**
	 * factorial by recursive method.
	 * @param num
	 * @return
	 */
	public static int fact(int num){
		 
		if(num==1)return 1;
		return num*fact(num-1);
	}

}
