package hw4Constructor;

public class Student {

	public String stName;
	public int stID;
	public char Gender;
	public boolean isProgrammer;
	public float grade;

	public Student() {

		System.out.println("This is all about Student");
	}

	public Student(String stName, Integer stID, char gender, boolean isProgrammer, float grade) {
		super();
		this.stName = stName;
		this.stID = stID;
		Gender = gender;
		this.isProgrammer = isProgrammer;
		this.grade = grade;
		System.out.println("Student Name:" + stName + ", ID: " + stID + ", Gender:" + gender + " , Grade: " + grade
				+ " and Java Programmer? Ans: " + isProgrammer + ".");
	}

}
