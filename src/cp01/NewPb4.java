package cp01;

import java.util.*;

////1.4 Write a method to decide if two strings are anagrams or not.

public class NewPb4 {

	public static void main(String[] args) 
	{
		Scanner inputStream = new Scanner(System.in);
		String inputString1, inputString2;
		
		System.out.print("Type a string:");
		inputString1 = inputStream.next();
		
		System.out.print("Type another string:");
		inputString2 = inputStream.next();

		inputStream.close();
		
		System.out.println("You typed in:" + inputString1 + " " + inputString2);
		System.out.println("Are they anagrams? " + isAnagram(inputString1.toCharArray(),inputString2.toCharArray()));
	}
	
	
	//This routine checks if a string passes as an array has matching number of characters
	static boolean isAnagram(char[] string1, char[] string2)
	{		
		if (string1.length != string2.length)
			return false;
		
		//Sort the strings to compare them
		Arrays.sort(string1);
		Arrays.sort(string2);
		
		//Compare the arrays now that they are sorted and same size
		return Arrays.equals(string1, string2);		
	}

}
