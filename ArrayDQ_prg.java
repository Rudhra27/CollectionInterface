package programs_java;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDQ_prg {

	public static void main(String[] args)
	{
		 Deque<Integer> Adq = new ArrayDeque<Integer>(10);
		    Adq.add(5);
		    Adq.add(10);
		    Adq.add(8);
		    Adq.add(20);
		    Adq.add(4);
	        for (Integer element : Adq)
	        {
	            System.out.println("Element : " + element);
	        }
	   
	        System.out.println("Using clear()");
	        Adq.clear();
	        System.out.println("Above elements are removed now\n");
	        
	        Adq.addFirst(40);
	        Adq.addFirst(30);
	        Adq.add(50);
	        Adq.addLast(35);
	        Adq.addLast(25);
	        
	        System.out.println("Elements of deque using Iterator:");
	        for(Iterator<Integer> itr = Adq.iterator(); itr.hasNext();)
	        {
	            System.out.println(itr.next());
	        }
	 
	        System.out.println("Elements of deque in reverse order:");
	        for(Iterator<Integer> dItr = Adq.descendingIterator(); 
	                                               dItr.hasNext();)
	        {
	            System.out.println(dItr.next());
	        }
	   
	        System.out.println("Head Element using element():\n" +Adq.element()+"\n");

	        System.out.println("Head Element using getFirst():\n" +Adq.getFirst()+"\n");
	        System.out.println("Last Element using getLast():\n" + Adq.getLast()+"\n");
	   
	        Object[] arr = Adq.toArray();
	        System.out.println("Array Size :\n" + arr.length +"\n");
	   
	        System.out.print("Array elements :\n");
	        for(int i=0; i<arr.length ; i++)
	            System.out.println(" " + arr[i]);
	              
	        System.out.println("Head element :\n" + Adq.peek()+"\n");
	        System.out.println("Head element poll :\n" + Adq.poll()+"\n");
	         
	        Adq.push(360);
	        Adq.push(180);
	        Adq.push(270);
	        System.out.println("The updated Adq is:\n" +Adq+"\n"); 
	        System.out.println("Head element remove : " + Adq.remove()+"\n");
	        System.out.println("The final array is: "+Adq+"\n");
	  
	}

}
