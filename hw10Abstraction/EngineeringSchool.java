package hw10Abstraction;

public abstract class EngineeringSchool {

	public abstract void mechanicalLab();

	public void computerLab() {
		System.out.println("this is from non abstract method computerLab");
	}
}
