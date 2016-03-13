package ocajp8.chapter1.questions.q08;

public class BirdDisplay {
	public static void main(String[] name) {
		System.out.println(name[1]);
	}
}

/*
 * Given the following class, which of the following calls print out Blue Jay?
 * (Choose all that apply)
 */

//A. java BirdDisplay Sparrow Blue Jay (prints Blue)
//B. java BirdDisplay Sparrow "Blue Jay" (correct)
//C. java BirdDisplay Blue Jay Sparrow (prints Jay)
//D. java BirdDisplay "Blue Jay" Sparrow (prints Sparrow)
//E. java BirdDisplay.class Sparrow "Blue Jay" (erro)
//F. java BirdDisplay.class "Blue Jay" Sparrow (erro)
//G. Does not compile.

/*
 * 8. B. Option B is correct because arrays start counting from zero and strings
 * with spaces must be in quotes. Option A is incorrect because it outputs Blue.
 * C is incorrect because it outputs Jay. Option D is incorrect because it
 * outputs Sparrow. Options E and F are incorrect because they output Error:
 * Could not find or load main class Bird- Display.class.
 */