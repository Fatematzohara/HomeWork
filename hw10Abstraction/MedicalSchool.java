package hw10Abstraction;

/*
 * We can use "extends" and "Implements" keywords to inherit in the Abstract class
 * An abstract can inherit another abstract class or Regular class by "Extends" keyword
 * An abstract can't inherit another abstract class or Regular class by "Implements" keyword
 * An Abstract class can't inherit Interface by "Extends" keyword
 * An Abstract class can inherit more than One Interface by "Implements" keyword
 * More than one inheritance are possible in Abstract Class.
 */
public abstract class MedicalSchool extends NursingSchool implements LawSchool {
	public abstract void anatomyLab();// Abstract method

	// Non Abstract method
	public void biochemistryLab() {
		System.out.println("this is from non abstract method biochemistryLab");
	}

	public MedicalSchool() {
		System.out.println("This is all from default constructor");
		// we can make default constructor in abstract class
	}

}
