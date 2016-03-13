package ocajp8.chapter1.questions.q20;

public class Bear {

	protected void finalize() {
		System.out.println("Roar!");
	}

	public static void main(String[] args) {
		Bear bear = new Bear();
		bear = null;
		System.gc();
	}

}


//Remember, finalize() is only run when the object is eligible for garbage collection.

/*
 * 20. What is true about the following code? (Choose all that apply)
 */

//A. finalize() is guaranteed to be called.
//B. finalize() might or might not be called (ok)
//C. finalize() is guaranteed not to be called.
//D. Garbage collection is guaranteed to run.
//E. Garbage collection might or might not run. (ok)
//F. Garbage collection is guaranteed not to run.
//G. The code does not compile.


/*
 * 20. B, E. Calling System.gc() suggests that Java might wish to run the
 * garbage collector. Java is free to ignore the request, making option E
 * correct. finalize() runs if an object attempts to be garbage collected,
 * making option B correct.
 */