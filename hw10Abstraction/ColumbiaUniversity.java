package hw10Abstraction;

/*
 * Two keywords- "Extends" and "Implements" are used for the inheritance in a regular class
 * A regular class can inherit another regular class or Abstract class by using "extends" keyword
 * A regular class can't inherit another regular class or Abstract class by using  "implements" keyword
 * A regular class can inherit more than One Interfaces by using "implements" keyword
 * A regular class can't inherit Interfaces by using "extends" keyword
 * More than one inheritances are possible by a regular class
 */
public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {

	// Abstract method not possible in the regular class, ColumbiaUniversity is a
	// regular class so it's not possible.
	// Abstract methods can only be created in abstract classes or interfaces.
	// public abstract void chemistry();
	public void biology() {
		System.out.println("this is from biology");

	}

	public ColumbiaUniversity() {
		// it's possible to create default constructor in the regular class.
		// this is a default constructor and default constuctors has no argument.
	}

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub

	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dorm() {
		// TODO Auto-generated method stub

	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub

	}

	@Override
	public void morgue() {
		// TODO Auto-generated method stub

	}

	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub

	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub

	}

	@Override
	public void gymnasium() {
		// TODO Auto-generated method stub

	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub

	}

}