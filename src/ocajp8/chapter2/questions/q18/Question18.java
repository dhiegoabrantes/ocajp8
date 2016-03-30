package ocajp8.chapter2.questions.q18;

public class Question18 {

	/*
	 * What is the output of the following code snippet?
	 * 
	 * 3: int count = 0;
	 * 4: ROW_LOOP: for(int row = 1; row <=3; row++)
	 * 5: 	for(int col = 1; col <=2 ; col++) {
	 * 6: 		if(row * col % 2 == 0) continue ROW_LOOP;
	 * 7: 		count++;
	 * 8: }
	 * 9: System.out.println(count);
	 * 
	 * A. 1
	 * B. 2 (ok)
	 * C. 3
	 * D. 4
	 * E. 6
	 * F. The code will not compile because of line 6.
	 */
	
	public static void main(String[] args) {
		int count = 0;
		ROW_LOOP: for (int row = 1; row <= 3; row++)
			for (int col = 1; col <= 2; col++) {
				if (row * col % 2 == 0)
					continue ROW_LOOP; //has the same effect of alone 'break'
				count++;
			}
		System.out.println(count);
	}
}
