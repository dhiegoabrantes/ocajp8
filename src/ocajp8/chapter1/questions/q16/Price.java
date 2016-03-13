package ocajp8.chapter1.questions.q16;

public class Price {
	public void admission() {
		// int amount = 9L;
		// int amount = 0b101;
		// int amount = 0xE;
		// double amount = 0xE;
		// double amount = 1_2_.0_0;
		// int amount = 1_2_;
	}
}

/*
 * 16. Given the following class, which of the following lines of code can
 * replace INSERT CODE HERE to make the code compile? (Choose all that apply)
 */

// public class Price {
// public void admission() {
// INSERT CODE HERE
// System.out.println(amount);
// }}
// A. int amount = 9L; (dont compile)
// B. int amount = 0b101; (compile)
// C. int amount = 0xE; (compile)
// D. double amount = 0xE; (compile)
// E. double amount = 1_2_.0_0; (dont compile)
// F. int amount = 1_2_; (dont compile)
// G. None of the above. (incorrect)


/*
 * 16. B, C, D. 0b is the prefix for a binary value and is correct. 0x is the
 * prefix for a hexa- decimal value. This value can be assigned to many
 * primitive types, including int and double, making options C and D correct.
 * Option A is incorrect because 9L is a long value. long amount = 9L would be
 * allowed. Option E is incorrect because the under- score is immediately before
 * the decimal. Option F is incorrect because the underscore is the very last
 * character.
 */