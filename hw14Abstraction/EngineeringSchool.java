package hw14Abstraction;

public abstract class EngineeringSchool extends NYUniversity {

	public abstract void mechanicalLab();

	public void computerLab() {
		System.out.println("this is from non abstract method computerLab");
	}
}
