package hw8Abstraction;

public abstract class MedicalSchool {

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("this is from non abstract method biochemistryLab");
	}

//public default void school() {
//
//	System.out.println("This is all from default constructor");}
//}
//we cannot create a default constructor in abstract class
// Default constructors are allowed only in interfaces, not in abstract class
}