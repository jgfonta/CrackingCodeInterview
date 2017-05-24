package cp01_solutions;

//1.5 Write a method to replace all spaces in a string with ‘%20’.
//pg 48
//SOLUTION
//The algorithm is as follows:
//1. Count the number of spaces during the first scan of the string.
//2. Parse the string again from the end and for each character:
//»»If a space is encountered, store “%20”.
//»»Else, store the character as it is in the newly shifted location.
//1 public static void ReplaceFun(char[] str, int length) {
//2 int spaceCount = 0, newLength, i = 0;
//3 for (i = 0; i < length; i++) {
//4 if (str[i] == ‘ ‘) {
//5 spaceCount++;
//6 }
//7 }
//8 newLength = length + spaceCount * 2;
//9 str[newLength] = ‘\0’;
//10 for (i = length - 1; i >= 0; i--) {
//11 if (str[i] == ‘ ‘) {
//12 str[newLength - 1] = ‘0’;
//13 str[newLength - 2] = ‘2’;
//14 str[newLength - 3] = ‘%’;
//15 newLength = newLength - 3;
//16 } else {
//17 str[newLength - 1] = str[i];
//18 newLength = newLength - 1;
//19 }
//20 }
//21 }

public class problem5 {

}
