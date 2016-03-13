package ocajp8.chapter1.questions.q06.aquarium;

//import java.lang.*;
//import java.lang.System;
//import ocajp8.chapter1.questions.q6.aquarium.Water;
//import ocajp8.chapter1.questions.q6.aquarium.*;

public class Tank {
	public void print(Water water) {
		System.out.println(water);
	}
}

/*
 * Given the following classes, what is the maximum number of imports that can
 * be removed and have the code still compile?
 */

//A. 0
//B. 1
//C. 2
//D. 3
//E. 4
//F. Does not compile.


/*
 * Letra E é a correta.
 * 
 * import java.lang pode ser removido pois é um import implícito 
 * import java.lang.System pode ser removido pois java.lang é um import implícito
 * import ocajp8.chapter1.questions.q6.aquarium.Water pode ser removido pois ambas as classes estão no mesmo pacote
 * import ocajp8.chapter1.questions.q6.aquarium.* pode ser removido pois ambas as classes estão no mesmo pacote
 * 
 */

/*
 * 6. E. The first two imports can be removed because java.lang is automatically
 * imported. The second two imports can be removed because Tank and Water are in
 * the same pack- age, making the correct answer E. If Tank and Water were in
 * different packages, one of these two imports could be removed. In that case,
 * the answer would be option D.
 */
 
