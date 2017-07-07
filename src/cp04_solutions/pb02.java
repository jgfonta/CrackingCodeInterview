package cp04_solutions;


//4.2 Given a directed graph, design an algorithm to find out whether there is a route between two nodes.
//_
//________________________________________________________________pg 124


//This problem can be solved by just simple graph traversal, such as depth first search or breadth first search. 
//We start with one of the two nodes and, during traversal, check if the other node is found. We should mark any
//node found in the course of the algorithm as ‘already visited’ to avoid cycles and repetition of the nodes.

//1 public enum State {
//2 Unvisited, Visited, Visiting;
//3 }
//4
//5 public static boolean search(Graph g, Node start, Node end) {
//6 LinkedList<Node> q = new LinkedList<Node>(); // operates as Stack
//7 for (Node u : g.getNodes()) {
//8 u.state = State.Unvisited;
//9 }
//10 start.state = State.Visiting;
//11 q.add(start);
//12 Node u;
//13 while(!q.isEmpty()) {
//14 u = q.removeFirst(); // i.e., pop()
//15 if (u != null) {
//16 for (Node v : u.getAdjacent()) {
//17 if (v.state == State.Unvisited) {
//18 if (v == end) {
//19 return true;
//20 } else {
//21 v.state = State.Visiting;
//22 q.add(v);
//23 }
//24 }
//25 }
//26 u.state = State.Visited;
//27 }
//28 }
//29 return false;
//30 }


public class pb02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
