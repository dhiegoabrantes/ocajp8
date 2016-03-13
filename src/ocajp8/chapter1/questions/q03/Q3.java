package ocajp8.chapter1.questions.q03;

public class Q3 {
	// short numPets = 5; //Line 4
	// int numGrains = 5.6; //Line 5
	// String name = "Scruffy"; //Line 6
	// numPets.length(); //Line 7
	// int y = numGrains.length(); //Line 8
	// int x = name.length(); //Line 9
}

// Which of the following are true? (Choose all that apply)
// A. Line 4 generates a compiler error.
// B. Line 5 generates a compiler error. (correct, generates a compiler error)
// C. Line 6 generates a compiler error.
// D. Line 7 generates a compiler error. (correct, generates a compiler error)
// E. Line 8 generates a compiler error. (correct, generates a compiler error)
// F. Line 9 generates a compiler error.
// G. The code compiles as is.

/*
 * O erro pode variar! Se o length() for chamado em um literal sem associar a
 * alguma variável, o compilador "reclama" que é preciso associar. Se o length()
 * for chamado em um literal associando a uma variável, o compilador "raclama"
 * que o length() não pode ser chamado a partir de um tipo primitivo.
 * 
 */

/*
 * 3. B, D, E. Option A (line 4) compiles because short is an integral type.
 * Option B (line 5) generates a compiler error because int is an integral type,
 * but 5.6 is a floating-point type. Option C (line 6) compiles because it is
 * assigned a String. Options D and E (lines 7 and 8) do not compile because
 * short and int are primitives. Primitives do not allow methods to be called on
 * them. Option F (line 9) compiles because length() is defined on String.
 */