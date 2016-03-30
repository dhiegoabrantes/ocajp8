package ocajp8.chapter2.questions.q17;

public class Question17 {

	/*
	 * What is the output of the following code snippet?
	 * 
	 * 3:  boolean keepGoing = true;
	 * 4:  int result = 15, i = 10;
	 * 5:  do {
	 * 6: 	 i--;
	 * 7: 	 if(i==8) keepGoing = false;
	 * 8: 	 result -= 2;
	 * 9:  } while(keepGoing);
	 * 10: System.out.println(result);
	 * 
	 * A. 7
	 * B. 9
	 * C. 10
	 * D. 11 (ok)
	 * E. 15
	 * F. The code will not compile because of line 8.
	 */
	
	public static void main(String[] args) {
		boolean keepGoing = true;
		int result = 15, i = 10;
		do {
			i--;
			if (i == 8)
				keepGoing = false;
			result -= 2;
		} while (keepGoing);
		System.out.println(result);
	}
}
