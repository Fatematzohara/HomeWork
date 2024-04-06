package hw11UseOfSuperInChildClass;

public class Father {

	// variables declared
	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;

//default constructor
	public Father() {
		System.out.println("this is the default Father constructor");
	}

	// parameterized constructor
	public Father(String name, int age, char sex, boolean usCitizen) {
//		super();//super method is used in child class
		this.name = "Aftab";
		this.age = 65;
		this.sex = 'M';
		this.usCitizen = false;
		System.out.println(
				"My fathers name is :" + name + " ,Age: " + age + " Sex: " + sex + ", US Citizen? :" + usCitizen);
	}

	// void type mthod
	public void father() {
		System.out.println("this is from the void type father method");

	}

	// parameterized method
	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		System.out.println(
				"My fathers name is :" + name + " ,Age: " + age + " Sex: " + sex + ", US Citizen? :" + usCitizen);

	}
}
