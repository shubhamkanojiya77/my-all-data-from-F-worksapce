
public class OCCURANCEstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String s="shubhammash";			// scp memory
	//String k=new String("hello");  // heap scp
	
	
	// for each
	// for loop
	
	char[] a=s.toCharArray();
	
	int count=0;
	// for each
	// for loop  --> index
	for(char k:a)
	{
		if(k=='h')
		{
			count++; //+1
		}

	}
	 System.out.println(count);
	}

}
