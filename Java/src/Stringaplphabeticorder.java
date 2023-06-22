import java.util.Arrays;

public class Stringaplphabeticorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String k="mrunaldeshmukh";
char temp;
char[] a = k.toCharArray();

for(int i=0; i<a.length;i++)
{
	for(int j=i+1; j<a.length;j++)
	{
		if(a[i]>a[j])
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
		}
}
	}

System.out.println(String.valueOf(a));

System.out.println(Arrays.toString(a));
}
}
