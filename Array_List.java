package programs_java;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {
		int n = 5;
		ArrayList<Integer> Arr= new ArrayList<Integer>(n);
		ArrayList<Integer> Arr2=new ArrayList<Integer>(n);
		 for (int i = 1; i <= n; i++)
	            Arr.add(i);
		 System.out.println("The ArrayList after after adding elements is:\n"+Arr);
		 
		 Arr.add(0,0);
		 System.out.println("After adding 0 to 0th index:\n"+Arr);
		 
		 Arr.set(5, 6);
		 System.out.println("Replacing 6 to 5th index:\n"+Arr);
		 
		 Arr.remove(5);
		 System.out.println("Removing element at 5th index:\n"+Arr);
		 
		 System.out.println("The updated ArrayList is: ");
		 for (int i = 0; i < Arr.size(); i++) {
			  
	            System.out.println(Arr.get(i) + " ");
	        }
		 Arr2=Arr;
		 System.out.println("Removing all elements from Arr :");
		 Arr.removeAll(Arr2);
		 boolean ans = Arr.isEmpty();
	        if (ans == true)
	            System.out.println("The ArrayList is empty");
	        else
	            System.out.println("The ArrayList is :"+Arr);
	}

}
