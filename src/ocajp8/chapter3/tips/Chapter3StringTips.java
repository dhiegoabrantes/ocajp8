package ocajp8.chapter3.tips;

public class Chapter3StringTips {

	/*
	 * STRING
	 * 
	 * In Java, these two snippets both create a String:
	 * 	String name = "Fluffy"; (use string pool)
	 * 	String name = new String("Fluffy"); (force new string creation, without use of string pool)
	 * 
	 * -> String is a sequence of characters and Java counts from 0 when indexed.
	 * 
	 * - Concatenation
	 * 1. If both operands are numeric, + means numeric addition.
	 * 2. If either operand is a String, + means concatenation.
	 * 3. The expression is evaluated left to right.
	 * 
	 * Now let’s look at some examples:
	 * 	System.out.println(1 + 2); // 3
	 * 	System.out.println("a" + "b"); // ab
	 * 	System.out.println("a" + "b" + 3); // ab3
	 * System.out.println(1 + 2 + "c"); // 3c
	 * 
	 * 
	 * - Immutability
	 * 	String is immutable. Any change you do in a String, a new String object will be implicitly created.
	 * 
	 * 	String s1 = "1";
	 * 	String s2 = s1.concat("2");
	 * 	s2.concat("3");
	 * 	System.out.println(s2);
	 * 
	 * 	//prints 12
	 * 
	 * The concat() is executed and the new String is returned. The current string is not changed!
	 * 
	 * 
	 * - Important String Methods
	 * 
	 * . length()
	 * 		The method length() returns the number of characters in the String.
	 * 
	 * 		Signature: int length()
	 * 		
	 * 		String string = "animals";
	 * 		System.out.println(string.length()); // 7
	 * 
	 * . charAt()
	 * 		The method charAt() lets you query the string to find out what character is at a specific index.
	 * 
	 * 		Signature: char charAt(int index)
	 * 
	 * 		String string = "animals";
	 * 		System.out.println(string.charAt(0)); // a
	 * 		System.out.println(string.charAt(6)); // s
	 * 		System.out.println(string.charAt(7)); // throws exception -> java.lang.StringIndexOutOfBoundsException: String index out of range: 7
	 * 
	 * . indexOf()
	 * 		The method indexOf()looks at the characters in the string and finds the first index that matches the desired value.
	 * 		Unlike charAt(), the indexOf() method doesn’t throw an exception if it can’t find a match. indexOf() returns –1 when no match is found.
	 * 
	 * 		Signature:
	 * 			int indexOf(char ch)
	 * 			int indexOf(char ch, index fromIndex)
	 * 			int indexOf(String str)
	 * 			int indexOf(String str, index fromIndex)
	 * 
	 * 		String string = "animals";
	 * 		System.out.println(string.indexOf('a')); // 0
	 * 		System.out.println(string.indexOf("al")); // 4
	 * 		System.out.println(string.indexOf('a', 4)); // 4
	 * 		System.out.println(string.indexOf("al", 5)); // -1
	 * 
	 * . substring()
	 * 		The method substring() also looks for characters in a string. It returns parts of the string.
	 * 		The first parameter is the index to start with for the returned string. As usual, this is a 
	 * 		zero-based index. There is an optional second parameter, which is the end index you want to stop at.
	 * 		
	 * 		Notice we said “stop at” rather than “include.” The end-index is not included!!!
	 * 
	 * 		Signature:
	 * 			int substring(int beginIndex)
	 * 			int substring(int beginIndex, int endIndex)
	 * 
	 * 		String string = "animals";
	 * 		System.out.println(string.substring(3)); // mals
	 * 		System.out.println(string.substring(string.indexOf('m'))); // mals
	 * 		System.out.println(string.substring(3, 4)); // m
	 * 		System.out.println(string.substring(3, 7)); // mals
	 * 
	 * 		System.out.println(string.substring(3, 3)); // empty string
	 * 		System.out.println(string.substring(3, 2)); // throws exception
	 * 		System.out.println(string.substring(3, 8)); // throws exception
	 * 
	 * 
	 * . toLowerCase() and toUpperCase()
	 * 		Signature:
	 * 			String toLowerCase(String str)
	 * 			String toUpperCase(String str)
	 * 
	 * 		String string = "animals";
	 * 		System.out.println(string.toUpperCase()); // ANIMALS
	 * 		System.out.println("Abc123".toLowerCase()); // abc123
	 * 
	 * 	Also, remember that strings are immutable, so the original string stays the same.
	 * 
	 * 
	 * . equals() and equalsIgnoreCase()
	 * 		The equals() method checks whether two String objects contain exactly the same characters in the same order. 
	 * 		The equalsIgnoreCase() method checks whether two String objects contain the same characters with the exception that it will 
	 * 		convert the characters’ case if needed. The method signatures are as follows:
	 * 
	 * 		Signature:
	 * 			boolean equals(String str)
	 * 			boolean equalsIgnoreCase(String str)
	 * 
	 * 		System.out.println("abc".equals("ABC")); // false
	 * 		System.out.println("ABC".equals("ABC")); // true
	 * 		System.out.println("abc".equalsIgnoreCase("ABC")); // true
	 * 
	 * 
	 * . startsWith() and endsWith()
	 * 		Signature:
	 * 			boolean startsWith(String prefix)
	 * 			boolean endsWith(String suffix)
	 * 
	 * 		System.out.println("abc".startsWith("a")); // true
	 * 		System.out.println("abc".startsWith("A")); // false
	 * 		System.out.println("abc".endsWith("c")); // true
	 * 		System.out.println("abc".endsWith("a")); // false
	 * 
	 * 	Again, nothing surprising here. Java is doing a case-sensitive check on the values provided.
	 * 
	 * 
	 * . contains()
	 * 		The contains() method also looks for matches in the String. It isn’t as particular as startsWith() and endsWith(). 
	 * 		- The match can be anywhere in the String
	 * 
	 * 		Signature:
	 * 			boolean contains(String str)
	 * 
	 * 		System.out.println("abc".contains("b")); // true
	 * 		System.out.println("abc".contains("B")); // false
	 * 
	 *  The contains() method is a convenience method so you don’t have to write str.indexOf(otherString) != -1.
	 *  	if(str.contains(otherString)){} //the same of above!
	 *  	if(str.indexOf(otherString) != -1){}
	 *  
	 *  
	 *  . replace()
	 *  	The replace() method does a simple search and replace on the string. 
	 *  	There’s a version that takes char parameters as well as a version that takes CharSequence parameters.
	 *  
	 *  	- A CharSequence is a general way of representing several classes, including String and StringBuilder.
	 *  
	 *  	Signature:
	 *  		String replace(char oldChar, char newChar)
	 *  		String replace(CharSequence oldChar, CharSequence newChar)
	 *  		
	 *  	System.out.println("abcabc".replace('a', 'A')); // AbcAbc
	 *  	System.out.println("abcabc".replace("a", "A")); // AbcAbc
	 *  
	 *  	- Remember: String is immutable! The replace()  will not change the original string!
	 *  
	 *  
	 *  . trim()
	 *  	The trim() method removes whitespace from the beginning and end of a String. 
	 *  	In terms of the exam, whitespace consists of spaces along with:
	 *  		 	the \t (tab) and
	 *  			\n (newline) characters. 
	 *  			\r (carriage return)
	 *  
	 *  	Signature:
	 *  		public String trim()
	 *  
	 *  	System.out.println("abc".trim()); // abc
	 *  	System.out.println("\t a b c\n".trim()); // a b c
	 *  
	 */
	
	
	/*
	 * STRING BUILDER
	 * 
	 * 	The StringBuilder class creates a String without storing all those interim String values. Unlike the String class, StringBuilder is not immutable.
	 * 
	 * 
	 * . Mutability and Chaining
	 * 		- The exam will likely try to trick you with respect to String and StringBuilder being mutable.
	 * 		
	 * 		Chaining makes this even more interesting! 
	 * 
	 * 		When we chained String method calls, the result was a new String with the answer. 
	 * 		Chaining StringBuilder objects doesn’t work this way. Instead, the StringBuilder changes its own state and returns a reference to itself!
	 * 
	 * 		4: StringBuilder sb = new StringBuilder("start");
	 * 		5: sb.append("+middle"); // sb = "start+middle"
	 * 		6: StringBuilder same = sb.append("+end"); // "start+middle+end"
	 * 
	 * 		4: StringBuilder a = new StringBuilder("abc");
	 * 		5: StringBuilder b = a.append("de");
	 * 		6: b = b.append("f").append("g");
	 * 		7: System.out.println("a=" + a);
	 * 		8: System.out.println("b=" + b);
	 * 		//both prints abcdefg! Note the we have just one "new" statement
	 * 
	 * 
	 * - Important StringBuilder Methods
	 * 
	 * 	. charAt(), indexOf(), length(), and substring()
	 * 		These four methods work exactly the same as in the String class.
	 * 
	 * 		StringBuilder sb = new StringBuilder("animals");
	 * 		String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al")); //sb.substring(0, 4)
	 * 		int len = sb.length();
	 * 		char ch = sb.charAt(6);
	 * 		System.out.println(sub + " " + len + " " + ch);
	 * 		//prints "anim 7 s".
	 * 
	 *  
	 *  . append()
	 *  	Adds the parameter to the StringBuilder and returns a reference to the current StringBuilder. 
	 *  
	 *  	One of the method signatures is as follows:
	 *  		StringBuilder append(String str)
	 *  
	 *  	Notice that we said one of the method signatures. 
	 *  	There are more than 10 method signatures that look similar but that take different data types as parameters.
	 *  
	 *   	StringBuilder sb = new StringBuilder().append(1).append('c');
	 *   	sb.append("-").append(true);
	 *   	System.out.println(sb); // 1c-true
	 *   
	 *   
	 *   . insert()
	 * 		The insert() method adds characters to the StringBuilder at the requested index and 
	 * 		returns a reference to the current StringBuilder. Just like append(), there are lots of
	 * 		method signatures for different types. Here’s one:
	 * 		
	 * 		StringBuilder insert(int offset, String str)
	 * 
	 * 		3: StringBuilder sb = new StringBuilder("animals");
	 * 		4: sb.insert(7, "-"); // sb = animals-
	 * 		5: sb.insert(0, "-"); // sb = -animals-
	 * 		6: sb.insert(4, "-"); // sb = -ani-mals
	 * 
	 * 		- The exam creators will try to trip you up on this. As we add and remove characters, their indexes change.
	 * 
	 * 
	 * 	- When use append or insert, the new capacity is ensured:
     * 		//This implements the expansion semantics of ensureCapacity with no size check or synchronization.
     * 
     *		void expandCapacity(int minimumCapacity) {
     *			int newCapacity = value.length * 2 + 2;    <---- the actual size is multiplied by 2 and added 2
     *			if (newCapacity - minimumCapacity < 0)
     *				newCapacity = minimumCapacity;
     *			if (newCapacity < 0) {
     *				if (minimumCapacity < 0) // overflow
     *					throw new OutOfMemoryError();
     *				newCapacity = Integer.MAX_VALUE;
     *			}
     *			value = Arrays.copyOf(value, newCapacity);
     *		}
	 * 
	 *  
	 *  . delete() and deleteCharAt()
	 *  	The delete() method is the opposite of the insert() method. 
	 *  	It removes characters from the sequence and returns a reference to the current StringBuilder. 
	 *  	The deleteCharAt() method is convenient when you want to delete only one character. 
	 *  
	 *  	Signatures: 
	 *  		StringBuilder delete(int start, int end)
	 *  		StringBuilder deleteCharAt(int index)
	 *  
	 *  	- The end index is NOT INCLUDED!
	 *  
	 *  	StringBuilder sb = new StringBuilder("abcdef");
	 *  	sb.delete(1, 3); // sb = adef
	 *  	sb.deleteCharAt(5); // throws an exception
	 *  
	 *  
	 *  . reverse()
	 *  	The reverse() method does just what it sounds like: it reverses the characters in the sequences and returns a reference to the current StringBuilder. 
	 *  
	 *  	Signature:
	 *  		StringBuilder reverse()
	 *  
	 *  	StringBuilder sb = new StringBuilder("ABC");
	 *  	sb.reverse();
	 *  	System.out.println(sb); //prints CBA
	 *  
	 *  
	 *  . toString()
	 *  	Converts a StringBuilder into a String
	 *  
	 *  	Signature:
	 *  		String toString()
	 *  
	 */

	/*
	 * EQUALITY
	 * 
	 * 	Remember that Strings are immutable and literals are pooled. 
	 * 	The JVM created only one literal in memory. x and y both point to the same location in memory
	 * 		String x = "Hello World";
	 * 		String y = "Hello World";
	 * 		System.out.println(x == y); // true
	 * 
	 * 	In this example (above), we don’t have two of the same String literal. 
	 * 	Although x and z happen to evaluate to the same string, one is computed at runtime. 
	 * 	Since it isn’t the same at compile-time, a new String object is created. <-----
	 * 		String x = "Hello World";
	 * 		String z = " Hello World".trim();
	 * 		System.out.println(x == z); // false
	 */
	
	/*
	 * Autoboxing
	 * 
	 * When you is using lists, in case of remove method, the java will use autoboxing only if
	 * you force it.
	 * 
	 * list.add(10);
	 * list.add(20);
	 * list.add(1);
	 * 
	 * list.remove(1) will remove the element index 1 instead the number "1".
	 * after this command, the list will be "[10, 1]"
	 * 
	 * 
	 */
	
	/*
	 * LocalDate, LocalTime, LocalDateTime
	 * 
	 *  The date and time classes are immutable, just like String was.
	 *  This means that we need to remember to assign the results of these methods to a reference 
	 *  variable so they are not lost.
	 */
	
	public static void main(String[] args) {

		String s = "Hello";
		String t = new String(s);
		if ("Hello".equals(s)) System.out.println("one"); //will be printed
		if (t == s) System.out.println("two"); 
		if (t.equals(s)) System.out.println("three"); //will be printed
		if ("Hello" == s) System.out.println("four"); //will be printed
		if ("Hello" == t) System.out.println("five");
		
	}

}
