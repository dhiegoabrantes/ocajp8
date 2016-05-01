package ocajp8.chapter2.tips;

public class Chapter2Tips {

	
	/*
	 * Operators
	 * 
	 * Unless overridden with parentheses, Java operators follow order of
	 * operation, listed in Table 2.1, by decreasing order of operator
	 * precedence. If two operators have the same level of precedence, 
	 * then Java guarantees left-to-right evaluation
	 * 
	 * (higher level to minor level...)
	 * 
	 * Operator								Symbols and examples
	 * Post-unary operators					expression++, expression--
	 * Pre-unary operators					++expression, --expression
	 * Other unary operators				+, -, ! (indicates positive value, negative value, not value)
	 * Multiplication/Division/Modulus		*, /, %
	 * Addition/Subtraction					+, -
	 * Shift operators						<<, >>, >>>
	 * Relational operators					<, >, <=, >=, instanceof
	 * Equal to/not equal to				==, !=
	 * Logical operators					&, ^, |
	 * Short-circuit logical operators		&&, ||
	 * Ternary operators					boolean expression ? expression1 : expression2
	 * Assignment operators					=, +=, -=, *=, /=, %=, &=, ^=, !=, <<=, >>=, >>>=
	 * 
	 */
	
	/*
	 * All of the arithmetic operators may be applied to any Java primitives,
	 * except boolean and String. Furthermore, only the addition operators + and
	 * += may be applied to String values, which results in String
	 * concatenation.
	 */
	
	
	/*
	 * Numeric Promotion Rules
	 * 
	 * 1. If two values have different data types, Java will automatically
	 * promote one of the values to the larger of the two data types. 
	 * 
	 * 2. If one of the values is integral and the other is floating-point, Java will
	 * automatically promote the integral value to the floating-point value’s
	 * data type.
	 * 
	 * 3. Smaller data types, namely byte, short, and char, are first promoted to int 
	 * any time they’re used with a Java binary arithmetic operator, even if neither 
	 * of the operands is int.
	 * 
	 * 4. After all promotion has occurred and the operands have the same data type, 
	 * the result- ing value will have the same data type as its promoted operands.
	 * 
	 * 
	 * What is the data type of x * y / z?
	 * 	short x = 14;
	 * 	float y = 13;
	 * 	double z = 30;
	 * 
	 * 
	 * In this case, we must apply all of the rules. First, x will automatically be promoted to
	 * int solely because it is a short and it is being used in an arithmetic binary operation.
	 * 
	 * The promoted x value will then be automatically promoted to a float so that it can be
	 * multiplied with y. The result of x * y will then be automatically promoted to a double,
	 * so that it can be multiplied with z, resulting in a double value.
	 */
	
	/*
	 * Casting Values
	 * 
	 * short x = 10;
	 * short y = 3;
	 * short z = x * y; // DOES NOT COMPILE
	 * 
	 * The code will not compile because operation involving short result in a int value. And, int value cannot be
	 * assigned to short variable
	 * 
	 * To solve it, we can explicitly cast:
	 * 
	 * short z = (short)(x * y); 
	 */
	
	
	/*
	 * Compound Assignment Operator
	 * 
	 *  long x = 10;
	 *  int y = 5;
	 *  y = y * x; // DOES NOT COMPILE
	 *  
	 *  The code will not compile because an operation between long and int values will result a long value.
	 *  If we try to assign the result (long) to y (int) we'll got an compile error.
	 *  
	 *  To solve this problem we can use a explicitly cast to int or use a compound operator
	 *  	y = (int) (y * x);
	 *  or	y *= x;
	 *  
	 *  When we use the compound operator, the compiler implicitly casts y to long, perform multiplication, and then, 
	 *  cast result to int to assign it to y.
	 *  
	 *  One final thing to know about the assignment operator is that the result of the assignment 
	 *  is an expression in and of itself, equal to the value of the assignment. For example, the
	 *  following snippet of code is perfectly valid, if not a little odd looking:
	 *  	long x = 5;
	 *  	long y = (x=3);
	 *  	System.out.println(x); // Outputs 3
	 *  	System.out.println(y); // Also, outputs 3
	 */
	
	
	/*
	 * Logical Operator
	 * 
	 * The logical operators, (&), (|), and (^), may be applied to both numeric and boolean data types. 
	 * When they’re applied to boolean data types, they’re referred to as logical operators.
	 * 
	 * Alternatively, when they’re applied to numeric data types, they’re referred to as bitwise
	 * operators, as they perform bitwise comparisons of the bits that compose the number.
	 * 
	 * ■ (&) AND is only true if both operands are true.
	 * ■ (|) Inclusive OR is only false if both operands are false.
	 * ■ (^) Exclusive OR is only true if the operands are different.
	 */
	
	
	/*
	 * SWITCH statement
	 * 
	 * Supported data types
	 * ■ int and Integer
	 * ■ byte and Byte
	 * ■ short and Short
	 * ■ char and Character
	 * ■ int and Integer
	 * ■ String
	 * ■ enum values
	 * 
	 * Compile-time constant values
	 * 	The values in each case statement must be compile-time constant values of the same data
	 * 	type as the switch value. This means you can use only literals, enum constants, or final
	 * 	constant variables of the same data type. By final constant, we mean that the variable
	 * 	must be marked with the final modifier and [initialized with a literal value in the same
	 * 	expression in which it is declared].
	 * 
	 * 	In the case statement is possible to math operations/concatenation values with the constants:
	 * 
	 * 	final int x = 20;
	 * 
	 * 	case x + 2:
	 * 		break;
	 */
	
	/*
	 * FOR statement
	 * 
	 * for(initialization; booleanExpression; updateStatement){
	 *	...
	 * }
	 * 
	 * - For FLOW
	 * 		1 Initialization statement executes
	 * 		2 If booleanExpression is true continue, else exit loop
	 * 		3 Body executes
	 * 		4 Execute updateStatements
	 * 		5 Return to Step 2
	 * 
	 * 
	 * - Redeclaring variables
	 * 
	 * 	int x = 0;
	 * 	for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) { // DOES NOT COMPILE
	 * 		System.out.print(x + " ");
	 * 	}
	 * 
	 * The variable "x" is already declared! So, to fix it:
	 * 
	 * 	int x = 0;
	 * 	long y = 10;
	 * 	for(y = 0, x = 4; x < 5 && y < 10; x++, y++) {
	 * 		System.out.print(x + " ");
	 * 	}
	 * 
	 * 
	 * - You MUST AVOID Using Incompatible Data Types in the Initialization Block
	 * 
	 * 	for(long y = 0, int x = 4; x < 5 && y<10; x++, y++) { // DOES NOT COMPILE
	 * 		System.out.print(x + " ");
	 * 	}
	 * 
	 * 
	 * - BREAK statement
	 * 
	 * As you saw when working with switch statements, a break statement transfers the flow
	 * of control out to the enclosing statement. The same holds true for break statements that
	 * appear inside of while, do-while, and for loops, as it will end the loop early.
	 * 
	 * - CONTINUE statement
	 * 
	 * You may notice the syntax of the continue statement mirrors that of the break statement. 
	 * In fact, the statements are similar in how they are used, but with different results.
	 * While the break statement transfers control to the enclosing statement, the continue
	 * statement transfers control to the boolean expression that determines if the loop should
	 * continue. In other words, it ends the current iteration of the loop. Also like the break
	 * statement, the continue statement is applied to the nearest inner loop under execution
	 * using optional label statements to override this behavior.
	 */
	
	
	
	public static void main(String[] args) {
		
		final int x = 20;
		int y = 10;
		switch (y) {
		case x - 2:
			
			break;

		default:
			break;
		}
		
//		System.out.println(PI);
		
//		int x = 4;
//		long y = 2 * 4 - x++;
		
//		System.out.println(x);
//		System.out.println(y);
		
	}
}
