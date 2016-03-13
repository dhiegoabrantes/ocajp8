package ocajp8.chapter1.questions.q02;

public class WaterBottle { // Line 1
	private String brand; // Line 2
	private boolean empty; // Line 3

	public static void main(String[] args) { // Line 4
		WaterBottle wb = new WaterBottle(); // Line 5
		System.out.print("Empty = " + wb.empty); // Line 6
		System.out.print(", Brand = " + wb.brand); // Line 7
	}
} // Line 8

// What is the output of the following program?
// A. Line 6 generates a compiler error.
// B. Line 7 generates a compiler error.
// C. There is no output.
// D. Empty = false, Brand = null (correct)
// E. Empty = false, Brand =
// F. Empty = null, Brand = null

/*
 * 2. D. Boolean fields initialize to false and references initialize to null, so
 * empty is false and brand is null. Brand = null is output.
 */