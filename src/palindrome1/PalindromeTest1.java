package palindrome1;
/**
 * Tests a word to see if it is a palindrome
 * @Author Sukhjinder Nahal
 */
import java.util.Scanner;

public class PalindromeTest1 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a word or Z to exit");
		String word = keyboard.next();
		
		while(!word.equalsIgnoreCase("Z"))
		{
			String reverse = new StringBuffer(word).reverse().toString();
		
			if(word.equalsIgnoreCase(reverse))
				System.out.println("This word is a palindrome");
			else
				System.out.println("This is not a palindrome ");
			
			System.out.println("\n"+"Enter a word");
			word = keyboard.next();
		}
		
		keyboard.close();
	}

}
