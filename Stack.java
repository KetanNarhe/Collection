package Collection;

import java.util.Queue;
import java.util.*;

public class Stack<E> implements LIFO<E>{
	
	ArrayList<E> list;

	public Stack()
	{
		list=new ArrayList<>();
	}

	@Override
	public boolean push(E o) {
		// TODO Auto-generated method stub
		return list.add(o);
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		
		E ele=list.get(list.size()-1);
		list.remove(list.size()-1);		
		return ele;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return list.isEmpty();
	}

	@Override
	public int contains(E o) {
		// TODO Auto-generated method stub
		int index=list.indexOf(o);
		if(index==-1)
		{
			return index;
		}
		return index+1;
	}

	

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return list.get(list.size()-1);
	}   
	

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return list.size();
	}
	
	
	public String toString()
	{
		return list.toString();
		
	}
	
	
	

}
