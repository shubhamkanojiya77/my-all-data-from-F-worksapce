import java.util.HashSet;
import java.util.Set;

public class DuplicatetValueiInArray {

	public static void main(String[] args) {
	// TODO Auto-generated method stub

		//String s []= {"mrunal","yogesh","shubham", "java","shubham"};
		int s[]= {9,8,5,7,2,7};
for(int i=0;i<s.length;i++)
 
{
	for(int j=i+1;j<s.length;j++)
	{
		//if(s[i].equalsIgnoreCase(s[j]))  // for string
		if(s[i]==(s[j]))  // for integer
			System.out.println("duplicate element is :" +s[i]);
		
		
	}
}

	
String p []= {"mrunal","yogesh","shubham", "java","shubham"};
	Set <String> store=new HashSet<String>();
	for(String n :p)
	{
	if(store.add(n)==false)
	System.out.println("duplicate element is :"+n);
	
	}
	
	}}
