package ocajp8.chapter3.questions.q21;

import java.util.ArrayList;

public class Q21 {

	/*
	 * What is the result of the following statements?
	 * 	3: ArrayList<Integer> values = new ArrayList<>();
	 * 	4: values.add(4);
	 * 	5: values.add(5);
	 * 	6: values.set(1, 6);
	 * 	7: values.remove(0);
	 * 	8: for (Integer v : values) System.out.print(v);
	 * 
	 * 	A. 4
	 * 	B. 5
	 * 	C. 6 (ok)
	 * 	D. 46
	 * 	E. 45
	 * 	F. An exception is thrown.
	 * 	G. The code does not compile.
	 */
	
	public static void main(String[] args) {
		ArrayList<Integer> values = new ArrayList<>();
		values.add(4);
		values.add(5);
		values.set(1, 6);
		values.remove(0);
		for (Integer v : values) System.out.print(v);
	}
	
	/*
	 * C. After line 4, values has one element (4). After line 5, values has two elements (4,
	 * 5). After line 6, values has two elements (4, 6) because set() does a replace. After line
	 * 7, values has only one element (6).
	 */
}
