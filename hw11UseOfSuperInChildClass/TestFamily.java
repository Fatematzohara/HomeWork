package hw11UseOfSuperInChildClass;

public class TestFamily {
	public static void main(String[] args) {

		// Default constructor initialized here
		Father father = new Father();

		System.out.println("----------------------");

		// Parameterized Constructor initialized here
		Father father2 = new Father("Seen", 50, 'F', false);

		System.out.println("--------------------------");

		// Void type method initialized here
		father2.father();

		System.out.println("----------------------------");

		// parameterized method initialized here
		father2.fatherInfo("John", 100, 'F', true);

		System.out.println("Default constructor Intialized from the Daughter class");
		// Default constructor initialized here
		Daughter daughter = new Daughter();
		System.out.println("Parameterized constructor initialized from the Daughter class");

		// Parameterized Constructor initialized here
		Daughter daughter2 = new Daughter("January", 50);

		System.out.println("Void type method initialized from the Daughter class");

		// Void type method initialized here
		daughter2.daughter();

		System.out.println("Prameterized type method initialized from the Daughter class");
		// parameterized method initialized
		daughter2.daughterInfo("December", 31);

	}

}
