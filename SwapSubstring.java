package Project1;

public class SwapSubstring {

	public static void main(String[]args) {
		
		String a = "Hello";
		String b = "World";
		System.out.println("Before Swapping\n"+a+"\n" + b);
		a = a+b;
		
		b = a.substring(0, a.length()-b.length());
		
		a = a.substring(b.length());
		
		System.out.println("\nAfter Swapping\n"+a);
		System.out.println(b);
		
		
		
	}
	
}
