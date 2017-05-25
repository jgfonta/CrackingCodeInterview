package cp01_solutions;

//1.2 Write code to reverse a C-Style String. (C-String means that “abcd” is represented as five characters, including the null character.)
//pg 48
//SOLUTION
//This is a classic interview question. The only “gotcha” is to try to do it in place, and to be careful for the null character.
//1 void reverse(char *str) {
//2 char * end = str;
//3 char tmp;
//4 if (str) {
//5 while (*end) {
//6 ++end;
//7 }
//8 --end;
//9 while (str < end) {
//10 tmp = *str;
//11 *str++ = *end;
//12 *end-- = tmp;
//13 }
//14 }
//15 }

public class problem2 
{
	
	//void reverse(char *str) 
	//{
	//char * end = str;
	//char tmp;
	//
	//if (str) 
	//{
	//  while (*end) 
	//  {
	//    ++end;
	//  }
	//  --end;
	//  while (str < end)
	//  {
	//    tmp = *str;
	//    *str++ = *end;
	//    *end-- = tmp;
	//   }
	//}
	//}

}
