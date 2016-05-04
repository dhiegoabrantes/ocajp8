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
	 * 	int array[][] = new int[2][]; //results in...
	 * 	--> array[0] = null;
	 * 	--> array[1] = null;
	 * 
	 * 	int array[][] = new int[2][3];
	 * 	--> array[0] = [0, 0, 0]
	 * 	--> array[1] = [0, 0, 0]
	 * 
	 * 
	 * 	Valid array declarations:
	 * 		int[] numAnimals;
	 * 		int [] numAnimals2;
	 * 		int numAnimals3[];
	 * 		int numAnimals4 [];
	 * 
	 * 	int[] ids, types; //ids and types are int[]
	 * 	int ids[], types; //ids is int[] and types is int
	 * 
	 * 
	 * 	The equals() does not look at the array elements!
	 * 
	 * 
	 * 	3: String[] strings = { "stringValue" };
	 * 	4: Object[] objects = strings;
	 * 	5: String[] againStrings = (String[]) objects;
	 * 	6: againStrings[0] = new StringBuilder(); // DOES NOT COMPILE
	 * 	7: objects[0] = new StringBuilder(); // careful!
	 * 
	 * 	Be careful with line 7! StringBuilder is a object and the "objects" is object array,
	 * 	BUT him points to "strings" variable, that is String[]. 
	 * 	At runtime, the code throws an ArrayStoreException!
	 * 
	 * 
	 * 	- The length() does not consider what is in the array, but how many slots have been allocated!
	 * 
	 * 
	 * 	- SORTING
	 * 		Arrays is the firts class provided by Java we have used that requires an import!
	 * 		To import it:
	 * 
	 * 		import java.util.* // import whole package including Arrays
	 * 		import java.util.Arrays; // import just Arrays
	 * 	
	 * 		int[] numbers = { 6, 9, 1 };
	 * 		Arrays.sort(numbers);
	 * 		for (int i = 0; i < numbers.length; i++)
	 * 			System.out.print (numbers[i] + " ");
	 * 		//prints 1, 6, 9
	 * 
	 * 		String[] strings = { "10", "9", "100" };
	 * 		Arrays.sort(strings);
	 * 		for (String string : strings)
	 * 			System.out.print(string + " ");
	 * 		//prints 10, 100, 9
	 * 
	 * 		String sorts in alphabetic order! (Number sorts before letters and uppercase sorts before lowercase)
	 * 
	 * 
	 * 	- SEARCHING
	 * 		Java also provides a convenient way to search—but only if the array is already sorted.
	 * 
	 * 		- If target element was found, index of match is returned
	 * 		- If target element was not found, a negative value is returned indicating where a match needs to be 
	 * 			inserted to preserve sorted order
	 * 		
	 * 		- The return of binarySearch is: (real index negated) - 1
	 * 		- real index = 3 -> -3 -1 = -4 
	 * 	
	 * 
	 * 	- MULTIDIMENSIONAL ARRAY
	 * 		int[][] vars1; // 2D array
	 * 		int vars2 [][]; // 2D array
	 * 		int[] vars3[]; // 2D array
	 * 		int[] vars4 [], space [][]; // a 2D AND a 3D array
	 * 
	 * 		int[][][][][] array = new int[5][][][][]; //OK!
	 * 
	 * 		int[][] differentSize = {{1, 4}, {3}, {9,8,7}}; //is the same of...
	 * 
	 * 		int [][] args = new int[4][];
	 * 		args[0] = new int[5];
	 * 		args[1] = new int[3];
	 * 		
	 */
	
	
	public static void main(String[] args) {
		int[][] differentSize = {{1, 4}, {3}, {9,8,7}};
		differentSize[0] = new int[3];
		
		
		System.out.println(differentSize);
	}
}
