
public class SwappingOfnumber {

	public static void main(String[] args) {
		
int a=35;
int b=65;
int temp;
// 3rd variable

temp=a;
a=b;
b=temp;
/*System.out.println("a value is" +a);
System.out.println("b value is" +b);*/
	 
// + operator

	
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("a value is" +a);
	System.out.println("b value is" +b);
	
	
// multiplication
	a=a*b;
	b=a/b;
	a=a/b;
	System.out.println("a value is" +a);
	System.out.println("b value is" +b);
}}
