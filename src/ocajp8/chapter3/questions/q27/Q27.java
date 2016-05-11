package ocajp8.chapter3.questions.q27;

import java.util.ArrayList;
import java.util.List;

public class Q27 {

	/*
	 * What is the result of the following?
	 * 	List<String> one = new ArrayList<String>();
	 * 	one.add("abc");
	 * 	List<String> two = new ArrayList<>();
	 * 	two.add("abc");
	 * 	if (one == two)
	 * 	System.out.println("A");
	 * 	else if (one.equals(two))
	 * 	System.out.println("B");
	 * 	else
	 * 	System.out.println("C");
	 * 
	 * 	A. A
	 * 	B. B
	 * 	C. C
	 * 	D. An exception is thrown.
	 * 	E. The code does not compile.
	 * 
	 * 	Answer: B
	 */
	
	public static void main(String[] args) {
		List<String> one = new ArrayList<String>();
		one.add("abc");
		List<String> two = new ArrayList<>();
		two.add("abc");
		if (one == two)
		System.out.println("A");
		else if (one.equals(two))
		System.out.println("B");
		else
		System.out.println("C");
	}
	
	/*
	 * B. The first if statement is false because the variables do not point to the same object.
	 * The second if statement is true because ArrayList implements equality to mean the
	 * same elements in the same order.
	 */
}
