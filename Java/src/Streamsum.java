import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Streamsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a []= {5,6,11,78,89,45,15};


	
List<int[]> list=Arrays.asList(a);

int[] sum = list.stream().reduce((a,b)->a+b).get();
System.out.println(sum);
		
	}

}
