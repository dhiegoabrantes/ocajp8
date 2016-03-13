package ocajp8.chapter1.questions.q15;

public class Question15 {

	/*
	 * You can add underscores anywhere except at the beginning of a literal,
	 * the end of a literal, right before a decimal point, or right after a
	 * decimal point
	 */

//	 int i1 = 1_234;
//	 double d1 = 1_234_.0;
//	 double d2 = 1_234._0;
//	 double d3 = 1_234.0_;
//	 double d4 = 1_234.0;

}

/*
 * 15. Which of the following lines of code compile? (Choose all that apply)
 */

// A. int i1 = 1_234; (correct!)
// B. double d1 = 1_234_.0; (dont compile)
// C. double d2 = 1_234._0; (dont compile)
// D. double d3 = 1_234.0_; (dont compile)
// E. double d4 = 1_234.0; (correct!)
// F. None of the above.


/*
 * 15. A, E. Underscores are allowed as long as they are directly between two
 * other digits. This means options A and E are correct. Options B and C are
 * incorrect because the underscore is adjacent to the decimal point. Option D
 * is incorrect because the under- score is the last character.
 */