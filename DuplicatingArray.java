package collection;
import java.util.*;

public class DuplicatingArray {
	
	public static void main (String[]args) {
		
		String str1[] = {"Cat","Dog","Horse","Cow"};
		
		String str2[] = new String[str1.length];

	// assigning elements of str1 to str2
		for(int i = 0;i<str1.length;i++) {
			
			System.out.println(str1[i]+"");
		}
		
		
		
		
		for (int i =0;i<str1.length;i++) {
			
			str2[i] = str1[i];
		
			System.out.println(str2[i]+"");
		}
		
	
		//Cloning
		
		str2 = str1.clone();
		

		for (int i =0;i<str1.length;i++) {
		
	
			System.out.println(str2[i]+"");
		}
		
		
		
	}
	
}
