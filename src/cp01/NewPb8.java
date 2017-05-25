package cp01;

import java.util.*;

////1.8 Assume you have a method isSubstring which checks if one word is a 
//substring of another. Given two strings, s1 and s2, write code to 
//check if s2 is a rotation of s1 using only one call to isSubstring 
//(i.e., “waterbottle” is a rotation of “erbottlewat”).

public class NewPb8 {

	final static String STRING1a = "waterbottle";
	final static String STRING1b = "erbottlewat";
	final static String STRING2a = "apple";
	final static String STRING2b = "pplea";
	final static String STRING3a = "carrot";
	final static String STRING3b = "parrot";
	final static String STRING4a = "tree";
	final static String STRING4b = "bannana";

	
	
	public static void main(String[] args) {
		
			
		System.out.println("Problem #8 - Are strings substrings?");
		//inputString = inputStream.next();
		//inputStream.close();
				
		System.out.println("Compared " + STRING1a + " to " + STRING1b + ", result is " + isRotation(STRING1a,STRING1b));
		System.out.println("Compared " + STRING2a + " to " + STRING2b + ", result is " + isRotation(STRING2a,STRING2b));
		System.out.println("Compared " + STRING3a + " to " + STRING3b + ", result is " + isRotation(STRING3a,STRING3b));
		System.out.println("Compared " + STRING4a + " to " + STRING4b + ", result is " + isRotation(STRING4a,STRING4b));
		
		
	}
	
	public static boolean isRotation(String val1, String val2)
	{
		if (val1.length() != val2.length())
			return false;

		String bigString;
		bigString = val1 + val1;
		return bigString.contains(val2);
	}

}
