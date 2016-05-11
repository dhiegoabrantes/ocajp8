package ocajp8.chapter3.questions.q30;

import java.time.LocalDate;
import java.time.Month;

public class Q30 {

	/*
	 * What is the output of the following code?
	 * 	LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
	 * 	System.out.println(date.getYear() + " " + date.getMonth() + " "
	 * 	+ date.getDayOfMonth());
	 * 
	 * 	A. 2018 APRIL 4
	 * 	B. 2018 APRIL 30
	 * 	C. 2018 MAY 10
	 * 	D. Another date.
	 * 	E. The code does not compile.
	 * 	F. A runtime exception is thrown.
	 * 
	 * 	Answer: F
	 */
	
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
		System.out.println(date.getYear() + " " + date.getMonth() + " "
		+ date.getDayOfMonth());
	}
	
	/*
	 * F. Java throws an exception if invalid date values are passed. There is no 40th day in
	 * April—or any other month for that matter.
	 */
	
}
