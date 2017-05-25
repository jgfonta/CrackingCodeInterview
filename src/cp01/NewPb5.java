package cp01;

import java.util.*;

////1.5 Write a method to replace all spaces in a string with ‘%20’.

public class NewPb5 {

	public static void main(String[] args) {
		Scanner inputStream = new Scanner(System.in);
		String inputString;
		
		System.out.print("Type a string:");
		inputString = inputStream.nextLine();
		inputStream.close();
		
		System.out.println("You typed in:" + inputString);

		inputString = replaceSpaces2(inputString);
		
		System.out.println("Replace blanks:" + inputString);
		
	}
	
	static String replaceSpaces(String input)
	{
		return input.replaceAll(" ", "%20");
	}
	
	static String replaceSpaces2(String input)
	{
		//Allocate initial array
		char[] myCharArray = input.toCharArray();
		int blanks = 0;   //Count of blanks

		for (int i=0; i< myCharArray.length; i++)
		{
			if (myCharArray[i] == ' ')
				blanks++;
		}
		
		//Allocate a new array big enough
		char[] newCharArray = new char[myCharArray.length + blanks * 2];
		
		//Move data to the new array
		blanks = 0;	
		for (int i=0; i<myCharArray.length; i++)
		{
			if (myCharArray[i] != ' ')
			{
				newCharArray[blanks] = myCharArray[i];
			}
			else
			{
				newCharArray[blanks] = '%';
				newCharArray[blanks+1] = '2';
				newCharArray[blanks+2] = '0';
				blanks += 2;
			}
			blanks++;
		}
		
		return String.copyValueOf(newCharArray);
	}

}
