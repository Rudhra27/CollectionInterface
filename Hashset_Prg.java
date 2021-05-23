package programs_java;

import java.util.HashSet;

public class Hashset_Prg {

	public static void main(String[] args)
	{
		HashSet<Integer> hs1 = new HashSet<Integer>();
		HashSet<Integer> hs2 = new HashSet<Integer>();
		
		hs1.add(10);
		hs1.add(20);
		hs1.add(10);
		hs1.add(40);
		System.out.println("The first HashSet is:\n"+hs1+"\n");
		System.out.println("The hashcode of first HashSet is:\n"+hs1.hashCode()+"\n");
		
		hs2.add(10);
		hs2.add(70);
		hs2.add(20);
		hs2.add(40);
		hs2.add(70);
		System.out.println("The Second HashSet is:\n"+hs2+"\n");
		
		if (hs2.containsAll(hs1))
			System.out.println("hs1 is a subset of hs2");
		else
			System.out.println("hs1 is a not subset of hs2");
		
		if (hs1.equals(hs2))
			System.out.println("hs1 is eqaual to hs2");
		else
			System.out.println("hs1 and hs2 are not equal");
		
		hs1.retainAll(hs2);
		System.out.println("Retaining the elements of hs2 in hs1:\n"+hs1+"\n");
		
		hs2.removeAll(hs1);
		System.out.println("Removing all elements of hs1 from hs2:\n"+hs2+"\n");
		
		System.out.println("The first HashSet hs1 is:\n"+hs1+"\n");
		System.out.println("The second HashSet hs2 is:\n"+hs2+"\n");
        
		hs1.remove(20);
		hs1.remove(10);
		System.out.println("The first HashSet hs1 after removing elements is:\n"+hs1);

	}

}
