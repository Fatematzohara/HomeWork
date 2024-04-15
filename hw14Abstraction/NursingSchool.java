package hw14Abstraction;

public abstract class NursingSchool extends RockefellerUniversity {

	public abstract void hygiene();

	public void caring() {
		System.out.println("this is from non abstract method caring");
	}
}
