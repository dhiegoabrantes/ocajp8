package ocajp8.chapter2.questions.q11;

public class Question11 {

	/*
	 * What is the output of the following code?
	 * 
	 * 1: public class ArithmeticSample {
	 * 2: 	public static void main(String[] args) {
	 * 3: 		int x = 5 * 4 % 3;
	 * 4: 		System.out.println(x);
	 * 5: 	}}
	 * 
	 * A. 2 (ok)
	 * B. 3
	 * C. 5 
	 * D. 6
	 * E. The code will not compile because of line 3.
	 */
	
	public static void main(String[] args) {
		float x = 5 * 4 % 3;
		//(5 * 4) % 3
		//20 % 3 (mod)
		//2
		System.out.println(x);
	}
}
