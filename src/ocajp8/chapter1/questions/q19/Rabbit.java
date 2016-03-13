package ocajp8.chapter1.questions.q19;

public class Rabbit { // 1
	public static void main(String[] args) { // 2
		Rabbit one = new Rabbit(); // 3
		Rabbit two = new Rabbit(); // 4
		Rabbit three = one; // 5
		one = null; // 6
		Rabbit four = one; // 7
		three = null; // 8
		two = null; // 9
		two = new Rabbit(); // 10
		System.gc(); // 11
	}
} // 12

/*
 * Suppose we have a class named Rabbit. Which of the following statements are
 * true? (Choose all that apply)
 */

//A. The Rabbit object from line 3 is first eligible for garbage collection immediately following line 6.
//B. The Rabbit object from line 3 is first eligible for garbage collection immediately following line 8. (ok)
//C. The Rabbit object from line 3 is first eligible for garbage collection immediately following line 12.
//D. The Rabbit object from line 4 is first eligible for garbage collection immediately following line 9. (ok)
//E. The Rabbit object from line 4 is first eligible for garbage collection immediately following line 11.
//F. The Rabbit object from line 4 is first eligible for garbage collection immediately following line 12.

/*
 * 19. B, D. The Rabbit object from line 3 has two references to it: one and
 * three. The references are nulled out on lines 6 and 8, respectively. Option
 * B is correct because this makes the object eligible for garbage collection
 * after line 8. Line 7 sets the reference four to the now null one, which means
 * it has no effect on garbage collection. The Rabbit object from line 4 only
 * has a single reference to it: two. Option D is correct because this single
 * reference becomes null on line 9. The Rabbit object declared on line 10
 * becomes eligible for garbage collection at the end of the method on line 12.
 * Calling System.gc() has no effect on eligibility for garbage collection.
 */