package ocajp8.chapter2.tips;

public class Tips {

	
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
	 * Other unary operators				+, -, ! (indicates positive value, negativa value, not value)
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
	 * for statement
	 * 
	 * You MUST AVOID Using Incompatible Data Types in the Initialization Block
	 */
	
	
	
	public static void main(String[] args) {
		
//		System.out.println(PI);
		
//		int x = 4;
//		long y = 2 * 4 - x++;
		
//		System.out.println(x);
//		System.out.println(y);
		
	}
}
