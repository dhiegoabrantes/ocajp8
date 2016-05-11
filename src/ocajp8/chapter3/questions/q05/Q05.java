package ocajp8.chapter3.questions.q05;

public class Q05 {

	/*
	 * What is the result of the following code?
	 * 2: String s1 = "java";
	 * 3: StringBuilder s2 = new StringBuilder("java");
	 * 4: if (s1 == s2)
	 * 5: System.out.print("1");
	 * 6: if (s1.equals(s2))
	 * 7: System.out.print("2");
	 * 
	 * A. 1
	 * B. 2
	 * C. 12
	 * D. No output is printed.
	 * E. An exception is thrown.
	 * F. The code does not compile. (correct) Incompatible operand types String and StringBuilder
	 */
	
	public static void main(String[] args) {
//		String s1 = "java";
//		StringBuilder s2 = new StringBuilder("java");
//		if(s1 == s2)
//			System.out.println("1");
//		
//		if(s1.equals(s2))
//			System.out.println("2");
	} 
	
	/*
	 * F. The question is trying to distract you into paying attention to logical equality versus
	 * object reference equality. It is hoping you will miss the fact that line 4 does not compile. 
	 * Java does not allow you to compare String and StringBuilder using ==.
	 */
	
}
