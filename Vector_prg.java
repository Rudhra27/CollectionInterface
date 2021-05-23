package programs_java;

import java.util.Vector;

public class Vector_prg {

	public static void main(String[] args) {
		Vector<Integer> V1 = new Vector<Integer>(4); 
		Vector<Integer> V2 = new Vector<Integer>(4); 
		V1.add(1); 
		V1.add(2); 
		V1.add(3);
		V1.add(3,3);
		System.out.println("The first Vector is:\n" +V1+"\n");
		
		V1.set(3,4);
		System.out.println("The first Vector after changing 4th element is:\n" +V1+"\n");
		
		System.out.println("The capacity of first Vector is:\n" +V1.capacity()+"\n");
		System.out.println("The hashcode of first Vector is:\n" +V1.hashCode()+"\n");
		
		V1.ensureCapacity(5);
		System.out.println("Now The capacity of first Vector is:\n" +V1.capacity()+"\n");
		
		V2.addAll(V1);
		System.out.println("The Second Vector is:\n" +V2+"\n");
		V2.ensureCapacity(10);
		System.out.println("The capacity of second Vector is:\n" +V2.capacity()+"\n");
	
		V2.add(4,5);
		V2.add(5,6);
		V2.add(6,7);
		V2.add(7,8);
		V2.add(8,9);
		V2.add(9,10);
		System.out.println("Now The Second Vector is:\n" +V2+"\n");
		
		if(V2.containsAll(V1))
		{
			System.out.println("V1 is a subset of V2");
		}
		else
			System.out.println("V1 is Not a subset of V2");
		
		V2.removeAll(V1);
		V2.remove(4);
		V2.removeElementAt(4);
		System.out.println("The Second Vector after removing elements is:\n" +V2+"\n");
		
		V2.removeAllElements();
		if (V2.isEmpty())
		{
			System.out.println("All elements from V2 are removed");
			System.out.println("Now the capacity of V2 is\n"+V2.capacity()+"\n");
		}
		else
			System.out.println("The Second Vector is:\n" +V2+"\n");
		
		V2.ensureCapacity(5);
		V2.add(3);
		V2.add(5);
		System.out.println("The Second Vector is:\n" +V2+"\n");
		System.out.println("The First Vector is:\n" +V1+"\n");
		V1.retainAll(V2);
		System.out.println("The First Vector after retaining elements From V2 is:\n" +V1+"\n");
		
		

		
	}

}
