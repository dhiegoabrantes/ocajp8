package ocajp8.chapter3.questions.q07;

public class Q07 {

	/*
	 * Which are the results of the following code? (Choose all that apply)
	 * 	String letters = "abcdef";
	 * 	System.out.println(letters.length());
	 * 	System.out.println(letters.charAt(3));
	 * 	System.out.println(letters.charAt(6));
	 * 
	 * 	A. 5
	 * 	B. 6 (ok)
	 * 	C. c
	 * 	D. d (ok)
	 * 	E. An exception is thrown. (ok)
	 * 	F. The code does not compile.
	 * 
	 * 	Answer: B, D, E
	 */
	
	public static void main(String[] args) {
		String letters = "abcdef";
		System.out.println(letters.length());
		System.out.println(letters.charAt(3));
		System.out.println(letters.charAt(6));
	}
	
	/*
	 * B, D, E. length() is simply a count of the number of characters in a String. In this
	 * case, there are six characters. charAt() returns the character at that index. Remember
	 * that indexes are zero based, which means that index 3 corresponds to d and index 6
	 * corresponds to 1 past the end of the array. A StringIndexOutOfBoundsException is
	 * thrown for the last line.
	 */
}
