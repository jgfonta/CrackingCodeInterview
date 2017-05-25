package cp01;

import java.util.*;

//1.3 Design an algorithm and write code to remove the duplicate characters 
//in a string without using any additional buffer. 
//NOTE: One or two additional variables are fine. 
//An extra copy of the array is not.

//FOLLOW UP
//Write the test cases for this method.


public class NewPb3 {

	final static String STRING1 = "THERE ARE SOME DUPLICATE CHARACTERS IN THIS STRING";
	final static String STRING2 = "NO DUPLICATE";
	final static String STRING3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ. NOW I KNOW MY ABCs NEXT TIME WON'T YOU SING WITH ME?";
	
	public static void main(String[] args) {
		Scanner inputStream = new Scanner(System.in);
		String inputString;
		
		System.out.print("Problem #3 - Type a string with duplicate characters:");
		//inputString = inputStream.next();
		//inputStream.close();
		inputString = STRING1;
				
		System.out.println("\nYou typed in:" + inputString + "<length>" + inputString.length());
		
		inputString = String.copyValueOf(removeDups(inputString.toCharArray()));
		System.out.println("Duplicate characters removed it becomes:" + inputString + "<length>" + inputString.length());
		
		inputString = STRING2;
		
		System.out.println("\nYou typed in:" + inputString + "<length>" + inputString.length());
		
		inputString = String.copyValueOf(removeDups(inputString.toCharArray()));
		System.out.println("Duplicate characters removed it becomes:" + inputString + "<length>" + inputString.length());

		inputString = STRING3;
		
		System.out.println("\nYou typed in:" + inputString + "<length>" + inputString.length());
		
		inputString = String.copyValueOf(removeDups(inputString.toCharArray()));
		System.out.println("Duplicate characters removed it becomes:" + inputString + "<length>" + inputString.length());

		
	}
	
	//1.3 Design an algorithm and write code to remove the duplicate characters 
	//in a string without using any additional buffer. 
	//NOTE: One or two additional variables are fine. 
	//An extra copy of the array is not.

	static char[] removeDups(char [] input)
	{
		//An int is used as a bit vector
		int checker = 0;
		int value;
		int end = input.length;

		for (int i = 0; i < end; i++) 
		{
			value = input[i];
			if ((checker & (1 << value)) > 0)  //And checker with left shifted bits of 1
			{	                             //if greater than zero then we've found something twice
				for (int j = i; j < end-1; j++)  //Shift characters over
				   input[j] = input[j+1]; 
				input[end-1] = 0;
				i--;
				end--;						
			}
			checker |= (1 << value);     //Or checker with left shifted bit of 1 to remember this character
		}

		return input;
	}

}
