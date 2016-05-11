package ocajp8.chapter3.questions.q08;

public class Q08 {

	/*
	 * Which are the results of the following code? (Choose all that apply)
	 * 	String numbers = "012345678";
	 * 	System.out.println(numbers.substring(1, 3));
	 * 	System.out.println(numbers.substring(7, 7));
	 * 	System.out.println(numbers.substring(7));
	 * 
	 * 	A. 12
	 * 	B. 123
	 * 	C. 7
	 * 	D. 78
	 * 	E. A blank line.
	 * 	F. An exception is thrown.
	 * 	G. The code does not compile.
	 * 
	 * 	Answer: A, D, E
	 */
	
	public static void main(String[] args) {
		String numbers = "012345678";
		System.out.println(numbers.substring(1, 3));
		System.out.println(numbers.substring(7, 7));
		System.out.println(numbers.substring(7));
	}
	
	/*
	 * A, D, E. substring() has two forms. The first takes the index to start with and the
	 * index to stop immediately before. The second takes just the index to start with and
	 * goes to the end of the String. Remember that indexes are zero based. The first call
	 * starts at index 1 and ends with index 2 since it needs to stop before index 3. The second call 
	 * starts at index 7 and ends in the same place, resulting in an empty String.
	 * This prints out a blank line. The final call starts at index 7 and goes to the end of the String.
	 */
}
