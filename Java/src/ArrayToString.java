

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayToString {

	public static void main(String[] args) {
		// array string ---> string
		String  [] a= {"s","h","u","b"};  // shub
		
		String joined =String.join("", a);
		System.out.println(joined);
		
		String joined1=Arrays.asList("s","h","u","b").stream().collect(Collectors.joining(""));
		System.out.println(joined1);
		
	}
	
	
	
	
	
}
