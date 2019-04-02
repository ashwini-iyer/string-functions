import java.util.*;
import java.io.*;
/**
 * String reversal character wise
 * @author ashwini
 *
 */
public class StringReverse {
	public static void main(String arg[]){
		System.out.println("Enter a string which needs to be reversed.");
		Scanner scan = new Scanner(System.in);
		int f = scan.nextInt();
		double d = scan.nextDouble();
	    String str = scan.nextLine();
	    
	    System.out.println("dssssssssssss"+f+d+str);
	    for(int i=str.length()-1;i>=0;i--){
	    	System.out.println(str.charAt(i));
	    }
	    ArrayList al = new ArrayList();
	    al.add("Ashwini");
	    al.add("Ananthu");
	    al.add("Arjun");
	    al.add("Mahesh");
	    al.add("Usha");
	    al.add("Poornima");
	    al.add("Sandeep");
	    al.add("Harsha");
	    System.out.println(al);
	    al.remove(1);
	    System.out.println(al);
	    
	    
	}

}

