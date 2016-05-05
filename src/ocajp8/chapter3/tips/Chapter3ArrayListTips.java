package ocajp8.chapter3.tips;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Chapter3ArrayListTips {

	/*
	 * ARRAYLIST
	 * 
	 * 	- Converting Array to ArrayList
	 * 
	 *	- Converting ArrayList to Array
	 *
	 *		ArrayList<String> arrayList = new ArrayList<>();
	 *		arrayList.add("A");
	 *		arrayList.add("B");
	 *		arrayList.add("C");
	 *		
	 *		String[] array = null;
	 *		array = arrayList.toArray(new String[5]);
	 *		System.out.println(Arrays.toString(array));
	 *		//prints [A, B, C, null, null]
	 *
	 *	 	String[] array = null;
	 *		array = arrayList.toArray(new String[0]);
	 *		System.out.println(Arrays.toString(array));
	 *		//prints [A, B, C]
	 */
	
	public static void main(String[] args) {
//		ArrayList<String> arrayList = new ArrayList<>();
//		arrayList.add("A");
//		arrayList.add("B");
//		arrayList.add("C");
//		
//		String[] array = null;
//		array = arrayList.toArray(new String[10]);
//		Arrays.asList(a)
//		System.out.println(Arrays.toString(array));
		
		
		String[] array = new String[5];
		array[0] = "gordim";
		
		
		List<String> list = Arrays.asList(array);
//		list.remove(0);
		
		
		ArrayList<String> aa = new ArrayList<>(Arrays.asList(array));
		aa.remove(0);
		
		System.out.println(list);
		System.out.println(aa);
		
	}
}
