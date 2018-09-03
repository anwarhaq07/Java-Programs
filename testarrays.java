package collection;
import java.util.*;

public class testarrays {

	
	public static void main(String[]args) {
		
		ArrayList<String> str = new ArrayList<String>();
		
		str.add("Blue");
		str.add("Black");
		str.add("White");
		
		System.out.println("Size of an array :"+str.size());
			
		System.out.println("\n"+str);
		
		Iterator itr = str.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println("\n"+itr.next());
			
		}
	
		str.add(0, "Green");
		System.out.println("\n"+str);
		
		System.out.println("\n"+str.get(3));
		
		System.out.println("\n"+ str.set(1, "Yellow") + str);
		
		System.out.println("\n"+str.remove(3) + str);
		
		System.out.println("\n"+str.contains("Black"));
		
		
		
		
	}
}
