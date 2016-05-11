package ocajp8.chapter3.tips;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Chapter3ArrayListTips {

	/*
	 * ARRAYLIST
	 * 
	 * - Converting Array to ArrayList
	 * 
	 * 20: String[] array = { "hawk", "robin" }; // [hawk, robin] 
	 * 21: List<String> list = Arrays.asList(array); // returns fixed size list 
	 * 22: System.out.println(list.size()); // 2 
	 * 23: list.set(1, "test"); // [hawk, test] 
	 * 24: array[0] = "new"; // [new, test] 
	 * 25: for (String b : array) System.out.print(b + " "); // new test 
	 * 26: list.remove(1); // throws UnsupportedOperation Exception
	 * 
	 * - The ArrayList returned by Arrays.asList(array) is a private class of
	 * Arrays class. So, it does not supports the remove method
	 * 
	 * - Converting ArrayList to Array
	 *
	 * - list.toArray() returns Object[] - list.toArray([type]) returns an array of type [type]
	 *
	 * ArrayList<String> arrayList = new ArrayList<>(); 
	 * arrayList.add("A");
	 * arrayList.add("B"); 
	 * arrayList.add("C");
	 * 
	 * String[] array = null; 
	 * array = arrayList.toArray(new String[5]);
	 * System.out.println(Arrays.toString(array)); //prints [A, B, C, null, null]
	 *
	 * String[] array = null; array = arrayList.toArray(new String[0]);
	 * System.out.println(Arrays.toString(array)); //prints [A, B, C]
	 */

	public static void main(String[] args) {

		// int ar[][] = {{1,0},{-4},{3,1}};
		//
		// f1: for(int[] a : ar){
		// for(int x = 0; x < a.length; x++){
		// if(a[x] < 0) break;
		// System.out.println(a[x]);
		// }
		// }

		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(11, 12, 34);
		LocalDateTime dateTime = LocalDateTime.of(date, time);

		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
//		System.out.println(dateTime.format(shortDateTime));
//		System.out.println(date.format(shortDateTime));
//		System.out.println(time.format(shortDateTime));
		System.out.println(
				shortDateTime.format(time)); // UnsupportedTemporalTypeException

	}
}
