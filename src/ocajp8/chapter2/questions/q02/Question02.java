package ocajp8.chapter2.questions.q02;

public class Question02 {

	/*
	 * What data type (or types) will allow the following code snippet to compile? (Choose all that apply)
	 * 
	 * 
	 * byte x = 5;
	 * byte y = 10; 
	 * _____ z = x + y;
	 * 
	 * A. int
	 * B. long
	 * C. boolean
	 * D. double
	 * E. short
	 * F. byte
	 */
	
	
	public static void main(String[] args) {
		 byte x = 5;
		 byte y = 10; 
//		 int z = x + y; //(ok)
//		 long z = x + y; //(ok)
//		 boolean z = x + y; //não compila! type mismatch (int to boolean)
//		 double z = x + y; //(ok)
//		 short z = x + y; //não compila! operacao entre byte resulta em int. tipo int é maior que short
//		 byte z = x + y; //não compila! operacao entre byte resulta em int. tipo int é maior que byte
	}
	
	
}
