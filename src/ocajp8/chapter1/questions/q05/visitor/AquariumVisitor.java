package ocajp8.chapter1.questions.q05.visitor;

import ocajp8.chapter1.questions.q05.aquarium.jellies.Jelly;

//INSERT IMPORTS HERE
public class AquariumVisitor {

	public void admire(Jelly jelly) { }
	
}


/*
 * Given the following classes, which of the following can independently
 * replace INSERT IMPORTS HERE to make the code compile? (Choose all that apply) 
 */

//A. import aquarium.*;
//B. import aquarium.*.Jelly;
//C. import aquarium.jellies.Jelly; (ok)
//D. import aquarium.jellies.*; (ok)
//E. import aquarium.jellies.Jelly.*;
//F. None of these can make the code compile.


/*
 * C, D. Option C is correct because it imports Jelly by classname. Option D is
 * cor- rect because it imports all the classes in the jellies package, which
 * includes Jelly. Option A is incorrect because it only imports classes in the
 * aquarium package—Tank in this case—and not those in lower-level packages.
 * Option B is incorrect because you cannot use wildcards anyplace other than
 * the end of an import statement. Option E is incorrect because you cannot
 * import parts of a class with a regular import statement. Option F is
 * incorrect because options C and D do make the code compile.
 */