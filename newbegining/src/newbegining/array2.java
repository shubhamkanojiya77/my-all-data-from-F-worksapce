package newbegining;

public class array2 {

	public static void main(String[] args) {
		
		//float n[]= new float[];// index size is mandatory to initiate
		float n[]= new float[7];
		//System.out.println(n[7]);// no compile error but will give out of bond in runtime
		
	System.out.println(n[6]);
	
	
		//float [] n= {1,2,3,4,5,6,7};
		/* duplicate error diya... local variable ko method me 2 bar
		initialize nhi karte*/
	
	//System.out.println(n[6]);
	
	//---------------------------------------------------------------------------------
		double []g= new double [0];// no compile error
				System.out.println(n[0]);// default value of double
				
	//---------------------------------------------------------------------------------	
		String shubham []= {"hi", "hello", "how"};		
		//string shubham []= hi,hello, how};
		
		for(String me :shubham)
		{
			System.out.println(shubham);		
	}
for (int z=0; z<shubham.length;z++)
	System.out.println(shubham[1]);
	}
	
	//System.out.println(shubham[5]);// run time me exception
	
	//---------------------------------------------------------------------------------


}