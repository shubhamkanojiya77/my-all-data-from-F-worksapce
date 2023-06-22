
public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4,6};
int sum=0;
for(int k:a)
{
	sum=sum+k;
	
}
int sum1=0;
for(int i = 0;i<=6;i++)
{
	sum1=sum1+i;

}
 System.out.println(sum1-sum);

	}

}
