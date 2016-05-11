package ocajp8.chapter3.questions.q24;

import java.util.List;

public class Q24 {

	/*
	 * What is the result of the following?
	 * 	6: String [] names = {"Tom", "Dick", "Harry"};
	 * 	7: List<String> list = names.asList();
	 * 	8: list.set(0, "Sue");
	 * 	9: System.out.println(names[0]);
	 * 	
	 * 	A. Sue
	 * 	B. Tom
	 * 	C. Compiler error on line 7. (ok)
	 * 	D. Compiler error on line 8.
	 * 	E. An exception is thrown.
	 */
	
	public static void main(String[] args) {
//		String [] names = {"Tom", "Dick", "Harry"};
//		List<String> list = names.asList();
//		list.set(0, "Sue");
//		System.out.println(names[0]);
	}
	
	/*
	 * C. Converting from an array to an ArrayList uses Arrays.asList(names). There is
	 * no asList() method on an array instance. If this code were corrected to compile, the
	 * answer would be option A.
	 */
}
