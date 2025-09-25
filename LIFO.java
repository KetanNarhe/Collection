package Collection;

public interface LIFO<E>
{
   boolean push(E o);
	                                
	E pop();        
	
	boolean isEmpty();
	                         
	int contains(E o);
	
	E peek();
	
	int size();
	
	String toString();   
	
	

	                
}
