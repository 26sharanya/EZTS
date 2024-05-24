package demo3;
import java.util.Scanner;
public class NonRepeatingCharacter
	{
		 public static void main(String[] args)
		 {	 
		     Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a string: ");
		        String input = scanner.nextLine();

		        Character result = findFirstNonRepeatingCharacter(input);
		        if (result != null) 
		        {
		            System.out.println("The first non-repeating character is: " + result);
		        } 
		        else 
		        {
		            System.out.println("There are no non-repeating characters in the string.");
		        }
		        scanner.close();
		    }
		    public static Character findFirstNonRepeatingCharacter(String str) 
		    {
		        if (str == null) 
		        {
		            return null;
		        }
		        int[] charCount = new int[256];
		        for (int i = 0; i < str.length(); i++) 
		        {
		            charCount[str.charAt(i)]++;
		        }
		        for (int i = 0; i < str.length(); i++) 
		        {
		            if (charCount[str.charAt(i)] == 1) 
		            {
		                return str.charAt(i);
		            }
		        }

		        return null;
		    }
		}
