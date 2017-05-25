package cp01;

import java.util.*;

////1.2 Write code to reverse a C-Style String. (C-String means that “abcd” is 
//represented as five characters, including the null character.)
public class NewPb2 {

	public static void main(String[] args) 
	{
		Scanner inputStream = new Scanner(System.in);
		String inputString;
		
		System.out.print("Type a string:");
		inputString = inputStream.next();
		inputStream.close();
		
		char [] myString = inputString.toCharArray();
		char temp;	
		int end = myString.length - 1;
		System.out.println("You typed in:" + String.valueOf(myString));

		for (int i = 0; i < (myString.length / 2); i++)
		{
			temp = myString[i];
			myString[i] = myString[end];
			myString[end] = temp;
			end--;
		}
		
		System.out.println("Reversed it as:" + String.valueOf(myString));
		
	}

}
