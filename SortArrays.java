package collection;
import java.util.*;

public class SortArrays {

	public static void main(String[]args) {
		
		ArrayList<String> str = new ArrayList<String>();
		
		str.add("B.M.W");
		str.add("A.M");
		str.add("Volvo");
		str.add("R.R");
		
		System.out.println(str+"\n");
		
		Collections.sort(str);
		
		System.out.println(str+"\n");
		
		Iterator<String> itr =  str.iterator();
		itr.hasNext();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		}
		
	}
	

