package cp04;

public class myNode<T>
{
  public T info;                
  public myNode<T> left;      
  public myNode<T> right;      

  public myNode(T info)
  {
    this.info = info; 
    left = null;  
    right = null;
  }
 
  public void setInfo(T info)
  {
	  this.info = info;
  }
  
  public T getInfo()
  {
	  return info;
  }
  
  public void setLeft(myNode<T> link)
  {
	  left = link;
  }
  
  public void setRight(myNode<T> link)
  {
	  right = link;
  }
  
  public myNode<T> getLeft()
  {
	  return left;
  }
  public myNode<T> getRight()
  {
	  return right;
  }
  
}
