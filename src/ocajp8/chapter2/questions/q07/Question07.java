package ocajp8.chapter2.questions.q07;

public class Question07 {

	/*
	 * What is the output of the following code?
	 * 
	 * 1: public class TernaryTester {
	 * 2: public static void main(String[] args) {
	 * 3: int x = 5;
	 * 4: System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7); 
	 * 5: }}
	 * 
	 * A. 5
	 * B. 4
	 * C. 10
	 * D. 8 (ok)
	 * E. 7
	 * F. The code will not compile because of line 4.
	 */
	
	public static void main(String[] args) {
		int x = 5;
		System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);
		
		//( x > 2 ? ( x < 4 ? 10 : 8 ) : 7 )
	}
	
}
