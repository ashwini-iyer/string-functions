import java.util.Scanner;


public class FibonaciiSeriesPrint 
{
  public static void main(String arg[])
  {
	System.out.println("Enter a number upto which fibonacci series must be printed");
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	System.out.println("The numbers in the series are using loop :- ");
	
	fib(num);
	
	System.out.println("Recursion method fibonacii series");
	for(int i =1;i<num;i++){
		System.out.println(fibRec(i));
		}
	
  }
  //fib using iteration loop
   public static void  fib(int num)
   {
	   int n1 = 1;
		int n2 = 1;
		int sum ;
		System.out.println(n1);
		
		if(num ==1 ||num == 2)
		{System.out.println(n1+" "+n2);}
		
		while(num>0)
		{
		
			sum = n1+n2;
			n1  = n2;
			n2 = sum;
			num--;
			System.out.println( n1+" ");
       }
    }
   public static int fibRec(int num)
   {
	   if(num ==1 ||num == 2)
	   {
		   return 1;
	   }
	  
		   return fibRec(num-1)+fibRec(num-2);
		  
	   
	   
	   
   }
}
