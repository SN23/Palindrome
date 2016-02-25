package palindrome2;
/**
 * Tests a word to see if it is a palindrome
 * @Author Sukhjinder Nahal
 */
import java.util.Scanner;

public class PalindromeTest2 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a word or Z to exit");
		String word = keyboard.next();
		
		while(!word.equalsIgnoreCase("Z"))
		{
			char[] inputWord = word.toCharArray();
			int last = inputWord.length-1;
			char[] reversedWord = new char[inputWord.length];
			for(int i=0; i<inputWord.length; i++)
			{
				char x = inputWord[last-i];
				reversedWord[i] = x;
				
			}
			String reverse = new String(reversedWord);
			
			
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
