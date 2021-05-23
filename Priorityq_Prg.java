package programs_java;

import java.util.PriorityQueue;

public class Priorityq_Prg {

	public static void main(String[] args )
	{
		 PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
		 pq1.add(8);
		 pq1.add(4);
		 pq1.add(27);
		 pq1.add(16);
		 pq1.add(28);
		 pq1.add(20);
		 System.out.println("The PriortyQueue pq1 is:\n" +pq1+"\n");
		 
		 if(pq1.contains(27))
			 System.out.println("pq1 has element 27 in it");
		 else
			 System.out.println("pq1 does not contain 27");
		 
		 System.out.println("The first element PriortyQueue pq1 is:\n" +pq1.peek()+"\n");
		 System.out.println("Displaying and removing first element PriortyQueue pq1 is:\n" +pq1.poll()+"\n");
		 pq1.remove(28);
		 pq1.remove(20);
		 
		 System.out.println("The pq1 after removing elements is:\n" +pq1+"\n");
		 System.out.println(pq1.comparator());
		 
		 
	}

}
