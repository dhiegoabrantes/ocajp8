package ocajp8.chapter3.questions.q14;

public class Q14 {

	/*
	 * Which of the following can replace line 4 to print "avaJ"? (Choose all that apply)
	 * 	3: StringBuilder puzzle = new StringBuilder("Java");
	 * 	4: // INSERT CODE HERE
	 * 	5: System.out.println(puzzle);
	 * 	
	 * 	A. puzzle.reverse(); (ok)
	 * 	B. puzzle.append("vaJ$").substring(0, 4);
	 * 	C. puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() - 1);
	 * 	D. puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length());
	 * 	E. None of the above.
	 */
	
	
	public static void main(String[] args) {
		StringBuilder puzzle = new StringBuilder("Java");
		puzzle.reverse();
		System.out.println(puzzle);
	}
	
	/*
	 * A, C. The reverse() method is the easiest way of reversing the characters in a StringBuilder; 
	 * therefore, option A is correct. Option B is a nice distraction—it does in fact
	 * return "avaJ". However, substring() returns a String, which is not stored anywhere.
	 * Option C uses method chaining. First it creates the value "JavavaJ$". Then it removes
	 * the first three characters, resulting in "avaJ$". Finally, it removes the last character,
	 * resulting in "avaJ". Option D throws an exception because you cannot delete the character after the last index. Remember that deleteCharAt() uses indexes that are zero
	 * based and length() counts starting with 1.
	 */
}
