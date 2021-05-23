package programs_java;

import java.util.LinkedHashSet;

public class LinkedHS {

	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> lhs1 = new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> lhs2 = new LinkedHashSet<Integer>();
		
		lhs1.add(40);
		lhs1.add(20);
		lhs1.add(10);
		lhs1.add(40);
		System.out.println("The first HashSet is:\n"+lhs1+"\n");
		System.out.println("The hashcode of first HashSet is:\n"+lhs1.hashCode()+"\n");
		
		lhs2.add(10);
		lhs2.add(70);
		lhs2.add(20);
		lhs2.add(40);
		lhs2.add(70);
		lhs2.add(80);
		System.out.println("The Second HashSet is:\n"+lhs2+"\n");
		
		if (lhs2.containsAll(lhs1))
			System.out.println("lhs1 is a subset of lhs2");
		else
			System.out.println("lhs1 is a not subset of lhs2");
		
		if (lhs1.equals(lhs2))
			System.out.println("lhs1 is eqaual to lhs2");
		else
			System.out.println("lhs1 and lhs2 are not equal");
		
		lhs1.retainAll(lhs2);
		System.out.println("Retaining the elements of hs2 in hs1:\n"+lhs1+"\n");
		
		lhs2.removeAll(lhs1);
		System.out.println("Removing all elements of hs1 from hs2:\n"+lhs2+"\n");
		
		System.out.println("The first HashSet hs1 is:\n"+lhs1+"\n");
		System.out.println("The second HashSet hs2 is:\n"+lhs2+"\n");
        
		lhs1.remove(20);
		System.out.println("The first HashSet hs1 after removing elements is:\n"+lhs1);


	}

}
