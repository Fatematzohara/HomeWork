package hw14Abstraction;

public class RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool {
	public void maths() {
		System.out.println("this is from non abstract method maths");
	}

	@Override
	public void aeronauticalInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void mechanicalLab() {
		// TODO Auto-generated method stub

	}
}
