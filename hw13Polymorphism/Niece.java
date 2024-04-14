package hw13Polymorphism;

/*When different methods exist with the same method name with
 *  same parameters or signature but with different syntax or logic, it is called method overriding.
 */
public class Niece extends Sister {

	// void type non parameterized method (1) is implemented
	@Override
	public void sister() {
		System.out.println("This is void type method from Niece");
		System.out.println("Method name is same from the parent, but syntax or logic is changed in the method body");
	}

	// void type parameterized method (2) implemented
	@Override
	public void sister(int age1, int age2) {
		int total1 = age1 + age2 + 30;
		System.out.println("Total age: " + total1);
	}

	// return type parameterized method(3) implemented
	@Override

	public int sister(int age1, int age2, int age3) {
		int total2 = age1 + age2 / 34 + age3 * 30 + 40;
		System.out.println("Total age: " + total2);
		return total2;

	}

	// return type parameterized method (4) implemented with different parameter
	// type
	@Override

	public int sister(int age1, int age2, String age4) {
		int total3 = age1 + age2 / 45 + Integer.parseInt(age4);
		System.out.println("Total age: " + total3);
		return total3;
	}

	/*
	 * // Return type parameterized method (5) which is final type and implemented
	 * 
	 * Final type method cannot be Overriden Cannot override the final method from
	 * Sister Final keyword doesn't allow any change in method, variable, class
	 * 
	 * @Override public final int sister(int age2, String age4, int age5) { int
	 * total4 = age2 + age5 + Integer.parseInt(age4);
	 * System.out.println("Total age: " + total4); return total4; }
	 */

	/*
	 * // This below method - sister can't override or implemented // because static
	 * is a local member method of a class // So, static method can't be override,
	 * if we remove @override it will work as // it is considered as the static
	 * method of this niece class
	 * 
	 * @Override // Static type Method (6) implemented public static void
	 * sister(String age4, int age5, int age6) { int total5 = Integer.parseInt(age4)
	 * + age5 + age6; System.out.println("Total age: " + total5); }
	 */

}
