package ocajp8.chapter3.questions.q13;

public class Q13 {

	/*
	 * What is the result of the following code?
	 * 	StringBuilder b = "rumble";
	 * 	b.append(4).deleteCharAt(3).delete(3, b.length() - 1);
	 * 	System.out.println(b);
	 * 	
	 * 	A. rum
	 * 	B. rum4
	 * 	C. rumb4
	 * 	D. rumble4
	 * 	E. An exception is thrown.
	 * 	F. The code does not compile. (ok)
	 */
	
	public static void main(String[] args) {
//		StringBuilder b = "rumble";
//		b.append(4).deleteCharAt(3).delete(3, b.length() - 1);
//		System.out.println(b);
	}
	
	/*
	 * F. This is a trick question. The first line does not compile because you cannot
	 * assign a String to a StringBuilder. If that line were StringBuilder b = new
	 * StringBuilder("rumble"), the code would compile and print rum4. Watch out for this
	 * sort of trick on the exam. You could easily spend a minute working out the character 
	 * positions for no reason at all.
	 */
}
