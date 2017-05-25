package cp01;

import java.util.*;

//1.1 Implement an algorithm to determine if a string has all unique characters. 
//What if you can not use additional data structures?

//  Solutions use the fact that there are only so many letters and define arrays to exploit that fact.
//  My brute force solution isn't as elegant as should be considered
public class NewPb1 {

	public static void main(String[] args) 
	{
		Scanner inputStream = new Scanner(System.in);
		String inputString;
		System.out.print("Type a string:");
		inputString = inputStream.next();
		inputStream.close();
		
	    ////Determine if a string has all unique characters. 
		//What if you can not use additional data structures?
				
		System.out.println("The statement that your string has unique chars is " + uniqueChars(inputString));
		System.out.println("The statement that your string has unique chars is " + isUniqueChars(inputString));
		System.out.println("The statement that your string has unique chars is " + isUniqueChars2(inputString));
	}
	
	static public boolean uniqueChars(String input)
	{
		
		for (int j = 0; j < input.length(); j++)
		{
			for (int i = 0; i < input.length(); i++)
			{
				if (j != i && input.charAt(i) == input.charAt(j))
					return false;
			}
		}

		return true;
	}

	
	//For simplicity, assume char set is ASCII (if not, we need to increase the storage size. 
	//The rest of the logic would be the same). 
	//NOTE: This is a great thing to point out to your interviewer!
		public static boolean isUniqueChars2(String str) 
		{
			boolean[] char_set = new boolean[256];
			
			for (int i = 0; i < str.length(); i++) 
			{
				int val = str.charAt(i);
				if (char_set[val]) return false;
				char_set[val] = true;
			}
			return true;
		}
		
	//Time complexity is O(n), where n is the length of the string, and space complexity is O(n).
	//We can reduce our space usage a little bit by using a bit vector. 
	//We will assume, in the below code, that the string is only lower case ‘a’ through ‘z’. 
	//This will allow us to use just a single int
		
		public static boolean isUniqueChars(String str) 
		{
			//An int is used as a bit vector
			int checker = 0;
			for (int i = 0; i < str.length(); ++i) 
			{
				int val = str.charAt(i) - 'a';  //Convert character to integer
				if ((checker & (1 << val)) > 0) //And checker with left shifted bits of 1
					return false;               //if greater than zero then we've found something twice
				checker |= (1 << val);          //Or checker with left shifted bit of 1 to remember this character
			}
		return true;
		}
}
