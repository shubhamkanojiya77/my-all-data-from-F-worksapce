
public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a =56845;

int sum=0; 
int rev=0;
while(a>0)
{
	int lastdigit= a%10;
	sum=sum+lastdigit;
	//rev=rev*10+ lastdigit;
	int newdidgit= a/10;
	
	
}
	
	for (;a!=0;a=a/10)
	{
		
	}
	System.out.println(sum);
	
//*****************	
	StringBuffer sb=new StringBuffer(String.valueOf(a));
	StringBuffer k=sb.reverse();
	System.out.println(k);
	
	}
	
//**********
	
	
}
