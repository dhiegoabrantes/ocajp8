package ocajp8.chapter3.questions.q31;

import java.time.LocalDate;
import java.time.Month;

public class Q31 {

	/*
	 * What is the output of the following code?
	 * 	LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
	 * 	date.plusDays(2);
	 * 	date.plusYears(3);
	 * 	System.out.println(date.getYear() + " " + date.getMonth() + " "
	 * 	+ date.getDayOfMonth());
	 * 	
	 * 	A. 2018 APRIL 2
	 * 	B. 2018 APRIL 30
	 * 	C. 2018 MAY 2
	 * 	D. 2021 APRIL 2
	 * 	E. 2021 APRIL 30
	 * 	F. 2021 MAY 2
	 * 	G. A runtime exception is thrown.
	 * 
	 * 	Answer: B (LocalDate is immutable!)
	 */
	
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
		date.plusDays(2).plusYears(3);
		date.plusYears(3);
		System.out.println(date.getYear() + " " + date.getMonth() + " "
		+ date.getDayOfMonth());
	}
	
	/*
	 * B. The date starts out as April 30, 2018. Since dates are immutable and the plus methods have their return 
	 * values ignored, the result is unchanged. Therefore, option B is correct.
	 */
}
