package programs_java;

import java.util.*; 
public class Linked_List {

	public static void main(String[] args)
	{
		LinkedList<String> List1=new LinkedList<String>();
		LinkedList<String> List2=new LinkedList<String>();
		//adding elements to LinkedList
		List1.add("Program");
		List1.add("is");
		List1.add("Example");
		List1.add("for");
		System.out.println("The first Linkedlist is:\n" +List1+"\n");
		
		List1.add(2,"an");
		List1.addFirst("This");
		List1.addLast("LinkedList");
		System.out.println("The first Linkedlist after adding elements is:\n" +List1+"\n");
		
		List1.set(6, "LINKED_LIST");
		System.out.println("The first Linkedlist after changing the string at 6th index is:\n" +List1+"\n");
		
		List2=List1;
		System.out.println("The Second Linkedlist is:\n" +List2+"\n");
		//removing elements from LinkedList
		List2.remove("an");
		List2.remove(2);
		List2.removeFirst();
		List2.removeLast();
		System.out.println("The Second Linkedlist after removing elements is:\n" +List2+"\n");
		
		System.out.println("Getting First element from 2nd Linkedlist using peek method:\n" +List2.peekFirst()+"\n");
		System.out.println("Getting last element from 2nd Linkedlist using peek method:\n" +List2.peekLast()+"\n");
		
		System.out.println("Removing and displaying First element from 2nd Linkedlist using poll method:\n" +List2.pollFirst()+"\n");
		System.out.println("Removing and displaying Last element from 2nd Linkedlist using poll method:\n" +List2.pollLast()+"\n");
		System.out.println("The 2nd LinkedList after removing elements using poll is:\n"+List2+"\n");  
		
		List2.offerFirst("Program");
		List2.offerLast("LinkedList");
		List2.set(1,"for");
		System.out.println("The Updated 2nd LinkedList is :");  
		Iterator<String> itr=List2.iterator();  
		while(itr.hasNext()){  
		System.out.print(itr.next()+" ");  

		}	
			
	}

}
