package ocajp8.chapter3.tips;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tips {
	static int y;

	/*
	 * Autoboxing
	 * 
	 * When you is using lists, in case of remove method, the java will use autoboxing only if
	 * you force it.
	 * 
	 * list.add(10);
	 * list.add(20);
	 * list.add(1);
	 * 
	 * list.remove(1) will remove the element index 1 instead the number "1".
	 * after this command, the list will be "[10, 1]"
	 * 
	 * 
	 */
	
	/*
	 * LocalDate, LocalTime, LocalDateTime
	 * 
	 *  The date and time classes are immutable, just like String was.
	 *  This means that we need to remember to assign the results of these methods to a reference 
	 *  variable so they are not lost.
	 */
	
	public static void main(String[] args) {

		String s = "Hello";
		String t = new String(s);
		if ("Hello".equals(s)) System.out.println("one");
		if (t == s) System.out.println("two");
		if (t.equals(s)) System.out.println("three");
		if ("Hello" == s) System.out.println("four");
		if ("Hello" == t) System.out.println("five");
		
	}

	public void dhiego() {
		int x;

	}

}
