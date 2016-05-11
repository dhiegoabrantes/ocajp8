package ocajp8.chapter3.questions.q11;

public class Q11 {

	/*
	 * What is the result of the following code?
	 * 	4: int total = 0;
	 * 	5: StringBuilder letters = new StringBuilder("abcdefg");
	 * 	6: total += letters.substring(1, 2).length();
	 * 	7: total += letters.substring(6, 6).length();
	 * 	8: total += letters.substring(6, 5).length();
	 * 	9: System.out.println(total);
	 * 
	 * 	A. 1
	 * 	B. 2
	 * 	C. 3
	 * 	D. 7
	 * 	E. An exception is thrown. (ok)
	 * 	F. The code does not compile.
	 */
	
	public static void main(String[] args) {
		int total = 0;
		StringBuilder letters = new StringBuilder("abcdefg");
		total += letters.substring(1, 2).length();
		total += letters.substring(6, 6).length();
		total += letters.substring(6, 5).length();
		System.out.println(total);
	}
	
	
	/*
	 * E. Line 6 adds 1 to total because substring() includes the starting index but not
	 * the ending index. Line 7 adds 0 to total. Line 8 is a problem: Java does not allow the
	 * indexes to be specified in reverse order and the code throws a StringIndexOutOfBoundsException.
	 */
}
