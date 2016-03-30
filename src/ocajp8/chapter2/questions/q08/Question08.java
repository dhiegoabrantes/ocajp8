package ocajp8.chapter2.questions.q08;

public class Question08 {

	/*
	 * What is the output of the following code snippet?
	 * 
	 * 3: boolean x = true, z = true;
	 * 4: int y = 20;
	 * 5: x = (y != 10) ^ (z=false);
	 * 6: System.out.println(x+", "+y+", "+z);
	 * 
	 * A. true, 10, true
	 * B. true, 20, false (ok)
	 * C. false, 20, true
	 * D. false, 20, false
	 * E. false, 20, true
	 * F. The code will not compile because of line 5.
	 */
	
	public static void main(String[] args) {
		boolean x = true, z = true;
		int y = 20;
		x = (y != 10) ^ (z=false); // true ^ false == true
		System.out.println(x+", "+y+", "+z);
	}
	
}
