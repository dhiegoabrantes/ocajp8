package ocajp8.chapter3.questions.q01;

public class Fish {

	/*
	 * 1: public class Fish {
	 * 2: public static void main(String[] args) {
	 * 3: int numFish = 4;
	 * 4: String fishType = "tuna";
	 * 5: String anotherFish = numFish + 1;
	 * 6: System.out.println(anotherFish + " " + fishType);
	 * 7: System.out.println(numFish + " " + 1);
	 * 8: } }
	 * 
	 * A. 4 1
	 * B. 41
	 * C. 5
	 * D. 5 tuna
	 * E. 5tuna
	 * F. 51tuna
	 * G. The code does not compile. (correct)
	 */
	
	public static void main(String[] args) {
//		int numFish = 4;
//		String fishType = "tuna";
//		String anotherFish = numFish + 1;
//		System.out.println(anotherFish + " " + fishType);
//		System.out.println(numFish +  " " + 1);
	}
	
	
	/*
	 * G. Line 5 does not compile. This question is checking to see if you are paying attention
	 * to the types. numFish is an int and 1 is an int. Therefore, we use numeric addition and
	 * get 5. The problem is that we can’t store an int in a String variable. Supposing line 5
	 * said String anotherFish = numFish + 1 + "";. In that case, the answer would be
	 * options A and D. The variable defined on line 5 would be the string "5", and both output 
	 * statements would use concatenation.
	 */
}
