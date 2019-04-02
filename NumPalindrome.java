import java.util.Scanner;


public class NumPalindrome {
	public static void main(String arg[]){
		System.out.println("Enter a number to reverse");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("Reverse is "+RevNum(num));
		if(num ==RevNum(num)){
			System.out.println("The number is a palindrome "+num);
		}
		
	}
	public static int RevNum(int num){
		//get last digit in modu 425
		int modu;
		int reversenum=0;
		
		while(num>0){
			modu = num%10;
			reversenum = reversenum*10+modu;
			num = (num-modu)/10;
    	}
		return reversenum;
	}

}
