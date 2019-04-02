import java.util.*;
public class MulTable {
	public static void main(String arg[]){
		System.out.println("Enter a number :-");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("Printing the multiplication table for "+num);
		for(int i=0;i<=10;i++){
			System.out.println(num +" * "+i+" = "+num*i);
		}
	}

}
