import java.io.*;
import java.util.Scanner;
public class PalindromeTest {
public static void main(String[] arg){
	System.out.println("Enter a string to check for palindrome--");
	Scanner scan = new Scanner(System.in);
	String str = scan.nextLine();
	System.out.println("Is "+str+" Palindrome? "+isPalin(str));
}
public static boolean isPalin(String str){
	
	int left =0; int right = str.length()-1;
	while (left<right){
		if(str.charAt(left) == str.charAt(right)){
			left++; right--;
			continue;
		}else{
			
			return false;
		}
	}
	return true;
}
}

