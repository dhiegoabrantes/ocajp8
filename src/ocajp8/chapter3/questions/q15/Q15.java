package ocajp8.chapter3.questions.q15;

public class Q15 {

	/*
	 * Which of these array declarations is not legal? (Choose all that apply)
	 * 	A. int[][] scores = new int[5][];
	 * 	B. Object[][][] cubbies = new Object[3][0][5];
	 * 	C. String beans[] = new beans[6];
	 * 	D. java.util.Date[] dates[] = new java.util.Date[2][];
	 * 	E. int[][] types = new int[];	
	 * 	F. int[][] java = new int[][];
	 * 
	 * 	C, E, F
	 */
	
	public static void main(String[] args) {
//		int[][] scores = new int[5][];
//		Object[][][] cubbies = new Object[3][1][5];
//		String beans[] = new beans[6];
//		java.util.Date[] dates[] = new java.util.Date[2][];
//		int[][] types = new int[];
//		int[][] java = new int[][];
	}
	
	/*
	 * C, E, F. Option C uses the variable name as if it were a type, which is clearly illegal.
	 * Options E and F don’t specify any size. Although it is legal to leave out the size for later
	 * dimensions of a multidimensional array, the first one is required. Option A declares a
	 * legal 2D array. Option B declares a legal 3D array. Option D declares a legal 2D array.
	 * Remember that it is normal to see on the exam types you might not have learned. You
	 * aren’t expected to know anything about them.
	 */
}
