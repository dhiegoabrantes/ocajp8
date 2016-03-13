package ocajp8.chapter1.questions.q07.employee;

import ocajp8.chapter1.questions.q07.aquarium.*;

//import ocajp8.chapter1.questions.q7.aquarium.Water;
//import ocajp8.chapter1.questions.q7.aquarium.jellies.*;

//import ocajp8.chapter1.questions.q7.aquarium.*;
//import ocajp8.chapter1.questions.q7.aquarium.jellies.Water;

//import ocajp8.chapter1.questions.q7.aquarium.*;
//import ocajp8.chapter1.questions.q7.aquarium.jellies.*;

//import ocajp8.chapter1.questions.q7.aquarium.Water;
//import ocajp8.chapter1.questions.q7.aquarium.jellies.Water;

public class WaterFiller {
	Water water;
}

/*
 * Given the following classes, which of the following snippets can be inserted
 * in place of INSERT IMPORTS HERE and have the code compile? (Choose all that
 * apply)
 */

// --> wildcard (*) possui menos prioridade. 
// --> apesar de Water existir em ambos os pacotes, o import explícito da classe possui maior prioridade!

//A. 	import aquarium.*; (compila normalmente)

//B. 	import aquarium.Water; 		(compila normalmente, mas gera warning. o segundo import não é utilizado)
//		import aquarium.jellies.*;	

//C. 	import aquarium.*; 			(compila normalmente, mas gera warning. o primeiro import não é utilizado)
//		import aquarium.jellies.Water;

//D. 	import aquarium.*; (erro de compilação, gera ambiguidade)
//		import aquarium.jellies.*;

//E. 	import aquarium.Water; (erro de compilação, gera ambiguidade)
//		import aquarium.jellies.Water;

//F. None of these imports can make the code compile.




/*
 * 7. A, B, C. Option A is correct because it imports all the classes in the
 * aquarium package including aquarium.Water. Options B and C are correct
 * because they import Water by classname. Since importing by classname takes
 * precedence over wildcards, these com- pile. Option D is incorrect because
 * Java doesn’t know which of the two wildcard Waterclasses to use. Option E is
 * incorrect because you cannot specify the same classname in two imports.
 */