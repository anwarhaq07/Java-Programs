package Project1;
import java.util.Scanner;

public class PalindromeNumber {
	
	public static void main(String[]args) {
		
		int  number;
		int n = 0;
		
		System.out.println("Enter any number : ");
		
		Scanner sc = new Scanner(System.in);
		
		 number = sc.nextInt();
		 int num = number;
		
		 while(number!=0) {
			
			n = n*10;
			n = n+number%10;
			number = number/10;
			
			
		}
	System.out.println("Reverse of Entered Value is "+n +"\n");
		
	if(num == n) 
		System.out.println("Entered value is palindrome");
	
	else 
		System.out.println("Entered Value is not palindrome");
	
	
	
			}

}
