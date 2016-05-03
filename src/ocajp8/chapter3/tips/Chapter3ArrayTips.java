package ocajp8.chapter3.tips;

public class Chapter3ArrayTips {

	/*
	 * ARRAYS
	 * 
	 * 	- When using this form to instantiate an array, set all the elements to the default value for that type.
	 * 	int[] numbers1 = new int[3];
	 * 
	 * 	int[] numbers2 = new int[] {42, 55, 99}; // is the same of above
	 * 	int[] numbers2 = {42, 55, 99};
	 * 
	 * 	int[] numbers2 = new int[3] {42, 55, 99}; // COMPILE ERROR!
	 * 	
	 * 
	 * 	Valid array declarations:
	 * 		int[] numAnimals;
	 * 		int [] numAnimals2;
	 * 		int numAnimals3[];
	 * 		int numAnimals4 [];
	 */
	
	
	public static void main(String[] args) {
		int[] numbers2 = new int[] {42, 55, 99};
	}
}
