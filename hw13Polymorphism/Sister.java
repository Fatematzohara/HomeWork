package hw13Polymorphism;

/*when several methods stay with the same name
*but with different parameters or signature
*that's called Method  of Overloading
*/
public class Sister {

	// void type method(1) implemented
	public void sister() {
		System.out.println("This is void type method from Sister");
	}

	// void type parameterized method(2) implemented
	public void sister(int age1, int age2) {
		int total1 = age1 + age2;
		System.out.println("Total age: " + total1);
	}

	// return type parameterized method(3) implemented
	public int sister(int age1, int age2, int age3) {
		int total2 = age1 + age2 + age3;
		System.out.println("Total age: " + total2);
		return total2;

	}

	// return type parameterized method (4) implemented with different parameter
	// type
	public int sister(int age1, int age2, String age4) {
		int total3 = age1 + age2 + Integer.parseInt(age4);
		System.out.println("Total age: " + total3);
		return total3;
	}

	// Return type parameterized method (5) which is final type and implemented
	public final int sister(int age2, String age4, int age5) {
		int total4 = age2 + age5 + Integer.parseInt(age4);
		System.out.println("Total age: " + total4);
		return total4;
	}

	// Static type Method (6) implemented
	public static void sister(String age4, int age5, int age6) {
		int total5 = Integer.parseInt(age4) + age5 + age6;
		System.out.println("Total age: " + total5);
	}

}
