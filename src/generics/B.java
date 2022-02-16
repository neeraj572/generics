package generics;

import java.util.*;

public class B {
	public static void main(String[] args) {
		List<A> list=new ArrayList<A>();
		A a1=new A(1,"neeraj", "kumar","bettiah");
		A a2=new A(2,"sonalal","prasad","ludhiana");
		A a3=new A(3,"ramita","devi","ludhiana");
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
	     for(A a:list) {
	    	System.out.println( a.getId());
	    	System.out.println(a.getFirstName());
	    	System.out.println(a.getLastName());
	    	System.out.println(a.getCity());
	    	System.out.println();
	     }
	}

}
