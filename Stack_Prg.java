package programs_java;

import java.util.Stack;

public class Stack_Prg {

	public static void main(String[] args)
	{
		Stack<String> S1 = new Stack<String>(); 
		Stack<String> S2 = new Stack<String>();; 
		S1.push("It");
		S1.push("is");
		S1.push("a");
		S1.push("Program");
		S1.add("for");
		S1.add(3, "Sample");
		S1.push("Stack");
		System.out.println("The stack S1 is:\n" +S1+"\n");
		
		System.out.println("the capacity of Stack S1 is\n"+S1.capacity()+"\n");
		System.out.println("The hashcode of Stack S1 is:\n" +S1.hashCode()+"\n");
		
		S2=S1;
		System.out.println("The stack S2 is:\n" +S2+"\n");
		
		if(S2.equals(S1))
			System.out.println("The stacks S1 and S2 are equal\n");
		else
			System.out.println("The stacks S1 and S2 are Not equal\n");
		
		System.out.println("The top or Head of the stack S1 is:\n" +S1.peek()+"\n");
		System.out.println("The stack element popped from S1 is is:\n" +S1.pop()+"\n");

		System.out.println("The stack S1 is:\n" +S1+"\n");
	}

}
