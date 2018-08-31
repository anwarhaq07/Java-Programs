package Project1;

import java.util.Arrays;

public class AnagramSample {

	public static void main(String[]args) {
		
		String str1 = "listen";
		String str2 = "silent";
		
		if(str1.length() == str2.length()) {
			
			char [] ch1  =str1.toCharArray();
			Arrays.sort(ch1);
			System.out.println(Arrays.toString(ch1));
			
			char [] ch2 =str2.toCharArray();
			Arrays.sort(ch2);
			System.out.println(Arrays.toString(ch2));
			
			   System.out.println(Arrays.equals(ch1, ch2));
			   //boolean b = Arrays.equals(ch1, ch2);
			
			   if(Arrays.equals(ch1, ch2)) {
				
				System.out.println("Anagram");
			}
		
			else System.out.println("Not an Anagram");
			
		}else
			System.out.println("Not an Anagram");
		
		
	}
}
