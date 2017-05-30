package cp03_solutions;

//3.2 How would you design a stack which, in addition to push and pop, 
//also has a function min which returns the minimum element? Push, pop 
//and min should all operate in O(1) time.
//pg 52
//SOLUTION
//You can implement this by having each node in the stack keep track 
//of the minimum beneath itself. Then, to find the min, you just look 
//at what the top element thinks is the min.
//When you push an element onto the stack, the element is given the 
//current minimum. It sets its “local min” to be the min.
//1 public class StackWithMin extends Stack<NodeWithMin> {
//2 public void push(int value) {
//3 int newMin = Math.min(value, min());
//4 super.push(new NodeWithMin(value, newMin));
//5 }
//6
//7 public int min() {
//8 if (this.isEmpty()) {
//9 return Integer.MAX_VALUE;
//10 } else {
//11 return peek().min;
//12 }
//13 }
//14 }
//15
//16 class NodeWithMin {
//17 public int value;
//18 public int min;
//19 public NodeWithMin(int v, int min){
//20 value = v;
//21 this.min = min;
//22 }
//23 }
//There’s just one issue with this: if we have a large stack, we waste a lot 
//of space by keeping track of the min for every single element. Can we do better?
//We can (maybe) do a bit better than this by using an additional stack which 
//keeps track of the mins.
//1 public class StackWithMin2 extends Stack<Integer> {
//2 Stack<Integer> s2;
//3 public StackWithMin2() {
//4 s2 = new Stack<Integer>();
//5 }
//6 public void push(int value){
//7 if (value <= min()) {
//8 s2.push(value);
//9 }
//10 super.push(value);
//11 }
//12 public Integer pop() {
//13 int value = super.pop();
//14 if (value == min()) {
//15 s2.pop();
//16 }
//17 return value;
//18 }
//19 public int min() {
//20 if (s2.isEmpty()) {
//21 return Integer.MAX_VALUE;
//22 } else {
//23 return s2.peek();
//24 }
//25 }
//26 }
//Why might this be more space efficient? If many elements have the same local min, 
//then we’re keeping a lot of duplicate data. By having the mins kept in a separate 
//stack, we don’t have this duplicate data (although we do use up a lot of extra space 
//because we have a stack node instead of a single int).
//		
		
public class solution2 {

}
