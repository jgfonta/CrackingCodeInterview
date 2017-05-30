package cp03_solutions;

//3.5 Implement a MyQueue class which implements a queue using two stacks.
//pg 52
//SOLUTION
//Since the major difference between a queue and a stack is the order 
//(first-in-first-out vs. last-in-first-out), we know that we need to modify 
//peek() and pop() to go in reverse order. We can use our second stack to 
//reverse the order of the elements (by popping s1 and pushing the elements 
//on to s2). In such an implementation, on each peek() and pop() operation, 
//we would pop everything from s1 onto s2, perform the peek / pop operation, 
//and then push everything back.
//This will work, but if two pop / peeks are performed back-to-back, we’re 
//needlessly moving elements. We can implement a “lazy” approach where we 
//let the elements sit in s2.
//s1 will thus be ordered with the newest elements on the top, while s2 will 
//have the oldest elements on the top. We push the new elements onto s1, and 
//peek and pop from s2. When s2 is empty, we’ll transfer all the elements from 
//s1 onto s2, in reverse order.
//1 public class MyQueue<T> {
//2 Stack<T> s1, s2;
//3 public MyQueue() {
//4 s1 = new Stack<T>();
//5 s2 = new Stack<T>();
//6 }
//7
//8 public int size() {
//9 return s1.size() + s2.size();
//10 }
//11
//12 public void add(T value) {
//13 s1.push(value);
//14 }
//15
//16 public T peek() {
//17 if (!s2.empty()) return s2.peek();
//18 while (!s1.empty()) s2.push(s1.pop());
//19 return s2.peek();
//20 }
//21
//22 public T remove() {
//23 if (!s2.empty()) return s2.pop();
//24 while (!s1.empty()) s2.push(s1.pop());
//25 return s2.pop();
//26 }
//27 }


public class solution5 {

}
