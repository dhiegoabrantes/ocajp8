package ocajp8.chapter1.questions.q09;

public class Question9 {

	public static void main(String[] args) {
		System.out.println("Hello world!");
	}

}


/*
 * Which of the following legally fill in the blank so you can run the
 * main() method from the command line? (Choose all that apply)
 * public static void main( )
 */

//A. String[] _names (ok)
//B. String[] 123 (compilation error)
//C. String abc[] (ok)
//D. String _Names[] (ok)
//E. String... $n (ok)
//F. String names (code compiles, but dont runs)
//G. None of the above. (incorrect)

/*
 * 9. A, C, D, E. Option A is correct because it is the traditional main()
 * method signature and variables may begin with underscores. Options C and D
 * are correct because the array operator may appear after the variable name.
 * Option E is correct because varargs are allowed in place of an array. Option
 * B is incorrect because variables are not allowed to begin with a digit.
 * Option F is incorrect because the argument must be an array or varargs.
 * Option F is a perfectly good method. However, it is not one that can be run
 * from the command line because it has the wrong parameter type.
 */