package programs_java;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Prg {

	public static void main(String[] args)
	{
		TreeSet<String> Ts1= new TreeSet<String>();
		Ts1.add("A");
		Ts1.add("B");
		Ts1.add("A");
		Ts1.add("C");
		Ts1.add("Z");
		Ts1.add("D");
		Ts1.add("E");
		System.out.println("The TreeSet Ts1 is:\n"+Ts1+"\n");
		System.out.println("The hashcode of TreeSet Ts1 is:\n"+Ts1.hashCode()+"\n");
		
		System.out.println("The First element of TreeSet Ts1 is:\n"+Ts1.first()+"\n");
		System.out.println("The Last element of TreeSet Ts1 is:\n"+Ts1.last()+"\n");
		
		String val="C";
		System.out.println("Higher of C is:\n"+Ts1.higher(val)+"\n");
		System.out.println("Lower of C is:\n"+Ts1.lower(val)+"\n");
		
		String Value="D";
		System.out.println("Ceiling of D is:\n"+Ts1.ceiling(Value)+"\n");
		System.out.println("Floor of D is:\n"+Ts1.floor(Value)+"\n");
		
		String check="F";
		System.out.println("Ts1 contains F:\n"+Ts1.contains(check)+"\n");
		
		System.out.println("The headset of D is:\n"+Ts1.headSet(Value)+"\n");
		System.out.println("The tailset of D is:\n"+Ts1.tailSet(Value)+"\n");
		
		Ts1.remove("B");
		Ts1.pollFirst();
		System.out.println("The TreeSet Ts1 after removing First element and B is:\n"+Ts1+"\n");
		Ts1.pollLast();
		System.out.println("The TreeSet Ts1 after removing Last element is:\n"+Ts1+"\n");
		System.out.println("The descendingset of Ts1 is:\n"+Ts1.descendingSet()+"\n");
			
		System.out.println("Traversing Treeset Ts1 using iterator:");
		Iterator<String> itr=Ts1.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next()); 
		}
		System.out.println("Traversing reversed order of Treeset Ts1 using iterator:");
		Iterator<String> ditr=Ts1.descendingIterator();  
		while(ditr.hasNext())
		{  
		System.out.println(ditr.next()); 
		}
	}
	}
