package Collection;

public class StackDriviver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LIFO<Integer>arr=new Stack<Integer>();
		
		System.out.println(arr.isEmpty());
		
	    arr.push(10);
	    arr.push(20);
	    arr.push(30);
	    arr.push(40);
	    arr.push(50);
	    
	    System.out.println(arr);
	    System.out.println(arr.isEmpty());
	    
	    
	    System.out.println(arr.pop());
	    System.out.println(arr);
	    System.out.println(arr.contains(10));
	    System.out.println(arr.contains(20));

		
	}

}
