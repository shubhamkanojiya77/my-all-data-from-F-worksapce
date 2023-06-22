
public class Swappingofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a= "mrunal";
String b= "Deshmukh";
 
 
//  mrunaldeshmukh
// String a=a+b;
 String a1= a.concat(b);
 
// b = a.substring(0, 6); 
 b = a.substring(0,a1.length()-b.length());
 
 
 // a
 a = a1.substring(b.length());
 
 System.out.println("b is " +b);
 System.out.println("a is" + a);
 

	}

}
