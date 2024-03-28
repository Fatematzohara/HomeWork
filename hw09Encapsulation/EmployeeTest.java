package hw09Encapsulation;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Fatematuz Zohara");
		employee.setAge(24);
		employee.setSex('F');
		employee.setCitizen(false);

		System.out.println("Employee Name: " + employee.getName() + "\nEmployee Age: " + employee.getAge()
				+ "\nGender: " + employee.getSex() + "\nCitizen ? : " + employee.getCitizen());
	}

}
