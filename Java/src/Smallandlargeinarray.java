
public class Smallandlargeinarray {

	public static void main(String[] args) {
		
		int a []= {3,9,15,78,95,25};//98 78  25 15 9 3 collections.sort(e.reverseoredr)
		
		
		int largest= a[0];
		int smallest =a[0];
		
		for (int i=1;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				largest=a[i];
			}
			else {
				smallest=a[i];
				
			}
		}
System.out.println(largest);
System.out.println(smallest);
	}

}
