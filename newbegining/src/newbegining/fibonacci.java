package newbegining;
import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {

java.util.Scanner obj=new Scanner(System.in);
System.out.println(" enter the number");
int number= obj.nextInt();
int fib=0;
int a=1;
int b=1;
//System.out.println(+a );	// isse galat ho raha tha
//System.out.println(+b);		// isse galat ho raha tha

// logic


while(fib<=number)// 2             wrong---->  while(number>0)
{
	 fib=a+b; // 1+1
	 //if(fib>number)
		// break;
	 System.out.println(+fib);
	 
	 a=b;
	 b=fib;
	
	}
	}}
	
	


