package cp03_solutions;

//3.1 Describe how you could use a single array to implement three stacks.
//pg 52
//SOLUTION
//Approach 1:
//Divide the array in three equal parts and allow the individual stack to grow 
//in that limited space (note: �[� means inclusive, while �(� means exclusive of the end point).
//��for stack 1, we will use [0, n/3)
//��for stack 2, we will use [n/3, 2n/3)
//��for stack 3, we will use [2n/3, n)
//This solution is based on the assumption that we do not have any extra information 
//about the usage of space by individual stacks and that we can�t either modify or use 
//any extra space. With these constraints, we are left with no other choice but to divide equally.
//1 int stackSize = 300;
//2 int[] buffer = new int [stackSize * 3];
//3 int[] stackPointer = {0, 0, 0}; // stack pointers to track top elem
//4
//5 void push(int stackNum, int value) {
//6 /* Find the index of the top element in the array + 1, and
//7 * increment the stack pointer */
//8 int index = stackNum * stackSize + stackPointer[stackNum] + 1;
//9 stackPointer[stackNum]++;
//10 buffer[index] = value;
//11 }
//12
//13 int pop(int stackNum) {
//14 int index = stackNum * stackSize + stackPointer[stackNum];
//15 stackPointer[stackNum]--;
//16 int value = buffer[index];
//17 buffer[index]=0;
//18 return value;
//19 }
//20
//21 int peek(int stackNum) {
//22 int index = stackNum * stackSize + stackPointer[stackNum];
//23 return buffer[index];
//24 }
//25
//26 boolean isEmpty(int stackNum) {
//27 return stackPointer[stackNum] == stackNum*stackSize;
//28 }
//
//Approach 2:
//In this approach, any stack can grow as long as there is any free space in the array.
//We sequentially allocate space to the stacks and we link new blocks to the previous block. 
//This means any new element in a stack keeps a pointer to the previous top element of that 
//particular stack.
//In this implementation, we face a problem of unused space. For example, if a stack deletes 
//some of its elements, the deleted elements may not necessarily appear at the end of the array. 
//So, in that case, we would not be able to use those newly freed spaces.
//To overcome this deficiency, we can maintain a free list and the whole array space would be 
//given initially to the free list. For every insertion, we would delete an entry from the free 
//list. In case of deletion, we would simply add the index of the free cell to the free list.
//In this implementation we would be able to have flexibility in terms of variable space 
//utilization but we would need to increase the space complexity.
//1 int stackSize = 300;
//2 int indexUsed = 0;
//3 int[] stackPointer = {-1,-1,-1};
//4 StackNode[] buffer = new StackNode[stackSize * 3];
//5 void push(int stackNum, int value) {
//6 int lastIndex = stackPointer[stackNum];
//7 stackPointer[stackNum] = indexUsed;
//8 indexUsed++;
//9 buffer[stackPointer[stackNum]]=new StackNode(lastIndex,value);
//10 }
//11 int pop(int stackNum) {
//12 int value = buffer[stackPointer[stackNum]].value;
//13 int lastIndex = stackPointer[stackNum];
//14 stackPointer[stackNum] = buffer[stackPointer[stackNum]].previous;
//15 buffer[lastIndex] = null;
//16 indexUsed--;
//17 return value;
//18 }
//19 int peek(int stack) { return buffer[stackPointer[stack]].value; }
//20 boolean isEmpty(int stackNum) { return stackPointer[stackNum] == -1; }
//21
//22 class StackNode {
//23 public int previous;
//24 public int value;
//25 public StackNode(int p, int v){
//26 value = v;
//27 previous = p;
//28 }
//29 }

public class solution1 {

}
