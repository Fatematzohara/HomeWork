package hw13Polymorphism;

public class TestFamily {
	public static void main(String[] args) {
		System.out.println("-------- Sister --------");
		Sister sis = new Sister();
		sis.sister();// void type method(1) initialized
		sis.sister(23, 26);// void type parameterized method(2) initialized
		sis.sister(23, 54, 33);// return type parameterized method(3)initialized
		sis.sister(23, 44, "45");// return type parameterized method (4) initialized
		sis.sister(23, "46", 33);// Return type parameterized method (5) initialized
		Sister.sister("44", 34, 88);// Static type Method (6) initialized

		System.out.println("\n-------- Niece --------");
		Niece nie = new Niece();
		nie.sister();// void type method(1) initialized
		nie.sister(23, 26);// void type parameterized method(2) initialized
		nie.sister(23, 54, 33);// return type parameterized method(3)initialized
		nie.sister(23, 44, "45");// return type parameterized method (4) initialized
		nie.sister(23, "46", 33);// Return type parameterized method (5) initialized

	}
}
