package hw11UseOfSuperInChildClass;

//child class/sub class is Daughter and parent class/super class/base class is Father
public class Daughter extends Father {

	// declared variables
	public String birthMonth;
	public int age;

//declared default constructor
	public Daughter() {
		super();// default constructor called by Super method
		// uses by super keyword are given below
		super.father();// void method
		super.fatherInfo("smith", 39, 'M', true);// parameterized method
		super.name = "smith";
		super.age = 345;
		super.sex = 'M';
		super.usCitizen = true;
		// familyname variable called by Super keyword
		super.familyName = "Musa";
		System.out.println("this is the default Daughter constructor");
	}

//parameterized constructor
	public Daughter(String birthMonth, int age) {

		super("smith", 50, 'M', false);
		super.father();
		super.fatherInfo("smith", 39, 'M', true);// parameterized method
		super.name = "smith";
		super.age = 345;
		super.sex = 'M';
		super.usCitizen = true;
		this.birthMonth = "January";
		this.age = 65;

		System.out.println("Birth month is  :" + birthMonth + " ,Age: " + age);
	}

//Void type method
	public void daughter() {

		// we cannot use Super method inside the child class method
		super.father();
		super.fatherInfo("Mr.", 36, 'M', true);
		super.name = "Dr.smith";
		super.age = 345;
		super.sex = 'M';
		super.usCitizen = true;

		// familyname variable called by Super keyword
		super.familyName = "Musa";

		System.out.println("this is from the void type Daughter method");

	}

//parameterized method
	public void daughterInfo(String birthMonth, int age) {
		super.father();
		super.fatherInfo("Mr.A", 36, 'M', true);
		super.name = "Mr.A";
		super.age = 36;
		super.sex = 'M';
		super.usCitizen = true;
		System.out.println("Birth month is  :" + birthMonth + " ,Age: " + age);

	}

}
