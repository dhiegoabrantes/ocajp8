package ocajp8.chapter2.questions.q19;

public class Question19 {

	
	/*
	 * What is the result of the following code snippet?
	 * 
	 * 3: int m = 9, n = 1, x = 0; 
	 * 4; while(m > n) {
	 * 5: 	m--;
	 * 6: 	n += 2;
	 * 7: 	x += m + n;
	 * 8: }
	 * 9: System.out.println(x);
	 * 
	 * A. 11
	 * B. 13
	 * C. 23
	 * D. 36 (ok)
	 * E. 50
	 * F. The code will not compile because of line 7.
	 */
	
	public static void main(String[] args) {
		int m = 9, n = 1, x = 0; 
		while(m > n) {
			m--;
			n += 2;
			x += m + n;
		}
		System.out.println(x);
	}
}
