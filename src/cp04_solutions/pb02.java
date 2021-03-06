package cp04_solutions;
import java.util.*;


//4.2 Given a directed graph, design an algorithm to find out whether there is a route between two nodes.
//_
//________________________________________________________________pg 124


//This problem can be solved by just simple graph traversal, such as depth first search or breadth first search. 
//We start with one of the two nodes and, during traversal, check if the other node is found. We should mark any
//node found in the course of the algorithm as �already visited� to avoid cycles and repetition of the nodes.




public class pb02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public enum State 
	{
		Unvisited, Visited, Visiting;
	}

	public static boolean search(Graph g, Node start, Node end) 
	{
		LinkedList<Node> q = new LinkedList<Node>(); // operates as Stack
		for (Node u : g.getNodes()) 
		{
			u.state = State.Unvisited;
		}
		start.state = State.Visiting;
		q.add(start);
		Node u;
		while(!q.isEmpty()) 
		{
			u = q.removeFirst(); 
			if (u != null) 
			{
				for (Node v : u.getAdjacent()) 
				{
					if (v.state == State.Unvisited) 
					{
						if (v == end) 
						{
							return true;
						} 
						else 
						{
							v.state = State.Visiting;
							q.add(v);
						}
					}
				}
				u.state = State.Visited;
			}
		}
		return false;
	 }

}
