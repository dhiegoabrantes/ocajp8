package ocajp8.chapter3.questions.q19;

import java.util.ArrayList;
import java.util.List;

public class Q19 {

	/*
	 * Which of the following are true? (Choose all that apply)
	 * 	A. Two arrays with the same content are equal.
	 * 	B. Two ArrayLists with the same content are equal.
	 * 	C. If you call remove(0) using an empty ArrayList object, it will compile successfully.
	 * 	D. If you call remove(0) using an empty ArrayList object, it will run successfully.
	 * 	E. None of the above.
	 * 
	 * 	Answer: A, B, C
	 */
	
	public static void main(String[] args) {
		
	}
	
	/*
	 * B, C. An array does not override equals() and so uses object equality. ArrayList does
	 * override equals() and defines it as the same elements in the same order. The compiler
	 * does not know when an index is out of bounds and thus can’t give you a compiler
	 * error. The code will throw an exception at runtime, though.
	 */
}
