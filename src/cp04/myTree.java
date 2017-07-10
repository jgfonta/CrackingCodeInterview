package cp04;

import java.util.Comparator;

public class myTree <T> {

		public myNode<T> root;
		public Comparator<T> comp;   
		
		public myTree()
		{
			root = null;
			comp = new Comparator<T>()
			{
				public int compare(T element1, T element2)
			    {
					return ((Comparable)element1).compareTo(element2);
			    }
			};
		}
		
		public void add(T value)
		{
			myNode<T> newElement = new myNode<T>(value);
			myNode<T> currElement;
			if (root == null)
			{
				root = newElement;
				return;
			}

			currElement = root;
			while (currElement != null)
			{
				if (comp.compare(value, currElement.getInfo()) < 0)
			    {
					if (currElement.getLeft() == null)
					{
						currElement.setLeft(newElement);
					   currElement = null;
					}
					else
					{
						currElement = currElement.getLeft();
					}
			    }
	
				else
				{
					if (currElement.getRight() == null)
					{
						currElement.setRight(newElement);
					   currElement = null;
					}
					else
					{
						currElement = currElement.getRight();
					}
	
				}
			}
		}

	
}
