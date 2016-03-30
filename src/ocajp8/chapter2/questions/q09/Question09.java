package ocajp8.chapter2.questions.q09;

public class Question09 {

	/*
	 * How many times will the following code print "Hello World"?
	 * 3: for(int i=0; i<10 ; ) {
	 * 4: i = i++;
	 * 5: System.out.println("Hello World");
	 * 6: }
	 * 
	 * A. 9
	 * B. 10
	 * C. 11
	 * D. The code will not compile because of line 3.
	 * E. The code will not compile because of line 5.
	 * F. The code contains an infinite loop and does not terminate. (ok)
	 */
	
	public static void main(String[] args) {
		for(int i=0; i<10; ){
			i = i++;
			System.out.println("Hello World");
		}
	}
}
