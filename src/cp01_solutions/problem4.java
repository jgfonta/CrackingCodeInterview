package cp01_solutions;

//1.4 Write a method to decide if two strings are anagrams or not.
//pg 48
//SOLUTION
//There are two easy ways to solve this problem:
//Solution #1: Sort the strings
//1 boolean anagram(String s, String t) {
//2 return sort(s) == sort(t);
//3 }
//Solution #2: Check if the two strings have identical counts for each unique char.
//1 public static boolean anagram(String s, String t) {
//2 if (s.length() != t.length()) return false;
//3 int[] letters = new int[256];
//4 int num_unique_chars = 0;
//5 int num_completed_t = 0;
//6 char[] s_array = s.toCharArray();
//7 for (char c : s_array) { // count number of each char in s.
//8 if (letters[c] == 0) ++num_unique_chars;
//9 ++letters[c];
//10 }
//11 for (int i = 0; i < t.length(); ++i) {
//12 int c = (int) t.charAt(i);
//13 if (letters[c] == 0) { // Found more of char c in t than in s.
//14 return false;
//15 }
//16 --letters[c];
//17 if (letters[c] == 0) {
//18 ++num_completed_t;
//19 if (num_completed_t == num_unique_chars) {
//20 // it’s a match if t has been processed completely
//21 return i == t.length() - 1;
//22 }
//23 }
//24 }
//25 return false;
//26 }

public class problem4 {

}
