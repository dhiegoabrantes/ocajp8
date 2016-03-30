package ocajp8.chapter2.questions.q14;

public class Question14 {

	/*
	 * What is the output of the following code snippet?
	 * 
	 * 3: int c = 7;
	 * 4: int result = 4;
	 * 5: result += ++c;
	 * 6: System.out.println(result);
	 * 
	 * A. 8
	 * B. 11
	 * C. 12 (ok)
	 * D. 15
	 * E. 16
	 * F. The code will not compile because of line 5.
	 */
	
	public static void main(String[] args) {
		 int c = 7;
		 int result = 4;
		 result += ++c;
		 System.out.println(result);
	}
}
