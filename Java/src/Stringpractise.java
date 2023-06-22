import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stringpractise {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub

		
		
		String [] b = {"s","h","u","b","h","a","m"};  // array
		
		// question -covert array into string
		
		String.join("", b);
		System.out.println(String.join("", b));
		
		// 
		Arrays.asList(b);
		List<String> hi =Arrays.asList(b);
		
		System.out.println(hi);
		
		// 
		String hello =Arrays.asList(b).stream().collect(Collectors.joining(""));
		System.out.println(hello);
		
		// 
		StringBuilder sb=new StringBuilder();
		StringBuilder kya =sb.append(b);
		System.out.println(kya);
	}

	


}
