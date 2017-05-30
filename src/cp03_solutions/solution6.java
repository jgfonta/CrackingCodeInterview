package cp03_solutions;

//3.6 Write a program to sort a stack in ascending order. 
//You should not make any assumptions about how the stack is implemented. 
//The following are the only functions that should be used to write this 
//program: push | pop | peek | isEmpty.
//pg 52
//SOLUTION
//Sorting can be performed with one more stack. The idea is to pull an item from 
//the original stack and push it on the other stack. If pushing this item would 
//violate the sort order of the new stack, we need to remove enough items from 
//it so that it’s possible to push the new item. Since the items we removed are 
//on the original stack, we’re back where we started. The algorithm is O(N^2) 
//and appears below.
//1 public static Stack<Integer> sort(Stack<Integer> s) {
//2 Stack<Integer> r = new Stack<Integer>();
//3 while(!s.isEmpty()) {
//4 int tmp = s.pop();
//5 while(!r.isEmpty() && r.peek() > tmp) {
//6 s.push(r.pop());
//7 }
//8 r.push(tmp);
//9 }
//10 return r;
//11 }

public class solution6 {

}
