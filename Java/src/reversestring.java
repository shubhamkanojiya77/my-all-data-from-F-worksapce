
public class reversestring {
	String a= "selenium";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a= "selenium";
String rev="";
for (int i = a.length()-1;i>=0;i--)
	{
	rev=rev+a.charAt(i);// mu
	
	
	}
System.out.println(rev);
//******************
StringBuffer sb=new StringBuffer(a);
StringBuffer k =sb.reverse();
System.out.print(k);
	}

	
	
}
