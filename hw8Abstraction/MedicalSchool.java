package hw8Abstraction;

public abstract class MedicalSchool {

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("this is from non abstract method biochemistryLab");
	}

	public MedicalSchool() {
		System.out.println("This is all from default constructor");
		// we can make default constructor in abstract class
	}

}
