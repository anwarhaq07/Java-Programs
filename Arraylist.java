package Project1;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Arraylist {
	
	public static void main(String[]args) {
		
		List<Integer> l1 = new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(2);
		l1.add(2);
		l1.add(3);
		
		Set<Integer> s1= new LinkedHashSet<>(l1);
		List<Integer> l2 = new ArrayList<>(s1);
		
		System.out.println(l2);
		
}
}