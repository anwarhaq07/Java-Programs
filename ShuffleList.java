package collection;
import java.util.*;

public class ShuffleList {

	
	public static void main(String[]args) {
		
		ArrayList<String> str = new ArrayList<String>();
		
		str.add("Mango");
		str.add("Orange");
		str.add("Banana");
		str.add("Apple");
		System.out.println(str);
		
		
		Collections.shuffle(str);
		
		System.out.println(str);
		
	}
}
