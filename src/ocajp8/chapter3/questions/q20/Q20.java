package ocajp8.chapter3.questions.q20;

import java.util.ArrayList;
import java.util.List;

public class Q20 {

	/*
	 * What is the result of the following statements?
	 * 	6: List<String> list = new ArrayList<String>();
	 * 	7: list.add("one");
	 * 	8: list.add("two");
	 * 	9: list.add(7);
	 * 	10: for(String s : list) System.out.print(s);
	 * 	
	 * 	A. onetwo
	 * 	B. onetwo7
	 * 	C. onetwo followed by an exception
	 * 	D. Compiler error on line 9. (ok)
	 * 	E. Compiler error on line 10.
	 */
	
	public static void main(String[] args) {
//		List<String> list = new ArrayList<String>();
//		list.add("one");
//		list.add("two");
//		list.add(7);
//		for(String s : list) System.out.print(s);
	}
	
	/*
	 * D. The code does not compile because list is instantiated using generics. Only String
	 * objects can be added to list and 7 is an int.
	 */
}
