package ocajp8.chapter1.tips;

public class Chapter1Tips {

	/*
	 * Primitive types
	 * 
	 * Keyword 		Type 							Example
	 * boolean 		true or false 					true
	 * byte 		8-bit integral value 			123
	 * short 		16-bit integral value 			123
	 * int 			32-bit integral value 			123
	 * long 		64-bit integral value 			123
	 * float 		32-bit floating-point value 	123.45f
	 * double 		64-bit floating-point value 	123.456
	 * char 		16-bit Unicode value 			'a'
	 * 
	 * - float and double are used for floating-point (decimal) values.
	 * - A float requires the letter f following the number so Java knows it is a float. 
	 * 		Because double is default type for floating-point.
	 * - byte, short, int, and long are used for numbers without decimal points.
	 * - Each numeric type uses twice as many bits as the smaller similar type. For example,
	 * short uses twice as many bits as byte does.
	 * 
	 * 
	 * -> Hexadecimal values can be assigned to int and double variables
	 * 
	 */

	
	/* 
	 * Default initialization values by type
	 * 
	 * Variable type 								Default initialization value
	 * boolean 										false
	 * byte, short, int, long 						0 (in the type’s bit-length)
	 * float, double 								0.0 (in the type’s bit-length)
	 * char 										'\u0000' (NUL)
	 * All object references (everything else) 		null
	 */
	
	
	/*
	 * Declaring Multiple variables
	 * 
	 * int i1, i2, i3 = 0;
	 * As you should expect, three variables were declared: i1, i2, and i3. However, only one
	 * of those values was initialized: i3. The other two remain declared but not yet initialized.
	 * That’s the trick. Each snippet separated by a comma is a little declaration of its own. The
	 * initialization of i3 only applies to i3. It doesn’t have anything to do with i1 or i2 despite
	 * being in the same statement.
	 * 
	 * Another way the exam could try to trick you is to show you code like this line:
	 * int num, String value; // DOES NOT COMPILE
	 * This code doesn’t compile because it tries to declare multiple variables of different types
	 * in the same statement. 
	 * 
	 */
	
	
	/*
	 * Variable scope
	 * 
	 * Let’s review the rules on scope:
	 * ■ Local variables —> in scope from declaration to end of block
	 * ■ Instance variables —> in scope from declaration until object garbage collected
	 * ■ Class variables —> in scope from declaration until program ends
	 */
	
	/*
	 * Importing
	 * 
	 * If two classes is in the same package, is not need to import one of them.
	 * It means:
	 * 
	 * package x
	 * class A
	 * class B
	 * 
	 * class B has a class A object. so, there is no need to import class A 
	 * because both is in the same package!
	 * 
	 * ------------------------------------------------------------------------------------
	 * 
	 * Importing by classname takes precedence over wildcard. So:
	 * 
	 * Assume packages "x" and "y". Both has MyClass.java
	 * 
	 * import x.*;
	 * import x.y.MyClass;
	 * 
	 * It is ok! x.y.MyClass will be imported instead of x.MyClass in order to wildcard "*"
	 * 
	 */
	
	/*
	 * Garbage Collector
	 * 
	 * - The GC might or might not run
	 * - The finalize method will be called when object is garbage collected. So, it might or might not run.
	 */
	
	/*
	 * Exam Essentials
	 * 
	 * Be able to write code using a main() method. A main() method is usually written as public
	 * static void main(String[] args). Arguments are referenced starting with args[0]. Accessing
	 * an argument that wasn’t passed in will cause the code to throw an exception.
	 * 
	 * Understand the effect of using packages and imports. Packages contain Java classes.
	 * Classes can be imported by class name or wildcard. Wildcards do not look at subdirectories. 
	 * In the event of a conflict, class name imports take precedence.
	 * 
	 * Be able to recognize a constructor. A constructor has the same name as the class. It looks
	 * like a method without a return type
	 * 
	 * Be able to identify legal and illegal declarations and initialization. Multiple variables can
	 * be declared and initialized in the same statement when they share a type. Local variables
	 * require an explicit initialization; others use the default value for that type. Identifiers may
	 * contain letters, numbers, $, or _. Identifiers may not begin with numbers. Numeric literals
	 * may contain underscores between two digits and begin with 1–9, 0, 0x, 0X, 0b, and 0B.
	 * 
	 * Be able to determine where variables go into and out of scope. All variables go into scope
	 * when they are declared. Local variables go out of scope when the block they are declared
	 * in ends. Instance variables go out of scope when the object is garbage collected. 
	 * Class variables remain in scope as long as the program is running.
	 * 
	 * Be able to recognize misplaced statements in a class. Package and import statements are
	 * optional. If present, both go before the class declaration in that order. Fields and methods
	 * are also optional and are allowed in any order within the class declaration.
	 * 
	 * Know how to identify when an object is eligible for garbage collection. Draw a diagram
	 * to keep track of references and objects as you trace the code. When no arrows point to a
	 * box (object), it is eligible for garbage collection.
	 */

}
